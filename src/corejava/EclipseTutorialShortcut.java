package corejava;

import java.math.BigDecimal;

public class EclipseTutorialShortcut {

	private static BigDecimal bigDecimal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the java project");
		bigDecimal = new BigDecimal(0);
		
		int result = 0;
		int[] numbeprs = {1,2,3,4,5,6};
		for (int number : numbeprs) {
			result = result+number;
			
		}
		System.out.println(result);
		System.out.println();
		
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
		 f5 - if function call it will go  inside and excecutes each line
		 f6 - it will over the function get the result in the same and excutes next line
		 
		 watch expression
		 * you can use the variable and write your own expression to see the value while debugging
		 * by inspect we can see the what  value is variable hold at the time of excution
		 *
		 Eclipse shortcuts 
		 ctrl + shift +L  -> all shortcuts list
		 alt + up Down arrow -> to move lines upwards and downwards
		 
		 ctrl + shift + R -> to open the file in the project or eclipse you created , if file is too long just type their Intial letters with capital 
		 ctrl + shift + t -> to open all the java class files and dependies class file in the eclipse  and uppercase also work ex arraylist -> AL
		 
		 commenting lines
		 ctrl + /  -> works both comments and uncomments
		 hirecay of the class or any thing -> to that calss just type fn+f4 
		 it is for detailed view
		 ctrl +t -> to look  hirachy in a quick
		 
		 ctrl + D -> delete the line
		 ctrl+ L -> go the the specific line
		 ctrl +Q   -> to the last edit where you edited
		 ctr + o -> gives outline of the current class like methods return type
		 toggel breadcum -> gives how to reach that class like location of the file path
		 toggle mark occurance -> it will show the variable where you used in the file like with highligt 
		
		 Refactoring the code
		 alt+shift+m -> to extract code and cretae methods for that code
		 alt+shift+L -> to extract variable in the code 
		 alt_shift+i -> inline the same or return back
		 rename variable -> alt+shift+r -> to rename all variable and methods in the all places
		 alt+shift+c -> change the method signature
		 
		 
		 code generation step
		 alt+shift+s ->  getters and setters
		 
		 Save actions
		 ctrl+shift+f -> format the code we have to do for each time
		 
		 search on save action and enable to format when you save anything
		 
		 Eclipse views
		 call hirarcy of the methods -> it will gives all hiracy of the method
		  window -> show view
		  
		  Eclipse perspective
		  to understand project -> java browsing
		  
		  eclipse plugins
		  help -> ABOUT eclipse iD -> installation
		  
		 
		  
		  
		  
		  
		 
		*
		*/
		
	
		  
	}

}
