package com.rohan.lecture01;

public class DogTest2 {
	public static void main(String[] args) {
		//Create a Dog instance (object) using no-argument constructor
		
		Dog d1 = new Dog();
		d1.name = "Bubbly";   			//Assign Bubbly to name property of d1
		d1.age = 10;				 	//Assign 10 to age property of d1
		d1.breed = "Poodle"; 			//Assign "Poodle" to breed property of d1
		d1.color = "White"; 			//Assign "White" to color property of d1
		
		d1.eat();						 //Call eat() method on d1
		
		
		System.out.println(d1.name + " : " + d1.age + " : " + d1.breed + " : " + d1.color);
		
		
		
		
		Dog d2 = new Dog();			//Create a Dog instance using no-argument constructor
		d2.eat(); 					//Call eat() method on d2
		
		
		System.out.println(d2.name + " : " + d2.age + " : " + d2.breed + " : " + d2.color);		//Get d2's name, age, breed and color from the default constructor
		
		//Create a Dog instance using parameterized constructor
		Dog d3 = new Dog("Rusty", 5, "Golden Retriever", "Dark Golden");		//At the time of passing these all are ARGUMENTS
		
		//Get d3's name, age, breed and color
		System.out.println(d3.name + " : " + d3.age + " : " + d3.breed + " : " + d3.color);
		d3.bark();
	}
}
