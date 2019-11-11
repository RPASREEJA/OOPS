package com.rohan.lecture02;

public class Student {
	public String name;
	public int age;
	public char gender;			//fields/properties
	public String course;
	public int year;
	public String university = "Stanford University";
	
	public Student(String studName, int studAge, char studGender, String studCourse, int studYear) {
		// this();		// this() statement calls no argument constructor.
		name = studName;
		age = studAge;
		gender = studGender;
		course = studCourse;
		year = studYear;
	}
	
//	public Student() {
//		name = "Rohan";
//	}
	
	public void attendLecture() {
		System.out.println(name + " is attending " + course + " lecture.");
	}
	
	public void submitAssignment() {													//Methods 
		System.out.println(name + " is submitting " + course + " assignment.");			
	}
	
	public void attendLab() {
		System.out.println(name + " is attending " + course + " lab.");
	}

}
