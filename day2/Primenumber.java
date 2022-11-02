package week1.day2;

public class Primenumber {
	public static void main(String[] args) {
		int n=13,c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
				
			}
		 }
			
			if(c==2)
			{
				System.out.println(n+ "is a prime number");
			}
			else
			{
				System.out.println( n+ " is not a prime number");
			}
			
			
		
		
		
	}

}
