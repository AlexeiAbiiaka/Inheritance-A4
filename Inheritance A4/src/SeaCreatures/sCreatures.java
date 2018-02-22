package SeaCreatures;

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
 
 
public class sCreatures
 {  // begin class
 	
	 public enum Title{
		 StarFish, Turtle, Fish
	 } // end title enum

 	// ********** instance variable **********
	
	private Title title = null;			//starfish, turtle, fish
 	private int age = 0;
	
 	// ********** constructors ***********
 	
	 
/*****************************************************
Purpose: create sCreatures  object
Interface: IN:		title t: Title
					age a : int
Returns: none
*****************************************************/	 
	 public sCreatures(int a, Title t){
		 age = a;
		 title = t;		 
	 } // end constructor
	 
	 	// ********** accessors **********
	 
/*****************************************************
 Purpose: create sCreatures object
 Interface: IN: none
 *****************************************************/	 
	 public sCreatures(){
		 // defaultconstructor use 
	 } // end constructor	 
 
 /*****************************************************
 Purpose: get sCreatures age
 Interface: IN: none
 Returns: sCreatures age
 *****************************************************/
	public int getAge(){
		return this.age;
	} // end getAge 
	
/*****************************************************
Purpose: get title
Interface: IN: none
Returns: title: Title
*****************************************************/	
	public Title getTitle() {
		return title;
	} // end get title

 
 }  // end class
