package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	
	
	//Enter 12 numbers 
	System.out.println("Enter any length you want");
	int g=sc.nextInt(); //10
	
	int c[]=new int[g]; //10
	///                 Enter any    10 numbers
	System.out.println("Enter any "+c.length+" number");
	
	//          1<10
	for(int i=0;i<c.length;i++)
	{//  c[1]=12
		c[i]=sc.nextInt();
	}
		
	System.out.println(Arrays.toString(c));
		
		
		//Arrays is collection of multiple elements 
		//        0,1,2,3
		int a[]= {4,5,6,7,8,10,11,23,5,6,78,12,34,23,45,11};
		
		System.out.println(a.length);
		//          1<16
		for(int i=0;i<a.length;i++)
		{//                     Position   1   Value  5
			System.out.println("Position "+i+" Value "+a[i]);
		}
		
     
		//Arrays is predefined class from java.util package 
		//toString is predefined method of Arrays
		//it is used to print all the values together 
		//it is also used to prevent garbage values
		System.out.println(Arrays.toString(a));
		
		int b[]= {10,20,30,40}; //4
		
		int n[]=Arrays.copyOf(b, 4); //10-4=6
		
		System.out.println("Array data of b variable:- "+Arrays.toString(b));
		
		System.out.println("Array data of n variable:- "+Arrays.toString(n));
		
//copyOf is predefined method of Arrays 
//it is used to copy the data of existing array to the newest array variable
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
