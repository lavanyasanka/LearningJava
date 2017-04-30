package com.java.lavanya.classes.polymorphism;

public class TestCollege {

	public static void main(String[] args) {
		
		Student s1 = new Student("Lavanya",13,21);
		Student s2 = new Student ("Arnav", 14,21);
		Student s3 = new Student ("Adithi", 15, 21);
		Student s4 = new Student ("sahithi",16,21);
		
		College c = new College("Physics", 001);
		c.setStudent(new Student[] {s1,s2,s3,s4});

		Student myStudent[] = c.getStudent();
		for(int i =0;i<myStudent.length;i++){
			myStudent[i].showDetails();
		}
		String st = c.findStudentName(14);
		System.out.println(st);
		Student s = c.findStudent(15);
	
		System.out.println(s.getName());
		System.out.println(s.getSid());
		System.out.println(s.getAge());
	}

}
