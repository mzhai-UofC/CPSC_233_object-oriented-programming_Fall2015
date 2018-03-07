/*Name:Muzhou,Zhai(10106810) L01-T04
 * 
 *Version:Oct,29 1:08 2015
 * 
 *To-do:
 *-Creating a "child" class "Bird" of the "parent" class.
 *-Creating an integer attribute "range".
 *-Creating an override method Walk() in the class "Bird". Output a different sentence
 * from the animal class, and reduce the energy by 3.
 * -Implement a fly method in the class "Bird". Output a unique sentence and reduce the 
 * energy by 2. 
 *-Override the toSring() method, calls the parent toString for the attribute "state",
 * output the energy and the range.
 *
 * Features: This is a program contains class inheritance, method overriding and super keyword.
 * It could help understanding of inheritance in Java.
 * 
 * Limitation:None.
 */
//Creating a "child class" "Bird" inherits the "parent class" "Animal". 
//Using the keyword "extends". 
public class Bird extends Animal{
	//Creating a default value range=400
	private static final int DEFAULT_range=400;
	//Creating an integer attribute 'range'.
	private int range;
	//Constructor
	public Bird(){
		//Set the attribute to a default value 400.
	    range=DEFAULT_range;	
	}
	
	//Overriding the walk() method in the Animal class.
	public void walk(){
		//Output message that is different from the message in the walk() in the Animal class.
		System.out.println("Waddle! Waddle!");
		//Reducing the Energy 3 times.
		int i;
		for(i=0;i<3;i++){
		super.reduceEnergy();	
		}
	}
	//Implement a fly() method.
	public void fly(){
		//Display a clear and unique output message.
		System.out.println("UP! Up! And away!");
		//Reducing the energy 2 times.
		int i;
		for(i=0;i<2;i++){
	    super.reduceEnergy();
		}
	}
	//Override the toString() method.
	public String toString()
    {  
		/*Using the "super" keyword recall the toString method() and the attribute "state" 
		in the Animal class.*/ 
        String state = super.toString();
        /*Combine the state("Energy: "+energy) in the class Animal and the attribute "range"
        in the class Bird.*/ 
        state = state + "Range: " + range + "\n";
        //Return the combined state.
        return(state);
    }

}
