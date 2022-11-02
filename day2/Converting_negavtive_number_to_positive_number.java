package week1.day2;

public class Converting_negavtive_number_to_positive_number {
	public static void main(String[] args) {
		int num=-40;
		if(num<0)
		{
			System.out.println(num + " is a negative number");
		}
		else
		{
			System.out.println(num + " is not a negative number");
		}
		
		num=num*-1;
		System.out.println("-40 negative number is converted to "+ num+ " posivte number");
		
	}

}
