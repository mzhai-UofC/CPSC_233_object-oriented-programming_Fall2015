/*Name:Muzhou,Zhai ID:10106810
 * cpsc233 L01-T04
 * 
 * Version: Oct.9.2011
 * 
 * Feature:-A child of class Car that has a different appearance ('V') and different movement options:
 * -under normal driving mode the distance traveled is still the default rate of 2 but fuel consumption is 3 units
 * -under AWD mode the car can still move when there is a blizzard albeit at a reduce speed
 * The fuel tank is larger with a capacity of 50 units
 */
public class SUV extends Car {
	public static final int STARTING_FUEL_V = 50;
    public static final int STANDARD_DISTANCE_V = 2;
    public static final int CONSUMPTION_RATE_V = 3;
    private char appearance;
	private int fuel;
	public SUV(){
		setAppearance('v');
		fuel = STARTING_FUEL_V;
			
	}
	
	public int moveNormal(){
		consumeFuel(CONSUMPTION_RATE_V);
		int currentFuel;
		int distance = 0;
		currentFuel=fuel-CONSUMPTION_RATE_V;
		distance+=STANDARD_DISTANCE_V;
		System.out.println("Current fuel: " + currentFuel);
	    System.out.println("Fuel use: " + CONSUMPTION_RATE_V);
        System.out.println("Distance Sports Car moves: "+STANDARD_DISTANCE_V);
        return STANDARD_DISTANCE_V;
	}
	
	public int Blizzard(){
		consumeFuel(CONSUMPTION_RATE_V);
		 int currentFuel;
		 int distance = 1;
		 currentFuel=fuel-CONSUMPTION_RATE_V;
		 distance+=STANDARD_DISTANCE_V;
		 System.out.println("Current fuel: " + currentFuel);
	     System.out.println("Fuel use: " + CONSUMPTION_RATE_V);
         System.out.println("Distance Sports Car moves: "+STANDARD_DISTANCE_V);
         return STANDARD_DISTANCE_V;
	}
	public void va(){
		if(fuel>=3){
		    moveNormal();
		    
		}
	}
	
	public void vd(){
		if(fuel>=3){
		    move();
		}
    }
	public int moveWithNewFuel(){
		GameController g=new GameController();
		int feul = g.newFuelV;
		consumeFuel(CONSUMPTION_RATE_V);
		 int currentFuel;
		 int distance = 0;
		 currentFuel=fuel-CONSUMPTION_RATE_V;
		 distance+=STANDARD_DISTANCE_V;
		 System.out.println("Current fuel: " + currentFuel);
	     System.out.println("Fuel use: " + CONSUMPTION_RATE_V);
         System.out.println("Distance Sports Car moves: "+STANDARD_DISTANCE_V);
         return STANDARD_DISTANCE_V;
	}
}