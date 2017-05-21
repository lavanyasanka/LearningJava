package collections;

public class Student {

	private String studentName;
	//private int top = Integer.MIN_VALUE;
	private int studentnumber;
	private double gpa;
	private String address;
	
	//consturctors
	
	public Student(String studentName, int studentnumber, double d, String address) {
		super();
		this.studentName = studentName;
		this.studentnumber = studentnumber;
		this.gpa = d;
		this.address = address;
	}
	
	public Student() {
		super();
	}

	//getter and setter methods
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

/*	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}*/
	public int getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentnumber =" + studentnumber + ", studentName =" + studentName + ", gpa=" + gpa + "address =" + address +" ]";
	}
	



}