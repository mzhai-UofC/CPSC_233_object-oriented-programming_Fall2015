/*
  Author:  James Tam
  Version: April 1, 2013

  The sole purpose of this class is track if the program is in debugging mode.

 */
public class Debug
{
    
    public static boolean on = false;
    public void DebugTest(){
    	if (Debug.on == true){
            System.out.println("The debug test is on.");
    	}
    	
    	else{
    		System.out.println("The debug test is off.");
    	}
    		
    }
}
