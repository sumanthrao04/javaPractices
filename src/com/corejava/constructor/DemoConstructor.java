package com.corejava.constructor;

public class DemoConstructor {

	public String Nag;
	public String Sum;

	// Default Constructor
	public DemoConstructor() {

	}

	// Parameterized Constructor
	public DemoConstructor(String nag, String sum) {

		this.Nag = nag;
		this.Sum = sum;
	}

	// Copy Constructor
	public DemoConstructor(DemoConstructor copyObj) {

		this.Nag = copyObj.Nag;
		this.Sum = copyObj.Sum;
	}



	public static void main(String[] args) {
		DemoConstructor dc = new DemoConstructor();
		System.out.println(dc.Nag);
		System.out.println(dc.Nag);
		DemoConstructor dp = new DemoConstructor("Yuvaraj", "Sumanth");
		System.out.println(dp.Nag);
		System.out.println(dp.Nag);

		DemoConstructor cpd = new DemoConstructor(dp);
		System.out.println(cpd.Nag);
		System.out.println(cpd.Sum);

		System.out.println(dp.hashCode());
		System.out.println(cpd.hashCode());
		System.out.println(dp.hashCode() == cpd.hashCode());
	}

}
