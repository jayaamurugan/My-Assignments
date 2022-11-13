package Week3.Day1;

//import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args) {
		String value="madam";
		String rev ="";
		char[] str1 = value.toCharArray();
		for(int i=str1.length-1;i>=0;i--)
		{
			rev =rev+str1[i];
			System.out.println(str1[i]);
			//System.out.println();
		}
		
		
		if(value.equals(rev)) {
			System.out.println();System.out.println(value+" is palindrome");
		}
		else 
		{
			System.out.println(value+" and "+rev+" are not palindrome");
		}
	}

}
