/*
 * Assignment 5
 * Name: Muzhou,Zhai   ID:10106810
 * L01-T04
 * 
 * Version: Nov.25, 2015
 * 
 * To-do: Creating a simple graphical user interface which contains:
 *        -a JFrame container
 *        -a JTextField and JTextArea for the name and address input areas 
 *        -Jlabels to describe the input fields
 *        -two JButtons to handle most of the user interaction
 *        -The full version of the program will employ the GridBagLayoutfor the main shopping window
 *        -2 imageIcons will be used to adorn the buttons
 *        -a image in the container with an appropriate company logo.
 *  
 * Features: It is a simple graphical user interface that has two buttons have different functions.
 *           -The "save" button: When pressed this button will take the current information in the 
 *            name and address and save it to a plain text file called "order.txt".
 *           -The "Clear" button: After pressing the button, the two input fields will be cleared of text.
 *
 * Limitation:None
 */

public class Driver
{
    public static void main(String [] args)
    {
	   MyFrame aFrame = new MyFrame();
	   aFrame.setVisible(true);
	   //Adding a window event.
	   MyWindowListener aListener=new MyWindowListener();
	   aFrame.addWindowListener(aListener);
    }
}