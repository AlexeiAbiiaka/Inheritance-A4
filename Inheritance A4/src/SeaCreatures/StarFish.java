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
 
 
public class StarFish extends Invertebrates
 {  // begin class

 	// ********** instance variable **********
	
	private int legCount = 0;
 	
 	// ********** constructors ***********
	
	/*****************************************************
	Purpose: create StarFish object
	Interface: IN:		title t: Title
						age a : int
						regeneration r: boolean
						legCount l: int
	Returns: none
	*****************************************************/	 
		 public StarFish(int a, Title t, boolean r, int l){

			 super(a, t, r);

			 legCount = l;
		 } // end constructor
 	
 	// ********** accessors **********

 
	/*****************************************************
	Purpose: get the leg count
	Interface: IN: none
	Returns: legCount: int
	*****************************************************/  	 
		public int getLegCount() {
			return legCount;
		} // end get id
 }  // end class
