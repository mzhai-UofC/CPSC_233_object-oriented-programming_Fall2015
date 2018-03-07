/*Name:Muzhou,Zhai  ID:10106810
 *CPSC 233-L01-T04
 *Version:Nov.11,2015 11:11pm
 * A Button Controller can creating and controlling button events.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyButtonListener implements ActionListener {
	//A semantic event which indicates that a component-defined action occurred.
	public void actionPerformed(ActionEvent e){
		JButton aButton=(JButton) e.getSource();
		//When the button is being pressed, changes the text on the button.
		aButton.setText("Pressed");
		
		//Creating a small new frame, so that it can appears after the button is being pressed.
	    MyFrame frame=new MyFrame();
	    //Creating the WindowListener for the new frame.
		MyWindowListener listener=new MyWindowListener();
		frame.addWindowListener(listener);
		//Setting the size of the the new frame.
		frame.setSize(250,150);
	    frame.setTitle("Pressed");
	    //Setting the new frame visible.
		frame.setVisible(true);
	}
}

	
	