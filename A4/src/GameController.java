/*Name:Muzhou,Zhai ID:10106810
 * cpsc233 L01-T04
 * 
 * Version: Oct.9.2011
 * 
 * To-do:
 * -Creating 2 child classes of Car: Sports and SUV
 * -Creating 2 child classes of Track: ArcticTrack and DesertTrack
 * -Creating a class GameController
 * 
 * Features: This is is program shows two cars moving in a 1D array space, and output the status turn by turn.
 * -The two tracks are displayed
 * -SUV movement occurs
 * -The program determines if a blizzard occurs in the arctic track
 * -Sports car movement occurs
 * -The program determines if a heat wave occurs in the desert track
 * -Determine the outcome of the simulation  
 * 
 * Limitation:None
 */
import java.util.Scanner;
public class GameController {
    private Scanner in;
    private boolean done;
	private SUV aSUV;
	private Sports aSports;
	private ArcticTrack aArctic;
	private DesertTrack aDesert;
	private int selection1;
	public int newFuel;
	public int newFuelV;
	public int newLocationP;
	public int newLocationV;

	public GameController ()
	{
		in = new Scanner(System.in);
		done = false;
		aSUV = new SUV();
		aSports=new Sports();
		aArctic=new ArcticTrack();
		aDesert=new DesertTrack();
		
	    }

	//Display the menu to user
	public void displaySUVMenu ()
	{
	    System.out.println("SUV driving options");
		System.out.println("(a)ll wheel drive mode");
		System.out.println("(d)rive normally");
		System.out.println("(q)quit simulation");
		System.out.print("Enter selection: ");
	    }
	//A method display the cheat menu
    public void displayCheatMenu(){
    	System.out.println("CHEAT MENU SELECTION");
    	System.out.println("(0)Toggle debugging messages on/off");
    	System.out.println("(1)Change fuel of sports car");
    	System.out.println("(2)Change fuel of SUV car");
    	System.out.println("(3)Change location of sports car");
    	System.out.println("(4)Change location of suv car");
    	System.out.println("(5)Make a blizzard in the artic track");
    	System.out.println("(6)Make a heat wave in the desert track");
    }
    //an if-else if-else loop for p
	public void processMenu (char selection)
	{
		System.out.println();
		//(d)rive normally
		if((selection=='D')||(selection=='d'))
		{
		     aSUV.vd();
		}
		        
		//(a)ll wheel drive mode
		else if((selection=='A')||(selection=='a'))
		{
		     aSUV.va();
		}
		//Quit Game    
		else if((selection=='Q')||(selection=='q'))
		{
			 done = true;
		}
        //cheat menu
		else if((selection=='C')||(selection=='c'))
		{
		    	 
				processCheatMenu(selection1);
		}
		//For the case that the user do not enter the valid commands.
		else{
			 System.out.println("Please enter 'a','d', or'q'");
			 processMenu(selection);
		}
		System.out.println();
	    }
    
	public void processCheatMenu(int number){
		displayCheatMenu();
		System.out.println("Please enter the selection(0 to 6): ");
		Scanner in=new Scanner(System.in);
		int selection1=in.nextInt();
		
		switch(selection1)
		{
		     //(0)Toggle debugging messages on/off
		     case 0:
		    	 Debug d=new Debug();
		    	 d.DebugTest();
		    	 
		     break; 
	         //(1)Change fuel of sports car
		     case 1:
		    	 System.out.println("Set new fuel value (non-negative value only)");
		    	 Scanner in1=new Scanner(System.in);
		    	 int newFuel=in1.nextInt();
		    	 if(newFuel<2){
		    		 System.out.println("Sports car is out of fuel and cannot move");
		    	 }
		         else{
		        	aSports.moveWithNewFuel(); 
		    	 }
		     break;
		     
		     //(2)Change fuel of SUV car
		     case 2:
		    	 System.out.println("Set new fuel value (non-negative value only)");
		    	 Scanner in2=new Scanner(System.in);
		    	 int newFuelV=in2.nextInt();
		    	 if(newFuelV<3){
		    		 System.out.println("SUV is out of fuel and cannot move");
		    	 }
		         else{
		        	aSUV.moveWithNewFuel(); 
		    	 }
		         break;
		         
             //(3)Change location of sports car	
		     case 3:
		    	 System.out.println("Moving car");
		    	 System.out.println("Move car from location 0 to 24");
		    	 System.out.println("Enter location: ");
		    	 Scanner in3=new Scanner(System.in);
		    	 int newLocationP=in3.nextInt();
		    	 if(newLocationP<0||newLocationP>24){
		    		 System.out.println("Please enter an integer from 0 to 24.");
		    	 }
		    	 else{
		    		 aArctic.CheatLocationP();
		    	 }
		    	break;
		    	
		     //(4)Change location of suv car
		     case 4:
		    	 System.out.println("Moving car");
		    	 System.out.println("Move car from location 0 to 24");
		    	 System.out.println("Enter location: ");
		    	 Scanner in4=new Scanner(System.in);
		    	 int newLocationV=in4.nextInt();
		    	 if(newLocationV<0||newLocationV>24){
		    		 System.out.println("Please enter an integer from 0 to 24.");
		    	 }
		    	 else{
		    		 aDesert.CheatLocationV();
		    	 }
		    	 break;
		    	 
		     //(5)Make a blizzard in the arctic track	 
		     case 5:
		    	 System.out.println("Causing a blizzard in the artic track");
		    	 aArctic.Blizzard();
		    	 break;
		    	 
		     //(6)Make a heat wave in the desert track
		     case 6:
		    	 System.out.println("Causing a heatwave in the DesertTrack");
		    	 aDesert.HeatWave();
		    	 break;
		    	 
		     //in case of the user input some other integers.	 
		     default:
			 System.out.println("Please enter '0','1','2','3','4','5', or'6'");
		}
		//For a blank line
		System.out.println();
	}
    //Display the Sports menu.
	public void displaySPORTSMenu ()
	{
	    System.out.println("SUV driving options");
		System.out.println("(d)rive normally");
		System.out.println("(q)quit simulation");
		System.out.print("Enter selection: ");
	    }
    //A switch loop for the menu process.
	public void processMenuSports (char selection)
	{
		System.out.println();
		switch(selection)
		{
		     //
		     case 'D':
		     case 'd':
		     aSports.pd();
		     break;
		       
		     //Quit the project
		     case 'Q':
		     case 'q':
			 done = true;
		         break;

		     default:
			 System.out.println("Please enter 'd', or'q'");
		}
		System.out.println();
	    }

    //To control the userinterface.
	public void start ()
	{
		final int FIRST = 0;
		String line  = null;
		char selection = ' '; 
		if(done == false)
		{
		    displaySUVMenu();
		    line = in.nextLine();
		    selection = line.charAt(FIRST);
		    processMenu(selection);
		    
		    displaySPORTSMenu();
		    line = in.nextLine();
		    selection = line.charAt(FIRST);
		    processMenu(selection);
		    }
	    } 
	}	