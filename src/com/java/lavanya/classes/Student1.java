package com.java.lavanya.classes;



class Student1{
	
	
	private String sfirst;     
	private String slast;      
	private int sage;
	private int scourses;
	private int smarks[] = new int[6];
	
	//constructors
	
	public Student1(String lsfirst,String lslast,int lsage,int lscourses, int[] lsmarks){
		sfirst = lsfirst;
		slast = lslast;
		sage=lsage;
		scourses = lscourses;
		smarks = lsmarks;
		}
	public Student1(String lsfirst,String lslast,int[] lsmarks){
		sfirst = lsfirst;
		slast = lslast;
		smarks = lsmarks;
	}
	
	public Student1(String lsfirst,String lslast,int lsage){
		sfirst = lsfirst;
		slast = lslast;
		sage=lsage;
	}
	public Student1(String lsfirst,int[] lsmarks){
		sfirst = lsfirst;
		smarks = lsmarks;
	}
	
	public Student1(){
		
	}
	// setters and getter methods
	public void setmarks(int lsmarks[]){
		smarks = lsmarks;
		
	}
	
	public void setFirstname(String lsfirst){
		sfirst = lsfirst;
	}
	public void setLastname(String lslast){
		slast = lslast;
	}
	public void setCourses(int lscourses){
		scourses = lscourses;
	}
	public void setAge(int lsage){
		sage=lsage;
	}
	public void setValues(int lsage,int lscourses, String lsfirst, String lslast, int[] lsmarks){
		sage = lsage;
		sfirst = lsfirst;
		slast = lslast;
		scourses = lscourses;
		smarks = lsmarks;
		
	}
	
	public int[]getmarks()
	{
		for(int i=0; i < smarks.length; i++){
			System.out.println(smarks[i]);}
		return smarks;
	}
	public int getage(){
		return sage;
	}
	public String getfirstname(){
		return sfirst;
	}
	public String getlastname(){
		return slast;
	}
	public int getcourses(){
		return scourses;
	}
	
	
	void showStudent(){
		System.out.println("Student Information");
		System.out.println(sfirst+slast);
		System.out.println(sage);
		System.out.println(scourses);
		
	}
	void printAgeAndName(){ 
		System.out.println("Students Age is "+sage);
		System.out.println("Students Name is " +sfirst +slast);
	}
	boolean isAdult(){  
		
		boolean adult = false; 
		if(sage > 18){
			adult = true;
		}
		System.out.println("Is the Student an Adult: "+adult);
		return adult;
		
	}
	double calcualteCourseFee(int lscourses){
		lscourses*= 500.50;
		System.out.println("Total amount of fee : "+lscourses);
		return lscourses;
	}
	
   double studentAverage(int[]smarks){
	double average=0.0;int sum=0;
	for(int i=0; i < smarks.length; i++){
		sum += smarks[i];
		}
	   average= sum/smarks.length;
	   System.out.println(sum);
	   System.out.println(average);
	return average;
}
}