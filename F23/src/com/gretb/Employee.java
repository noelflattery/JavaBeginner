package com.gretb;

public class Employee {
	/*
	 * this file contains the following classes
	 * Employee class
	 * Accountant class which inherits from Employee
	 * ForensicAccountant which inherits from Accountant
	 * CharterdAccountant which inherits from Accountant
	 * HumanResource which inherits from Employee
	 * You can ohly have ONE public class per file. The name of the
	 * public class has to match the name of the file
	 */
	int pps;//pps of employee
	String name;//name of employee
	double wages;//yearly wages of employee
	/*
	 * the one thing that every employee does is work
	 * any class that extends Employee will now have a work() method
	 */
	void work() {
		System.out.println("I am a employee working");
	}

}//end of employee class

//Accountant class
class Accountant extends Employee{
	/*
	 * what goes in here is everything that applies to ALL Accountants ONLY
	 */
	/*
	 * an array of strings which will be all the qualifications each Accountant
	 * holds
	 */
	String[]qualifications;
	double allowance;//tax free allowance
	/*
	 * only accountants are on health insurance
	 */
	boolean healthPlan;//true if have healthPlan, false if not
	/*
	 * override the work() method form the employee class. the reason for this
	 * is that an accountant does more specialist work than a general employee
	 */
	void work() {
		/*
		 * inside this work method for every accountant, we are calling three
		 * other methods of the Accountant class
		 */
		billing();//does the billing
		calcWages();//calculates the wages
		doBudgets();//does the budget
	}
	/*
	 * these are tasks that EVERY accountant does
	 */
	void billing() {
		System.out.println("I am an accountant billing");
	}
	/*
	 * every accountant does out the wages 
	 */
	void calcWages() {
		System.out.println("I am an accountant calculating wages");
	}
	//every accountant does the budgets for the business
	void doBudgets() {
		System.out.println("I am an accountant doing the budgets");
	}
	
}//end of Accountancy class

class ForensicAccountant extends Accountant{
	/*
	 * nothing in the class, so it takes everything from the Accountant class
	 * takes work() method from accounant class 
	 * takes three variables from accountant class
	 * and accountant takes three variables from employee class which means
	 * ForensicAccountant has six variables
	 */
}//end of ForensicAccountatn

class CharteredAccountant extends Accountant{
	/*
	 * Overriden work method, so when we create a CharteredAccountant this is the
	 * work method that will be called for that person.
	 * Our Chartered accountant has 6 variables just like the ForensicAccountant
	 * and the Accountant
	 */
	void work() {
		System.out.println("I am a chartered Accountant working");
	}
}//end of CharteredAccountant

class HumanResources extends Employee{
	/*
	 * this has no methods or no variables declared inside of it. So it takes
	 * EVERYTHING from the Employee.
	 * So it only has three atributes and one method, work(), which it will take
	 * from the Employee class
	 */
}//end of Human Resources
