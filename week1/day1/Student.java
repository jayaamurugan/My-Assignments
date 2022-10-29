package week1.day1;

public class Student {
	String studentname="Jayaamurugan";
	int rollno=32;
	String colleagename="karunya institute of technology and sciences";
	int markscored=70;
	float cgpa=6.45f;
	public static class Report{
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("Student name is : "+s.studentname);
		System.out.println("Student rollno is: "+s.rollno);
		System.out.println("Student mark scored in every subject  is: "+s.markscored);
		System.out.println("Student cgpa is :"+s.cgpa);
		System.out.println("Student colleagename is :"+s.colleagename);

	}
  }
	

}
