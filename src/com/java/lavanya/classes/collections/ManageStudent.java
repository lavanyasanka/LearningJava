package collections;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent {

	private List<Student> students = new ArrayList<Student>();

	public ManageStudent(List<Student> students) {
		super();
		this.students = students;
	}

	public ManageStudent() {
		super();
	}

	public void printStudent(){
		students.forEach(stu -> System.out.println(stu));
		return;
	}

	public void addStudent(Student info){
		students.add(info);
		return;

	}
	public List<Student> segrateFailedStudents(){

		List<Student> failedNames = new ArrayList<Student>();
		for(Student stu : students){

			if(stu.getGpa() <= 2.0){
				failedNames.add(stu);
			}
		}

		return failedNames;
	}
	public Student updateStudentAddr(int sno, String address) {
		for(Student stu : students){

			if(sno == stu.getStudentnumber()){

				stu.setAddress(address);
				return stu;
			}

		}
		return null;
	}

	public Student findTopStudent(){  
		double topmark=0.0;  
		for(Student stu : students){  
			double smarks=stu.getGpa();  
			if(topmark<stu.getGpa()){  
				topmark=stu.getGpa();	  
			}  
		}  
		for(Student stu : students){  
			if(stu.getGpa()==topmark){  
				//System.out.println(stu);  
				return stu;  
			}  
		}  
		return null;  
	}  
	
	public List<Student> findTop3Students(){
		List<Student> topNames = new ArrayList<Student>();
		Student temp = new Student();
		
		for (int i =0;i<3;i++){
			temp = findTopStudent();
			topNames.add(temp);
			students.remove(temp);
			
		}
		return topNames;
	}


}


