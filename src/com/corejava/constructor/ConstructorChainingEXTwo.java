package com.corejava.constructor;

//Constructor Chaining to other class using super() keyword :
class Parent {

	String name = "Raghav";

	Parent() {
		System.out.println("No-argument constructor of" + " Parent");

	}

	Parent(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor" + " of Parent");
	}
}

class Child extends Parent {

	Child() {

	}

	Child(String name) {

		super(name); // Parent(Name)
		System.out.println("Calling parameterized " + "constructor of derived : " + name);
	}


}

public class ConstructorChainingEXTwo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child("Sumanth");
	}

}
