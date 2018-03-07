/*
   Nmae: Muzhou,Zhai ID:10106810 CPSC233-L01-T04

   Version: Dec.3rd, 2015

   Features: An userinterface that get user's option and chose the specific method to run and output.
*/
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
        System.out.println("(A)dd a movie to the collection");
        System.out.println("(D)isplay implemented");
        System.out.println("(S)earch");
        System.out.println("(R)emove a movie from the list");
        System.out.println("(O)pposite order display");
        System.out.println("(H)elper");
        System.out.println("(q)uit the program");
        System.out.print("Selection: ");
    }

    public void processMenu (char selection)
    {
        System.out.println();
        switch(selection)
        {
             //(A)dd a movie to the collection
             case 'A':
             case 'a':
                 System.out.println("Add a movie to the collection:");
                 aManager.add();
                 break;

         //(D)isplay implemented
             case 'D':
             case 'd':
                 System.out.println("Display implemented:");
                 aManager.display();
             break;

             //(S)earch
             case 'S' :
             case 's' :
                 System.out.println("S)earch:");
                 //aManager.search();
             break;

             //(R)emove a movie from the list:
             case 'R':
             case 'r':
                 System.out.println("Remove a movie from the list:");
                 aManager.remove();
             break;

             //(O)pposite order display
             case 'O':
             case 'o':
                 System.out.println("Opposite order display: ");
                 //aManager.opposite();
             break;

             //(H)elper
             case 'H':
             case 'h':
                 System.out.println("find a helper for help: ");
                 //aManager.helper();
             break;

             //Quit the project
             case 'Q':
             case 'q':
                 done = true;
                 break;

             default:
                 System.out.println("Please enter 'a', 'd' ,'s','r','o','h',or'q'");
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