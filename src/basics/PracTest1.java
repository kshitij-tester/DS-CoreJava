package basics;

import java.util.Scanner;

public class PracTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter EMP ID:-");
		int empid=sc.nextInt();
		
		System.out.println("Enter EMP Name:-");
		String empname=sc.next();
		
		System.out.println("Enter Emp Salary:- ");
        double empsal=sc.nextDouble();
        
        
        System.out.println("-----EMP DETAILS------------------------------------------");
        System.out.println("\nEmp ID:- "+empid);
        System.out.println("Emp Name:- "+empname);
        System.out.println("Emp Salary:- "+empsal);
		
		
		
		
		
		
		
	}

}
