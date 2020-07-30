

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Banking obj = new Banking("Sagar",101);
            obj.showMenu();
	}
}
	class Banking{
		int balance;
		int previoustransaction;
		String customerName;
		int customerid;
		
		Banking(String cName,int cid){
			customerName = cName;
			customerid = cid;
		}
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance = balance+amount;
			previoustransaction = amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance = balance-amount;
			previoustransaction = -amount;
		}
	}
	void getPrevioustransaction()
	{
		if(previoustransaction>0)
		{
			System.out.println("Previous transaction:"+previoustransaction);
		}
		if(previoustransaction<0)
		{
			System.out.println("Previous transsaction:"+Math.abs(previoustransaction));
		}
	}
	
	void showMenu()
	{
		char option = '\0';
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to banking application");
		System.out.println("Customer name:"+ customerName);
		System.out.println("Customer id:"+customerid);
		System.out.println("Options:");
		System.out.println("\n");
		System.out.println("A:Check balance");
		System.out.println("B:Deposit");
		System.out.println("C:Withdraw");
		System.out.println("D:Check Previoustransaction");
		System.out.println("E:Exit");
		
		do 
		{
                         System.out.println("Enter an option:");
		          option = s.next().charAt(0);
			switch(option)
			{
			case 'A' :
			    
				System.out.println("Your Balance:"+balance);
				break;
				
			case 'B':
				System.out.println("Enter an amount to deposit:");
				int amount = s.nextInt();
				deposit(amount);
				System.out.println("===========================");
				break;
				
			case 'C' :
				System.out.println("Enter an amount to withdraw:");
				int amount1 = s.nextInt();
				withdraw(amount1);
				System.out.println("============================");
				break;
				
			case 'D' :
				System.out.println("your Previoustransaction is:");
				getPrevioustransaction();
			    System.out.println("===========================");
			    break;
				
			case 'E' :
				System.out.println("==========================");
				break;
				
			default :
				System.out.println("invalid option");
			    break;  
			} 
				
				
			}while(option!= 'E');
                  System.out.println("Thank You for using our services");
		}
	}
	
		