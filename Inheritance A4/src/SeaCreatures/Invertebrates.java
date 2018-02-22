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


public class Invertebrates extends sCreatures
 {  // begin class
 	
 	// ********** instance variable **********
	
	private boolean regeneration = true;
 	
 	// ********** constructors ***********
	
	/*****************************************************
	Purpose: create Invertebrates object
	Interface: IN:		title t: Title
						age a : int
						regeneration r: boolean
	Returns: none
	*****************************************************/	 
		 public Invertebrates(int a, Title t, boolean r){

			 super(a, t);
			 
			 regeneration = r;
		 } // end constructor
 	
 	// ********** accessors **********
 	
	/*****************************************************
	Purpose: get the regeneration status
	Interface: IN: none
	Returns: regeneration: boolean
	*****************************************************/  	 
		public boolean getRegeneration() {
			return regeneration;
		} // end get id
 
 }  // end class
