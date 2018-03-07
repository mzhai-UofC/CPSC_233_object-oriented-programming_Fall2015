/*
    All code except for the display() and displayOverCutOff() 
    methods were written by James Tam.
*/

public class Manager
{
    public static final int CUT_OFF = 5;
    private Node head;

    public Manager()
    {
        head = null;
    }

    public void add(Node aNode)
    {
        if (head == null)
        {
            head = aNode;
        }
        else
        {
            Node current = head;
            Node previous = null;
            while (current != null)
            {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(aNode);
        }
    }

    public void display()
    {
    	/*Name: Muzhou,Zhai  ID:10106810  Cpsc233-L01-T04
    	 * 
    	 * Version: Dec02,2015
    	 * 
    	 * To-do:Creating 2 methods in the class Manager, which can output some nodes according to the requirement.
    	 * 
    	 * Features:
    	 * -a method display(): steps through the list starting with the first node and displays the data 
    	 * for each node (on its own line) up to and including the last node.
    	 * -a method displayOverCutOff(): similar to the previous method. However the data for a node will
    	 * only be displayed if it exceeds the cutoff which in this case is defined by the named constant
    	 * "CUT_OFF" in the Manager class.
    	 * 
    	 * Limitations: the method displayOverCutOff() can not control the number of output numbers. For example, 
    	 * if there is a case that all the nodes generated is smaller than 5, than the method displayOverCutOff()
    	 * will finally output nothing.
    	 */
        // Write your code here
    	if (head==null)
    	    System.out.println("Phone list is empty");

    	// Start traversal at head.
    	Node current = head;

    	// While end of list not reached.
    	while (current != null)
    	{
    	    // Show node's data.
    	    System.out.println(current.getData());

    	    // Go on the next node in the list.
    	    current = current.getNext ();
    	}
    }  

    public void displayOverCutOff()
    {
        // Write your code here
    	if (head==null)
        	    System.out.println("Phone list is empty");

        	// Start traversal at head.
        Node current = head;

        	// While end of list not reached.
        while (current != null)
        {
        	//For the node data bigger than the cut_off number show node's data.
            if(current.getData()>CUT_OFF)
        	System.out.println(current.getData());

        	// Go on the next node in the list.
        	current = current.getNext ();
        }	
    }
}