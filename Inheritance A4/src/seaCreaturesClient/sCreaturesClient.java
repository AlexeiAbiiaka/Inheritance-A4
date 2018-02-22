package seaCreaturesClient;

//**********************************************************************
//Programmer:	Alexei Abiiaka
//Class:		CS30S
//
//Assignment:	aX qy
//
//Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//Output:		describe the result of your program
//***********************************************************************

import javax.swing.*;

import SeaCreatures.sCreatures;
import SeaCreatures.sCreatures.Title;

import java.text.DecimalFormat;

import javax.swing.*;
import java.text.DecimalFormat;
import java.io.*; 					// import file io libraries
import java.util.ArrayList;
import java.util.Date;

public class sCreaturesClient 
{  // begin class
	public static void main(String args[])
	{  // begin main

	
	// ***** declaration of variables *****
	
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
    	Title title;
    	
    	ProgramInfo programInfo = new ProgramInfo();
    	
	// ***** create objects *****
		
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Your Name Here");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Ax Qy");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
		sCreatures s1 = new sCreatures(40, Title.Fish);
		title = s1.getTitle();
		System.out.println(title);
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		strout = programInfo.getClosingMessage();
		System.out.println(strout);
	
	}  // end main	
}  // end class