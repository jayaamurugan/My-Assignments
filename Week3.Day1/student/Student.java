package student;

import department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Jayaamurugan");
		
	}
	public void studentDept() {
		System.out.println("cse");
		
	}
	public void studentId() {
		System.out.println("cs032");
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegename();
		s.collegeRank();
		s.collegecode();
		
	}

}
