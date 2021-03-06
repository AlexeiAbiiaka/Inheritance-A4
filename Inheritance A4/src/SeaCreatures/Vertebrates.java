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
 
 
public class Vertebrates extends sCreatures
 {  // begin class

 	// ********** instance variable **********
 	
	private int finCount = 0;
	private boolean scales = true;
	
 	// ********** constructors ***********
	
	/*****************************************************
	Purpose: create Vertebrates  object
	Interface: IN:		title t: Title
						age a : int
						finCount f: int
						scales s: boolean
	Returns: none
	*****************************************************/	 
		 public Vertebrates(int a, Title t, int f, boolean s){
			 
			 super(a, t);
			 
			 finCount = f;
			 scales = s;
		 } // end constructor
 	
 	// ********** accessors **********
		 
	/*****************************************************
	Purpose: get the fin number
	Interface: IN: none
	Returns: finCount: int
	*****************************************************/  	 
		public int getFinCount() {
			return finCount;
		} // end get id
		
	/*****************************************************
	Purpose: get vertebrates scale status
	Interface: IN: none
	Returns: vertebrates scale status
	*****************************************************/  	 
		public boolean getScales() {
			return scales;
		} // end get id
 	
 
 }  // end class
