package com.gretb;
/**
 * this contains Animal class
 * class Mammal that extenda Animal
 * class Ape that extends Mammal
 * class Human that extends Ape
 * @author noelf
 *
 */
//super class of all animals
public class Animal {
	//weight of animal
	double weight;
	//age of animal and will be given default value of 10
	int age=10;
	/*
	 * when the printMe method from the Animal class is called it wil print
	 * Animal print 10
	 */
	void printMe() {
		System.out.println("printeMe Animal print "+age);
	}

}//end of Animal class

class Mammal extends Animal{
	//default age of every mammal is 20
	int age=20;
	/*
	 * Overriding the printMe() method of the Animal class
	 */
	void printMe() {
		System.out.println("printMe mammal print "+age);
	}
	/*
	 * this is the Mammal's class own method that is not overriden
	 */
	void callSuper() {
		System.out.println("callSuper Mammal");
		System.out.println("age is "+age);
		//accessing the age in the Animal class
		System.out.println("Animal age is "+super.age);
		//calling printMe() in own class
		printMe();
		super.printMe();
	
	}
}//end of Mammal class

class Ape extends Mammal{
	int age=30;
/*	void printMe() {
		System.out.println("ape printMe "+age);
	}*/
}
