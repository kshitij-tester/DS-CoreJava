package basics;

import java.util.Scanner;

public class ATM_miniProj {

	static Scanner sc=new Scanner(System.in);
	
	static double balance=0.0;
	
	public static void deposit_amount()
	{
		System.out.println("Enter the amount to deposit");
		double dep=sc.nextDouble();
		
		if(dep>=100)
		{
			balance=balance+dep;
			System.out.println(dep+" has been deposited successfully");
			System.out.println("\n Your current Balance is "+balance);
		}
		else
		{
			System.out.println("Amount is less than Rs.100 please try again..");
		     deposit_amount();
		
		}
		
	}
	
	
	
	public static void withdraw_amount()
	{
		System.out.println("Enter the amount to withdraw");
		double wit=sc.nextDouble();
		
		
		
		
		if(wit>=100)
		{
			//  12000 <= 5000
			if(balance <=wit)
			{
				System.out.println("Balance is insufficient please deposit first");
				Choice_for_user();
				
			}
			else
			{
				balance=balance-wit;
				System.out.println(wit+" has been withdrawn successfully");
				System.out.println("\n Your current Balance is "+balance);
			}
			
			
		}
		else
		{
			System.out.println("Amount is less than Rs.100 please try again..");
		     withdraw_amount();
		
		}
		
	}
	
	
	public static void Choice_for_user()
	{
		
		System.out.println("Enter your choice \n1.DEPOSIT \n2.WITHDRAW \n3.CHECK BALANCE");
		String ch=sc.next();
		
		switch(ch)
		{
		case "1":
			deposit_amount();
			break;
			
		case "2":
			withdraw_amount();
			break;
			
		case "3":
			System.out.println("Your current balance is "+balance);
			break;
			
			default:
				System.out.println("Invalid Choice..");
				Choice_for_user();
				break;
		}
		
		
		
	}
	
	
	
	public static void Transaction_Choice()
	{
		
		Choice_for_user();
		
		System.out.println("Do you want to continue... Yes/No");
		String ip=sc.next();
		
		if(ip.equalsIgnoreCase("Yes"))
		{
			Transaction_Choice();
		}
		else if(ip.equalsIgnoreCase("No")) {
			
			System.out.println("Thank you for using our service ");
		}
		else
		{
			System.out.println("You entered wrong choice..");
			Transaction_Choice();
		}
			
		
		
		
		
	}
	
	
	
	
	
	
	
	
		public static void PinVerify()
	{
		System.out.println("Enter your pin number");
		String pin=sc.next(); //12345
		//          3<=3
		for(int i=1;i<=3;i++)
		{
			if(i<=2)  //3<=2
			{
				if(pin.equals("12345")) //987==12345
				{
					System.out.println("Pin is valid");
					Transaction_Choice();
					break;
				}
				else
				{
					System.out.println("Pin is invalid..please try again");
					pin=sc.next(); //783
				}		
			}
			else if(i==3) //3==3
			{
				
				
				if(pin.equals("12345")) //987==12345
				{
					System.out.println("Pin is valid");
					Transaction_Choice();
					break;
				}
				else
				{
					System.out.println("Acc is blocked..Please contact Bank");
					
				}		
				
				
				
			}
		}	
	}
	
	
	
	
	/*
	
	Enter pin code 
	123456
	Enter your choice 
	1.DEPOSIT 
	2.WITHDRAW
	3.CHECK BALANCE 
	1
	Enter the amt to deposit 
	100 
	
	Rs.100 has been deposited successfully 
	Your Balance is Rs.100 
	
	Do you want to continue 
	yes
	Enter your choice 
	1.DEPOSIT 
	2.WITHDRAW
	3.CHECK BALANCE 
	3
	Your balance is Rs.100 
	
	Do you want to continue 
	no
	Thank you for using our service 
	
	
	
	
	
	
	
	
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PinVerify();
	}

}
