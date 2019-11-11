package com.rohan.lecture01;

public class Dog {				//This is the main class declared 

	public String name;
	public int age;
	public String breed;
	public String color;
	
	/**
	 * No argument Constructor. ^
	 */
	public Dog() {				//This is a default constructor
		System.out.println("Inside Dog() Constructor."); 
		name = "Hunter";
		age = 5;
		breed = "Bulldog";
		color = "Brown";
	}
	
	/**
	 * Parameterized Constructor.
	 * 
	 *  dogName name of the dog
	 *  dogAge age of the dog
	 *  dogBreed breed of the dog
	 *  dogColor color of the dog
	 */
	public Dog(String dogName, int dogAge, String dogBreed, String dogColor){			// THESE ALL ARE PaRaMeTeRs for a parameterized constructor.
		name = dogName;
		age = dogAge;
		breed = dogBreed;
		color = dogColor;
	}
	
	/**
	 * This method prints "dog_name is barking." on to the console.
	 */
	public void bark() {										//These are all methods passed.
		System.out.println(name + " is barking.");
	}
	
	/**
	 * This method prints "dog_name is eating." on to the console.
	 */
	public void eat() {
		System.out.println(name + " is eating.");
	}
	
	/**
	 * This method prints "dog_name is wagging tail." on to the console.
	 */
	public void wagTail() {
		System.out.println(name + " is wagging tail.");
	}
}
