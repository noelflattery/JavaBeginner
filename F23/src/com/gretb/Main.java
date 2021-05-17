package com.gretb;

public class Main {
	public static void main(String[]args) {
		//creating an Accountant
		Accountant andy=new Accountant();
		/*
		 * calls the Accountant work() method, which calls three other methods
		 * unique to the accountant class, which are billing(), calcWages and
		 * doBudgets()
		 */
		System.out.println("Andy the Accouatant");
		andy.work();
		//creating our ForensicAccountant
		ForensicAccountant fred=new ForensicAccountant();
		//creating our chartered Accountant
		CharteredAccountant charlie=new CharteredAccountant();
		/*
		 * this calls the work() method in the Accountant class, as there is noe
		 * work method in the ForensicAccountant class
		 */
		System.out.println("fred the ForensicAccountant");
		fred.work();
		/*
		 * this calls the overriden work() method in the CharteredAccountant class
		 */
		System.out.println("charlie the Chartered Accountant");
		charlie.work();
		/*
		 * Helen directly inherits from Employee, she is NOT any type of 
		 * Accountant, so she has only 3 atributes
		 * and has a the method() work, which she will get from the Employee class
		 */
		HumanResources helen=new HumanResources();
		System.out.println("Helen in HumanResources");
		helen.work();
		//creating our Animal
		Animal anto=new Animal();
		//Animal class has only one method, printMe()
		anto.printMe();
		//creating our mammal
		Mammal mick=new Mammal();
		//this is the overriden printMe() method in the Mammal class
		mick.printMe();
		mick.callSuper();
		System.out.println("Angela the Ape");
		Ape angela=new Ape();
	//	angela.age=100;
		angela.printMe();
		angela.callSuper();
		
		
		
	}

}
