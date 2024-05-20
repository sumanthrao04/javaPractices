package corejava;

import java.math.BigDecimal;

public class EclipseTutorial {

	private static BigDecimal bigDecimal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the java project");
		bigDecimal = new BigDecimal(0);
		
		int sum = 0;
		int[] numbeprs = {1,2,3,4,5,6};
		for (int number : numbeprs) {
			sum = sum+number;
			
		}
		System.out.println(sum);
		
		/*
		 
		 //code editing 
	 	ctrl+M to maximum the window
		sysout and press ctrl +spacebar
		ctrl + space autosuggestion
		ctrl +1 gives the ideas to resolve compilation error;
		alt+uparrow -> to move line one step up from code
		alt+downarrrow -> to down line one step up from code
		
		//debugging java program
		 * https://www.vogella.com/tutorials/EclipseDebugging/article.html
		 * 	
         * F5 -> Executes the currently selected line and goes to the next line in your program. If the selected line is a method call the debugger steps into the associated code
		 * F6 -> steps over the call, i.e. it executes a method without stepping into it in the debugger. 
		 * F7 -> steps out to the caller of the currently executed method. This finishes the execution of the current method and returns to the caller of this method.
		 * F8 ->  tells the Eclipse debugger to resume the execution of the program code until is reaches the next breakpoint or watchpoint. 
		*/
	
		  
	}

}
