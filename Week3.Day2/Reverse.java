package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		String[] name= {"Red","Green","Blue","Yellow","Brown"};
		List<String> lst=new ArrayList <String>();
		for(int i=0;i<name.length;i++) {
			lst.add(name[i]);
		}
		
			Collections.sort(lst);
			System.out.println(lst);
			Collections.reverse(lst);
			System.out.println(lst);
		}
		
		
	}


