package com.rohan.lecture02;

public class StudentTest {

	public static void main(String[] args) {
		//Student S = new Student();
		Student stud1 = new Student("Jonathan", 30, 'M', "Java", 2019);
		System.out.println(stud1.name + " studies at " + stud1.university);
		stud1.attendLecture();
		
		System.out.println("========================");
		
		Student stud2 =new Student("Alexis", 30, 'F', "Python", 2016);
		System.out.println(stud2.name + " studies at " + stud2.university);
		stud2.attendLab();
		
		System.out.println("========================");
		
		Student stud3 = new Student("Lucy", 18, 'F', "SQL", 2016);
		System.out.println(stud3.name + " studies at " + stud3.university);
		stud3.submitAssignment();
				
	}
}
