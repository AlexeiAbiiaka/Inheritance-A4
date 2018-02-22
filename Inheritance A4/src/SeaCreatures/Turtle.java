package SeaCreatures;

import SeaCreatures.sCreatures.Title;

/* **********************************************************
 * Programmer:	Alexei Abiiaka
 * Class:		CS30S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Turtle extends Vertebrates
 {  // begin class
 	
 	// ********** instance variable **********
	 
	 private double shellSize = 0.0;
 	
 	// ********** constructors ***********
	 
	/*****************************************************
	Purpose: create Turtle  object
	Interface: IN:		title t: Title
						age a : int
						finCount f: int
						scales s: boolean
						shellSize h: double
						
	Returns: none
	*****************************************************/	 
		 public Turtle(int a, Title t, int f, boolean s, double h){
			 
			 super(a, t, f, s);
			 
			 shellSize = h;
		 } // end constructor
 	
 	// ********** accessors **********
		 
		/*****************************************************
		Purpose: get the shell size
		Interface: IN: none
		Returns: shellSize: double
		*****************************************************/  	 
			public double getShellSize() {
				return shellSize;
			} // end get id

 
 }  // end class
