package com.java.lavanya.classes;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s= new Student();
		s.marks[0] =35;
		s.marks[1]=36; //45,50,70,90};
		s.gpa=3.6f;
		s.student_age=18;
		s.student_id=36;
		s.student_name="Ramu";
		
		
		s.showStudent();
		s.studentByGpa();
		s.studentById();
		
		Student sam= new Student();
		
		//sam.marks[0] =35;
		//{35,36,45,50,70,90};
	sam.gpa=3.4f;
	sam.student_age=17;
	sam.student_id=38;
	sam.student_name="Sam Kumar";
	
	
	sam.showStudent();
	sam.studentByGpa();
	sam.studentById();
	
	}

}

class Student{
	
	String student_name;
	int student_id;
	int student_age;
	float gpa;
	int marks[]=  new int [6];
	double avg;
	

	void showStudent(){
		System.out.println(student_name+ "Student information is:" +student_name);
		System.out.println(student_name+ "Student information is:" +student_id);
		System.out.println(student_name+ "Student information is:" + gpa);
		System.out.println(student_name+ "Student information is:" +student_age);

		System.out.println(student_name+ "Student information is:");
	}
	void studentById(){
		System.out.println(student_name+ "Student ID :" + student_id);
	}
	void studentByGpa(){
		System.out.println(student_name+ "Student GPA :" +gpa);
	}
}