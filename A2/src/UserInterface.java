import java.util.Scanner;

public class UserInterface
{
    private Scanner in;
    private boolean done;
    private Manager aManager;

    public UserInterface ()
    {
	in = new Scanner(System.in);
	done = false;
	aManager = new Manager();
    }

    //Display the menu to user
    public void displayMenu ()
    {
    System.out.println("Welcome to the userInterface!");
    System.out.println("Please enter your command: ");
	System.out.println("(d)isplay grade");
	System.out.println("(a)verage grade");
	System.out.println("(h)find higest");
	System.out.println("(l)find lowest");
	System.out.println("(r)andom");
	System.out.println("(f)ixed initialzation of list");
	System.out.println("(q)uit game");
	System.out.print("Selection: ");
    }

    public void processMenu (char selection)
    {
	System.out.println();
	switch(selection)
	{
	     //Display grades
	     case 'D':
	     case 'd':
		 System.out.println("Display the grade:");
	         aManager.Grade();
	         break;
	        
         //Average grades
	     case 'A':
	     case 'a':
		 System.out.println("The average grade is:");
	         aManager.Average();
	     break;
	     
	     //Find highest grade
	     case 'H' :
	     case 'h' :
		 System.out.println("The Highest grade is: ");
	         aManager.Highest();
	     break;
	     
	     //find lowest grade
	     case 'L':
	     case 'l':
		 System.out.println("The Lowest grade is:");
	         aManager.Lowest();
	     break;
	     
	     //random
	     case 'R':
	     case 'r':
		 System.out.println("The random list of the grade is: ");
	         aManager.Random();
	     break;
	     
	     //Fixed initialization of list
	     case 'F':
	     case 'f':
		 System.out.println("The fixed initialization of list is: ");
	         aManager.Initial();
	     break;

	     //Quit the project
	     case 'Q':
	     case 'q':
		 done = true;
	         break;

	     default:
		 System.out.println("Please enter 'd', 'a' ,'h','l','r','f',or'q'");
	}
	System.out.println();
    }


    public void start ()
    {
	final int FIRST = 0;
	String line  = null;
	char selection = ' ';
	while (done == false)
	{
	    displayMenu();
	    line = in.nextLine();
	    selection = line.charAt(FIRST);
	    processMenu(selection);
	    }
    } 
}