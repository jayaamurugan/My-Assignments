package Week3.Day1;
//import java.util.Iterator;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] words = text.split(" ");
		System.out.println(words.length);
		for(int i=0;i<words.length;i++) {
			
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]=" ";
				}
			}
			if(count>1 ) {
				//System.out.print(words[i]);
			}
			System.out.print(words[i]+" ");
		}
		
	}
	

}
