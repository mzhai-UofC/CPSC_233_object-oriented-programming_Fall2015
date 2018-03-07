/*
   Nmae: Muzhou,Zhai ID:10106810 CPSC233-L01-T04

   Version: Dec.3rd, 2015

   Features: A class contains methods for different fuctions in the userInterface.
*/
import java.util.Scanner;

public class Manager
{
    private static final int MATCH = 0;
    private MovieNode head;
    private MovieNode cast[];
    private String LIST_HEADER = "DISPLAYING LIST";
    private Scanner in = new Scanner(System.in);
    private String array[] = new String[3];
    public Manager()
    {
    	MovieNode head = null;
    	MovieNode cast[] = null;
    }

	public void add()
    {
        String title;
        
        Movie newMovie;
        Movie newMovieArray;
        MovieNode newNode;

	    System.out.println("Adding a new Movie");
        System.out.print("Movie title: ");
        title = in.nextLine();
        newMovie = new Movie(title);

        System.out.println("Movie cast: ");
        System.out.println("Please enter the first actor/actress:");
        newMovieArray=new Movie(array[0]);
        array[0] = in.nextLine();

        System.out.println("Please enter the second actor/actress:");
        newMovieArray=new Movie(array[1]);
        array[1] = in.nextLine();
        
        System.out.println("Please enter the third actor/actress:");
        newMovieArray=new Movie(array[2]);
        array[2] = in.nextLine();
        
        newNode = new MovieNode(newMovie,null);


        // Case 1: List empty: new node becomes first node
        if (head == null)
        {
            head = newNode; 
        }
        // Case 2: Node not empty, find insertion point (end of list)
        else
        {
        	MovieNode current = head;
        	MovieNode previous = null;
            // Traverse list: when current is null end is reached
            // Previous reference is one step back and will refer to
            // the last node in the list.
            while (current != null)
            {
                previous = current;
                current = current.getNext();
            }
            // Previous refers to last node. Link in new node but adding
            // it to the end (last node's next pointer refers to the new
            // node).
            previous.setNext(newNode);
            // Adds node to end: since a node's next field is 
            // already set to null at creation, nothing else
            // needs to be done.
        }
    }

    // What it does: Displays list in current order.
    // How: Iteration
    public void display()
    {
	    int count = 1;
	    MovieNode temp=head;
	    
        System.out.println(LIST_HEADER);
        for (int i = 0; i < LIST_HEADER.length(); i++)
            System.out.print("-");
        System.out.println();
        if (temp == null)
            System.out.println("\tList is empty: nothing to display");
        while (temp != null)
        {
            System.out.println("#" + count + ": " + temp);
            
	    temp = temp.getNext();
	    count = count + 1;
	}
	System.out.println();
    System.out.print("Hit enter to continue");
    in.nextLine();
    }

    // What it does: Displays list in current order.
    // How: Displays data for a node, moves onto next node and recursive call again.
    private void displayAndRecurse(MovieNode temp, int count)
    {
        // Stop when end of list reached
        if (temp == null)
            return;
        else
        {
           // Display data and move onto next element
            System.out.println("\t#" + count + ": " + temp);
	      temp = temp.getNext();
	      count = count + 1;
            displayAndRecurse(temp,count);
        }

    }

    // What it does: Displays list in current order.
    // How: Recursion
    public void displayRecursive()
    {
    	MovieNode temp = head;
        System.out.println("DISPLAYING LIST (R)");
        for (int i = 0; i < LIST_HEADER.length(); i++)
            System.out.print("-");
        System.out.println();
        if (temp == null)
            System.out.println("\tList is empty: nothing to display");
        else
	{
	    int count = 1;
            displayAndRecurse(temp,count);
	}
	System.out.println();
    }

    public void eraseList ()
    {
	// JT's note: In Java this is okay with other languages such as C/C++ we should
	// manually step through the list element by element and de-allocate or free up
	// the memory taken up by the list.
     System.out.println("Destroying the contents of entire list");
	head = null;
    }

    public void remove ()
    {

	// CASE 1: EMPTY LIST
	if (head == null)
	    System.out.println("List is already empty: Nothing to remove");

	// CASE 2: NON-EMPTY LIST  
	else
	{
            removeNonempty();
        }
    } 

    // Case 2 & 3:
    private void removeNonempty()
    {
    	MovieNode previous = null;
    	MovieNode current = head;
	    String searchName = null;
	    boolean isFound = false;
	    String currentName;
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter name of book to remove: ");
	    searchName = in.nextLine();      

        while ((current != null) && (isFound == false))
	{
	    currentName = current.getData().getName();
	    if (searchName.compareToIgnoreCase(currentName) == MATCH)
	        isFound = true;
	    else
	    {
	        previous = current;
		current = current.getNext();
	    }
	}

        // CASE 2A OR 2B: MATCH FOUND (REMOVE A NODE)         
	if (isFound == true)
	{
	    System.out.println("Removing book called " + searchName);
	    // CASE 2A: REMOVE THE FIRST NODE
	    if (previous == null)
	        head = head.getNext();
	    // CASE 2B: REMOVE ANY NODE EXCEPT FOR THE FIRST 
	    else
	        previous.setNext(current.getNext());
	}

	// CASE 3: NO MATCHES FOUND (NOTHING TO REMOVE).
	else  // isFound == false
	    System.out.println("No book called " + searchName + 
			      " in the collection.");
    }

    /* Remove from here onwards */
    // What it does: Displays list in current order.
    // How: Displays data for a node, moves onto next node and recursive call again.
    private void recurseAndDisplay(MovieNode temp, int count)
    {
        if (temp.getNext() == null)
	{
            System.out.println("\t#" + count + ": " + temp);
            return;
        }
        else
        {
	    temp = temp.getNext();
	    count = count + 1;
            displayAndRecurse(temp,count);
        }

    }

}


/*public class Manager {
	    //constrctor
        public  Manager(){

        }

        //Add a movie to the collection
        public void add(){

        }

        //Display implemented
        public void display(){

        }

        //Search
        public void search(){
        	
        }
        
        //Remove a movie from the list
        public void remove(){
        	
        }

        //Opposite order display
        public void opposite(){
        	
        }
        
        //helper
        public void helper(){
        	
        }
}*/