import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/*
 * Assignment 5
 * Name: Muzhou,Zhai   ID:10106810
 * L01-T04
 * 
 * Version: Nov.25, 2015
 */
//A class of a window event for the main frame.
public class MyWindowListener extends WindowAdapter
{
	//When the window is closing, this event will occur.
    public void windowClosing (WindowEvent e)
    {
    	//Invoked when a window is in the process of being closed. 
        JFrame aFrame = (JFrame) e.getWindow();
        aFrame.setTitle("Windows closing. Will be closed in 3s. ");
        try 
        {
            // Time delay or pause program for 3,000 milliseconds (3 seconds)
            Thread.sleep(3000); 
        }
        catch (InterruptedException ex) 
        {
            System.out.println("Pausing of program was interrupted"); 
        }
           aFrame.setVisible(false);
           //Releases all of the native screen resources used by this Window.
           aFrame.dispose();
    }
}

