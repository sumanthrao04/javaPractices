package com.corejava.constructor;

//Within same class: It can be done using this() keyword for constructors in the same class
public class ConstructorChainingEXOne {

	
	ConstructorChainingEXOne() {
		this("sumath", 10, 20);// ConstructorChainingEXONE(String name, int x, int y)
		System.out.println("Default constructor");
	}

	ConstructorChainingEXOne(String name, int x, int y) {
		// this(); // ConstructorChainingEXONE(String name, int x, int y, int result)
		this("sumath", 10, 20, 0);
		System.out.println("Name : Math opearion of value X : " + x + "and Y : " + y);
	}
	
	ConstructorChainingEXOne(String name, int x, int y, int result) {

		result = x * y;
		System.out.println(
				"Name : Math opearion of value X : " + x + "and Y : " + y + " The value of multiplication : " + result);

	}



	public static void main(String[] args) {
		new ConstructorChainingEXOne();


	}

}
