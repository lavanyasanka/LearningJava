package collections;

import java.util.ArrayList;
import java.util.List;

import collections.Student;

public class StudentTest {
	
public static void main(String[] args) {
	
    Student s1 = new Student("Raju", 1, 3.0, "some address");
	
    Student s2 = new Student("Ramu", 2, 1.0, "some address");
	
    Student s3 = new Student("Manju", 3, 2.0, "some address");
	
    Student s4 = new Student("Kavi", 4, 3.4, "some address");
	
    Student s5 = new Student("Roja", 5, 3.1, "some address");
	Student s6 = new Student("Sahithi", 6, 4.1, "some address");
    
    List<Student> s = new ArrayList<Student>();
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
	s.add(s5);

	
	ManageStudent manstu = new ManageStudent(s);
	manstu.printStudent();
	manstu.updateStudentAddr(3, "3500 twin branch dr");
	manstu.printStudent();
	
	manstu.addStudent(s6);
	 List<Student> failed = manstu.segrateFailedStudents();
	 failed.forEach(fail ->System.out.println(fail));
	 
	 Student s7 = manstu.findTopStudent();
	 System.out.println(s7.getStudentName());
	 System.out.println("********************************");
	 List<Student> top3= manstu.findTop3Students();
	 top3.forEach(top -> System.out.println(top));
	
}

}
