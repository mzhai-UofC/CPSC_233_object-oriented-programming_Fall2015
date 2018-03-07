import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
/*
 * Assignment 5
 * Name: Muzhou,Zhai   ID:10106810
 * L01-T04
 * 
 * Version: Nov.25, 2015
 */
//A class for an observer to register to receive notifications of changes to a text document.
public class MyDocumentListener implements DocumentListener
{
	// Method that provides detailed information to Document observers about how the Document changed.
    public void method(DocumentEvent e)
    {
    	//Gets the document that sourced the change event.
	    Document document = e.getDocument();
	    try
	    {
		//Fetches the text contained within the given portion of the document.
	    String s = document.getText(0,document.getLength());
	    System.out.println(s);
	    }
	    //This exception is to report bad locations within a document model 
	    catch (BadLocationException ex)
	    {
	    System.out.println(ex);
	    }
    }
    
    //This method gives notification that an attribute or set of attributes changed.
    public void changedUpdate(DocumentEvent e)
    {
	   System.out.println("updated");
	   method(e);
    }

    //This method gives notification that there was an insert into the document.
    public void insertUpdate(DocumentEvent e)
    {
	   System.out.println("insert");
	   System.out.println(e.getLength());
	   method(e);
    }
    
    //This method gives notification that a portion of the document has been removed. 
    public void removeUpdate(DocumentEvent e)
    {
	   System.out.println("removed");
	    method(e);
    }
}