package seaCreaturesClient;

public class ProgramInfo
{  // begin class

   // *********** class constants **********

   // ********** instance variable **********

   // ********** constructors ***********
    public ProgramInfo(){
        
    } // end default constructor

   // ********** accessors **********
    
    public String getBanner(String a){
        String bannerOut = "";
        
   	bannerOut = "*******************************************\n";
   	bannerOut += "Name:		Alexei\n";
   	bannerOut += "Class:		CS30S\n";
   	bannerOut += "Assignment:	" + a + "\n";
   	bannerOut += "*******************************************\n\n";         
        
        return bannerOut;
    } // end getBanner
    
    public String getClosingMessage(){
        String closing = "end of processing.\n";
        
        return closing;
    }

   // ********** mutators **********

}  // end class