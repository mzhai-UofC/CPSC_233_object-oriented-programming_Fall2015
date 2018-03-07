/*Name:Muzhou,Zhai  ID:10106810
 *CPSC 233-L01-T04
 *
 *Version:Nov.11,2015 11:11pm
 * 
 * To-Do:-Implementing a simple graphical user interface with common GUI controls.
 * -Creating classes with common GUI controls (JButton, JFrame) and event handlers (ActionListener).
 * -Creating a frame with a button and also a windowlistener.
 * -When pressing the button, the words on the button changes, and a small new frame occurs.
 * 
 * Features:-This is a simple graphical user interface with common GUI controls and event handlers.
 * -When the program runs it will create a JFrame containing a JButton the latter with some default text.
 * -When the button is pressed two things will happen:
 *     -The text of the button changes to a non-default value.
 *     -Another JFrame window appears that contains the same non-default text contained in the button.
 * -Clicking on the close window control (top right of the JFrame) will 'dispose' of the control 
 * (rather than default 'hide' behavior)
 * 
 * Limitation:None
 */

//An implementation of a "push" button
import javax.swing.JButton;
public class Driver {
	//Setting the width of the first frame.
    public static final int WIDTH=400;
    //Setting the hight of the first frame.
    public static final int HIGHT=300;
    
    public static void main(String[]args){
    	//Creating The first frame.
    	MyFrame aFrame=new MyFrame();
    	//Creating the WindowListener for the first frame.
    	MyWindowListener aListener=new MyWindowListener();
    	aFrame.addWindowListener(aListener);
    	//Setting the frame's size with the WIDTH&HIGHT.
        aFrame.setSize(WIDTH,HIGHT);
        
        //Creating a Button event, the initial text on it is "Not Pressed"
        JButton aButton=new JButton("Not Pressed");
        //Creating a ButtonListener for the Button event.
        MyButtonListener aButtonListener=new MyButtonListener();
        aButton.addActionListener(aButtonListener);
        //Activating the Button.
        aFrame.add(aButton);
        //Let the frame and the button visible.
        aFrame.setVisible(true);
    }
}
