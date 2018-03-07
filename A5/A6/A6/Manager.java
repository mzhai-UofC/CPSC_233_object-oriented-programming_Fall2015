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
    private String LIST_HEADER = "DISPLAYING LIST";
    private Scanner in = new Scanner(System.in);

    public Manager()
    {
        MovieNode head = null;
    }
    //The method that can add a new movie to the list.
    public void add()
    {
        String title;
        String castOne, castTwo, castThree;
        String genre;
        int star;
        Movie newMovie;
        MovieNode newNode;
        boolean genreType = false;
        boolean starType=false;
        
        System.out.println("Adding a new Movie");
        System.out.println("Movie title: ");
        title = in.next();
        
        System.out.println("Movie cast:");
        System.out.println("Please enter the first actor/actress:");
        castOne=in.next();
        System.out.println("Please enter the second actor/actress:");
        castTwo=in.next();
        System.out.println("Please enter the third actor/actress:");
        castThree=in.next();
        
        System.out.println("Please enter the genre: like action, drama, science fiction, comedy, horror, martial arts or 'other': ");
        genre=in.next();
        //A test loop for the genre type
        while(genreType==false){
        String genre1 = genre;
        
        if(genre1.equals("action")||genre1.equals("drama")||genre1.equals("science fiction")||genre1.equals("comedy")||genre1.equals("horror")||genre1.equals("martial arts")||genre1.equals("others")){
        	genreType=true;
        	genre=genre1;  
        }
        else{
        	System.out.println("Please enter a right type of genre:");
            genre=in.next();
            }
        }
        
        System.out.println("Please enter the rating of the movie (integers from 1 to 5):");
        star=in.nextInt();
        //A test loop for the input of star.
        while(starType==false){
            int star1 = star;
            
            if(star>=1&&star<=5){
            	starType=true;
            	star=star1;
            }
            else{
            	System.out.println("Please enter the rating of the movie (integers from 1 to 5):");
                star=in.nextInt();
            }
        }
        newMovie = new Movie(title,castOne,castTwo,castThree,genre,star);
        newNode=new MovieNode(newMovie,null);
        
        // Case 1: List empty: new node becomes first node
        if (head == null)
        {
           head=newNode;
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
    
    //  Displays list in current order.
    public void display()
    {
        int count = 1;
        MovieNode temp = head;
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
            System.out.println("*********************");
        }
        System.out.println();
    System.out.print("Hit enter to continue");
    in.nextLine();
    }
    

    

    // What it does: Displays list in reverse order.
    public void opposite()
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

    //Displays list in current order.
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
    
    //A method that remove a movie from the list.
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
    //A method that search a movie in the list and display it.
    public void search ()
    {
        // CASE 1: EMPTY LIST
        if (head == null)
            System.out.println("List is already empty: Nothing to search");

        // CASE 2: NON-EMPTY LIST
        else
        {
            searchNonempty();
        }
    }

    // Case 2 & 3:
    private void searchNonempty()
    { 
        MovieNode previous = null;
        MovieNode current = head;
        String searchName = null;
        boolean isFound = false;
        String currentName;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of Movie for searching: ");
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
            System.out.println("The book you are searching is called " + searchName);
            
            // CASE 2A: REMOVE THE FIRST NODE
            if (previous == null){
                head = head.getNext();
                System.out.println(current);
               
            }
            else
            	System.out.println(current);
                previous.setNext(current.getNext());
        }

        // CASE 3: NO MATCHES FOUND (NOTHING TO REMOVE).
        else  // isFound == false
            System.out.println("No book called " + searchName +
                              " in the collection.");
    }
    //Helper shows the dirction for the program.
    public void helper(){
    	System.out.println("Welcome to the helper!");
    	System.out.println("Rating:");
    	System.out.println("1 star (It sucks): It's not the type of movie that's so bad that it's good, it's just all bad. Don't waste your time with this one.");
    	System.out.println("2 stars (Poor): Overall there were more things that I disliked than liked with this movie. Unless there's a ticket sale it's probably one that you should avoid.");
    	System.out.println("3 stars (Average): There were some things that I liked and some things that I disliked. It's one that you may want to rent/stream rather than buy.");
    	System.out.println("4 stars (Good): This movie has some flaws but overall you'll have a great time watching it.");
    	System.out.println("5 stars (A true masterpiece!): I laughed, I cried, it became a part of me. It should definitely be nominated for an Oscar (maybe several).");
    }

}
   
