package com.gretb;

public class Pig {
	int age;//age of pig
	String name;//name of Pig
	/*
	 * any class can contain any object as one it's atributes
	 */
	Person owner;//the owner of the Pig
	//constructor to create a pig
	Pig(int pAge,String pName,Person pOwner){
		age=pAge;
		name=pName;
		owner=pOwner;
		System.out.println("Pig constructor called");
	}
	
	//eat method for pig
	void eat() {
		System.out.println("pig eating "+name);
		/*
		 * for example, if pippa calls the eat method, it will be pippa
		 * that will also call the gainWeight() and defecate() method
		 */
		gainWeight();
		defecate();
	}//end of eat m ethod
	
	//gainWeight method for pig
	void gainWeight() {
		System.out.println("pig gaining weight "+name);
	}//end of gainWeight method
	
	//defecate method for pig
	void defecate() {
		System.out.println("pig defacating "+name);
	}//end of defecate method
	
	void one() {
		System.out.println("method one called");
		two();//calls two() method
		three();//calls three() method
	}
	
	void two() {
		System.out.println("method two called");
		/*
		 * this will result in a stackoverflowError as one() method will
		 * call two() method which calls one() method and on an on it goes
		 * uncomment to see error
		 */
	//	one();
	}
	
	void three() {
		System.out.println("method three called");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
