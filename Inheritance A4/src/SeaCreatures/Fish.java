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
 
 
 public class Fish extends Vertebrates
 {  // begin class
 	
 	// ********** instance variable **********
	 
	 private boolean swimBladder = true;
 	
 	// ********** constructors ***********
	 
	/*****************************************************
	Purpose: create Fish object
	Interface: IN:		title t: Title
						age a : int
						finCount f: int
						scales s: boolean
						swimBladder b: boolean
	Returns: none
	*****************************************************/	 
		 public Fish(int a, Title t, int f, boolean s, boolean b){
			 
			 super(a, t, f, s);
			 
			 swimBladder = b;

		 } // end constructor
 	
 	// ********** accessors **********
		 
 
	/*****************************************************
	Purpose: get the swimBladder status
	Interface: IN: none
	Returns: swimBladder: boolean
	*****************************************************/  	 
		public boolean getSwimBladder() {
			return swimBladder;
		} // end get id
 	
 
 }  // end class
