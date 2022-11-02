package week1.day2;
import java.util.Arrays;

public class Secondsmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,45,67,32,89,22};
		Arrays.sort(arr);
		for(int i=0;i<=arr.length;i++) {
			
			System.out.println("second smallest number is :"+arr[i]);
		}
		

	}

}
