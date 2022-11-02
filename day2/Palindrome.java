package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34343,sum=0,r;
		int n;
		n=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(n==sum)
		{
			System.out.println(n+ " is a palindrome");
		}
		else
		{
			System.out.println(n+ " is not a palindrome");
		}

	}

}
