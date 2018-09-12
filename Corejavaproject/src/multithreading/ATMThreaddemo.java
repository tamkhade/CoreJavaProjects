package multithreading;

import java.util.Scanner;


class AccountSync {
	private int bal;
	protected AccountSync(int bal)
	{
		this.bal=bal;
	}
	
	public boolean isbalancesufficient(int withd)
	{
		if(bal>withd)
			return true;
		else
		return false;
	}
	public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println(bal);
		System.out.println("withdraw money is "+amt);
		System.out.println("your current balance is "+bal);		
	}
	
}
class Customer implements Runnable
{
	private String name;
	
	private AccountSync account;
	
	public Customer(AccountSync account,String name)
	{
		this.account=account;
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		synchronized(account)
		{
		System.out.println("Enter your amount "+name);
		int amt=sc.nextInt();
		
		if(account.isbalancesufficient(amt))
		{
			System.out.println(name);
			account.withdraw(amt);
		}else
		{
			
			System.out.println("insufficient balance");	
		}
		}
	}
 }

public class ATMThreaddemo {

	public static void main(String[] args) throws InterruptedException
	{
		AccountSync ac=new AccountSync(1000);
		
		Runnable c=new Customer(ac,"mahesh");
		Customer v=new Customer(ac,"abhay");
		Thread t1 = new Thread(c,"a1");
	    Thread t2 = new Thread(v,"a2");
          t1.start();
	      t2.start();
	 
	}
}

