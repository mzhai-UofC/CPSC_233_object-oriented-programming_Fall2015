/*
   Nmae: Muzhou,Zhai ID:10106810 CPSC233-L01-T04
   
   Version: Dec.3rd, 2015
   
   To-do: Creating a program that allows a person to manage their movie collection. The program will contains some common
          list management functions such as: adding, displaying, removing or searching. NO limitation for the number of 
          movies that can be added.
          
   Features: -Displays an introduction to the program (describes how it works) each time that it's run. 
             -Displays a sign off exit message to indicate to the user that the program has ended. 
             -Defines class 'Movie' with the 4 attributes described above (Movie name, The names of the first three cast members,
              The genre of the movie, The number of stars (the rating of the movie).
             -Defines class 'MovieNode' (analogous to 'BookNode' from my notes on linked lists) which is a class with two fields: 
              a) 'Data' which is of type 'Movie' 
              b) 'Next' which is a reference to a MovieNode (next node in the list or null for the end of the list).
             -Defines a 'Manager' class which will include methods for all the major list operations (add, remove, search, display,
              Helper, and quit).
             -Declares a head reference/pointer of type 'MovieNode' which is initialized to null. The head reference is an attribute
              of the Manager class.
             -Defines a 'UserInterface' class which is responsible for all interactions with the user (displaying program options, 
              getting user input). This class should not include the actual code for changing/displaying the list itself.
              
   Limitation: None.
 */
public class Driver
{
    public static void main (String [] args)
    {
	UserInterface anInterface = new UserInterface();
	anInterface.start();
    }
}