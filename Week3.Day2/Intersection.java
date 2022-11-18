package Week3.Day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		Integer[] name={3,2,11,4,6,7};	
		Integer[] name1={1,2,8,4,9,7};
		List<Integer>lst=new ArrayList<Integer>(Arrays.asList(name));
		List<Integer>lst1=new ArrayList<Integer>(Arrays.asList(name1));
		System.out.println("name :"+lst);
		System.out.println("name1 :"+lst1);

		
		for(int i=0;i<lst.size();i++) {
			for(int j=0;j<lst1.size();j++) {
				if(lst.get(i)==lst1.get(j)) {
					System.out.println(lst1.get(j));
				}
			}
		}

		
	}

}
