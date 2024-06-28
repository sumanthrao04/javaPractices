package com.corejava.constructor;

/*Alternative method : using Init block : 
When we want certain common resources to be executed with every constructor we can put the code in the init block. Init block is always executed before any constructor, whenever a constructor is used for creating a new object.
*/
public class ConstructorChainingEXThree {

	// Init block is always executed before any constructor
	{
		System.out.println("In it block will excute before calling Constructor ");
	}
	ConstructorChainingEXThree() {
		System.out.println("Default constructor");
	}

	{
		System.out.println("Calling in it method");
	}

	public void callingConstructor() {
		System.out.println("calling Constructor method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChainingEXThree constructorChainingEXThree = new ConstructorChainingEXThree();
		constructorChainingEXThree.callingConstructor();
	}

}
