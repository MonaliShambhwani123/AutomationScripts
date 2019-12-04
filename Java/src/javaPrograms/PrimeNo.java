package javaPrograms;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=7;
		boolean b=true;
		
		for (int i=2;i<=(no/2);i++)
		{
			if(no%i==0)
				b=false;
			break;
		}
		
		if(b)
			System.out.println("Entered no "+no+" is a prime no");
		else
			System.out.println("Entered no "+no+" is not a prime no");

	}

}
