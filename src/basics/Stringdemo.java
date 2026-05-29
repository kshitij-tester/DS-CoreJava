package basics;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String is non primitive datatypes 
		//String is having max length of storing characters are 2'32-2 
		//String is immutable 
		
		
		String a="Have a Greatest Day";
		String b="Have a greatest day";
		
		if(a.equals(b))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found");
		}
		
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
