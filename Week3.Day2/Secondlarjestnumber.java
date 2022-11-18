package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Secondlarjestnumber {
	public static void main(String[] args) {
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		Integer[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		List <Integer>arr=new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(arr);
		System.out.println(arr.get(4));
	}

}
