package com.java.lavanya.classes;


public class TestStudent1 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		int lsmarks[] = {60,30,45,90,80,99};
	    s.setmarks(lsmarks);
		//s.setValues(20,6,"Lavanya","Sanka",lsmarks);
		s.isAdult();
		s.calcualteCourseFee(6);
		s.printAgeAndName();
	    s.getmarks();
	    
	    
	    Student1 s1= new Student1("Lavanya","Billakanti",lsmarks);
		int lsmarks1[] = {90,90,90,90,90,90};
	    s1.setmarks(lsmarks1);
            s1.getfirstname();
            s1.getlastname();
            s1.getmarks();
            s1.showStudent();
            s1.studentAverage(lsmarks1);
            
            Student1 s2= new Student1("Lavanya", lsmarks);
    		int lsmarks2[] = {80,60,70,80,95,99};
    	    s2.setmarks(lsmarks2);
    	    s2.studentAverage(lsmarks2);
	}
}


