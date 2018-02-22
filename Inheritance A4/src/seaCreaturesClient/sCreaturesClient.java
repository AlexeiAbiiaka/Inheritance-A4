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

import SeaCreatures.*;
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
    	Integer num;
    	Double dob;
    	
    	ProgramInfo programInfo = new ProgramInfo();
    	
	// ***** create objects *****
		
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Alexei Abiiaka");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Inheritence");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
		sCreatures s1 = new sCreatures(40, Title.Fish);
		title = s1.getTitle();
		System.out.println("Type of sea creature is " + title);
		
		Vertebrates v1 = new Vertebrates(100, Title.Turtle, 4, true);
		num = v1.getFinCount();
		title = v1.getTitle();
		System.out.println("Vertebrate " + title + " has " + num + " fins");
		
		Turtle t1 = new Turtle(100, Title.Turtle, 4, true, 23.4);
		dob = t1.getShellSize();
		System.out.println("Turtles shell size is " + dob + "inches");
	// ***** output *****
	
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		strout = programInfo.getClosingMessage();
		System.out.println(strout);
	
	}  // end main	
}  // end class