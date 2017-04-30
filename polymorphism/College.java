package com.java.lavanya.classes.polymorphism;

public class College {
	private Student student[]= new Student[4];
	private String deptname;
	private int deptid;
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public College( String deptname, int deptid) {
		super();
		this.deptname = deptname;
		this.deptid = deptid;
	}
	public College() {
		super();
	}

	public String findStudentName(int sid) {

		String sname =""; 
		for(Student st: student){
			if(sid ==(st.getSid()))
			{
				sname= st.getName();
			}
		}
		return sname;
	}	

	public Student findStudent(int sid) {
		Student s=new Student();
		for(Student st: student){
			if(sid ==(st.getSid()))
				return st;
		}
		return s;
	}
	public void showDetails(){
		System.out.println("Collage Department name is " + deptname);
		System.out.println("Collage Department id is " + deptid);
	}

}
