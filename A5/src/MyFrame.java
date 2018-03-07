import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Image;
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
 *        -a image in the container with an appropriate company logo
 *  
 * Features: It is a simple graphical user interface that has two buttons have different functions.
 *           -The "save" button: When pressed this button will take the current information in the 
 *            name and address and save it to a plain text file called "order.txt".
 *           -The "Clear" button: After pressing the button, the two input fields will be cleared of text.
 *
 * Limitation:None
 */

public class MyFrame extends JFrame implements ActionListener
{
	//Creating 2 textAreas for the inputs of name and address.
    private JTextArea text1;
    private JTextArea text2;
    //Creating a TextField frame for the input of name.
    private JTextField operand;
    //Creating 2 buttons for save and clear.
    private JButton aButton1;
    private JButton aButton2;
    //Creating 2 labels for the text "name" and "address".
    private JLabel aLabel1;
    private JLabel aLabel2;
    //Creating a GridBagLayout and a GridBagConstraints.
    private GridBagLayout aLayout;
    private GridBagConstraints aConstraint;
    //s1 and s1 are the inputs text from the 2 textAress. 
    private String s1;
    private String s2;
    //A JLabel for adding a picture
    private JLabel jlpic;
  
    public MyFrame()
    {  
        //Setting the size of the main frame.  
        this.setSize(400,300);
        //Setting the title on the main frame's window.
	    setTitle("Order Information");
	    
	    //The text "save" appear on the button.
	    aButton1 = new JButton("Save");
	    //Setting the button's size.
	    aButton1.setSize(200,20);
	    //Adding action listener.
  	    aButton1.addActionListener(this);
  	    //Adding an icon on the button.
  	    buttonPic1();
  	   
  	    ////The text "clear" appear on the button.
  	    aButton2 = new JButton("Clear");
  	    ////Setting the button's size.
	    aButton2.setSize(200,20);
	    //Adding action listener.
	    aButton2.addActionListener(this);
	    //Adding an icon on the button.
	    buttonPic2();
	   
	    //Setting the text and size of the first label¡£
	    aLabel1 = new JLabel("Name");
	    aLabel1.setSize(200,20);
	   
	    //Setting the text and size of the first label¡£
	    aLabel2 = new JLabel("Address");
	    aLabel2.setSize(200,20);
	    
	    //Putting the picture in the label.
	    jlpic = new JLabel();
	    init1Frame();
	    
	    //textArea for text1.
	    text1 = new JTextArea();
        
	    //textField for operand.
	    operand=new JTextField();
  	   
  	    //textArea for text2.
  	    text2 = new JTextArea();
  	    
	    //Creates a grid bag layout manager.
	    aLayout = new GridBagLayout();
	    //Creates a GridBagConstraint object with all of its fields set to their default value.
	    aConstraint = new GridBagConstraints();
	    //This field specifies the external padding of the component.
	    //the minimum amount of space between the component and the edges of its display area. 
	    aConstraint.insets = new Insets(5,5,5,5);
	   

	    //Put the component at the top-left corner of its display area.
	    aConstraint.anchor = GridBagConstraints.NORTHWEST;
	    //Using the createControls() method.
	    createControls();
	    this.setLayout(aLayout);
	    this.addWidgets();
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    
    //Setting the textAreas' size.
    public void createControls()
    {
        text1 = new JTextArea(1,8);
	    text2 = new JTextArea(3,10);
	    //Setting the textFiels's length.
	    operand=new JTextField(10);
    }
    
    //ActionEvents for the "save" and "clear" button.
    public void actionPerformed(ActionEvent e)
    {
        //When the user click the "save" button.
    	if(e.getSource()==aButton1){
    	    //Getting the text from user's input from the textField.
    	    s1 = text1.getText();
            System.out.println(s1);
       
            //Getting the text from user's input from the textArea.
    	    s2 = text2.getText();
            System.out.println(s2); 
            //Using the output() method to output the inputs to a txt file.
            output();
    	}
    	
    	//When the user click the "clear" button.
    	else{
    		//Setting the text from the textField to "".
    		text1.setText("");
    		//Setting the text from the textArea to "".
        	text2.setText("");
        	 //Using the clear() method to clear the input in the txt file.
        	clear();
    	}
    }
    
    //Using GridBagConstraints to set the location of the components.
    public void addWidget(Component c, int x, int y, int width, int height)
    {
       //Specifies the number of cells in a row for the component's display area.
    	aConstraint.gridx = x;
	    aConstraint.gridy = y;
	    aConstraint.gridwidth = width;
	    aConstraint.gridheight = height;
	    aLayout.setConstraints(c,aConstraint);
	    add(c);
     }
    
    //Using GridBagConstraints to set the location of the components.
    public void addWidgets()
    {
        //Setting the location of the components in the main frame.
        addWidget(jlpic,0,0,2,1);
 	 
	    addWidget(aLabel1,0,1,1,1);
	    addWidget(aLabel2,1,1,1,1);

	    addWidget(text1,0,2,1,1);
	    addWidget(operand,0,2,1,1);
	    addWidget(text2,1,2,1,1);
	   
	    addWidget(aButton1,0,3,1,1);
	    addWidget(aButton2,1,3,1,1);   
    }

    //Adding the icon to the "save" button.
    public void buttonPic1()
    {
        //importing the icon "02.png" from the folder "data"
    	ImageIcon buttonIcon = new ImageIcon("data/02.png");
	    aButton1.setIcon(buttonIcon);
    }
    
   //Adding the icon to the "clear" button.
    public void buttonPic2()
    {
    	//importing the icon "clear.gif" from the folder "data"
    	ImageIcon buttonIcon = new ImageIcon("data/clear.gif");
 	    aButton2.setIcon(buttonIcon);
    }
    
    //Adding a picture into a JLabel "jlpic".
    public void init1Frame()
    {
    	//importing the icon "logo.png" from the folder "data"
        ImageIcon icon = new ImageIcon("data/logo.png");
        //Creates a scaled version of this image.
    	icon.setImage(icon.getImage().getScaledInstance(icon.getIconWidth(),
        //Use the default image-scaling algorithm.
    	icon.getIconHeight(), Image.SCALE_DEFAULT));
    	jlpic.setIcon(icon);
    }
    //A method that output the textArea to the "order.txt" file.
    public void output(){
        PrintWriter pw = null;
        
        s1 = new String(text1.getText());
        s2 = new String(text2.getText());
        try
	    {
        	//import file stream to the file "order.text".
        	pw = new PrintWriter(new FileOutputStream("order.txt"));
        }
        catch (IOException e)
	    {
	    System.out.println("Error writing to file");
	    }
        // Writing the text from textArea to the file "order.text".
        pw.println(s1);
        pw.println(s2);
        pw.println();
        pw.close();
    }   
    //A method that clear the text from the file "order.text".
    public void clear(){
    	//Prints formatted representations of objects to a text-output stream. 
    	PrintWriter pw = null;
    	//Creating a string "line" for set the  text to "   ". 
    	String line = null;
        //Convenience class for writing character files. 
        FileWriter fw = null;
       
    	 try
 	    {
    		 //Location of the file
             fw = new FileWriter("order.txt");
             pw = new PrintWriter(fw);
             //A loop for the two lines for the two textAreas.
             for (int i = 1; i < 3; i++)
 	         {
             	 if(i==1){
             		 //Clearing the text of name.
                     line = "";
                  }
             	 if(i==2){
             		 //Clearing the text of address.
                     line = "";
                  }
             }
             //Letting the fileWriter close.
             fw.close();
         }
    	 
        catch (IOException e)
 	    {
 	        System.out.println("Error writing to file");
 	    }
    }
}