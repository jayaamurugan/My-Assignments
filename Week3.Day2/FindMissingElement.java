package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElement {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,7,6,8};
		List<Integer> lst=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(lst);
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int i=0;i<lst.size();i++) {
			sum=sum-lst.get(i);
			
			
		}
		   System.out.println(sum);
		

	}

}
