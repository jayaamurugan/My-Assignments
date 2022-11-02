package week1.day2;

public class Inter_section {
	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7,12,13,14};
		int[] b= {1,2,8,4,9,7,12,13,14};
		for(int i=1;i<=a.length-1;i++) {
		for(int j=1;j<=b.length-1;j++) {
			if(b[j]==a[i])
			{
				System.out.println(a[i]);
			}
		}
			
		}
		
	}
	

}
