/*Name:Muzhou,Zhai ID:10106810
 * cpsc233 L01-T04
 * 
 * Version: Oct.9.2011
 * 
 * Feature:-A sports car is a child of class Car that has a different appearance ('P') 
 * - with a standard fuel consumption rate of 2 units but the ability to move 3 distance units. 
 * - the fuel tank capacity is only 30 units. 
 * -if there is a heat wave, a sports car will overheat and consume fuel at double the normal rate (move distance is unchanged)
 * 
 */
public class Sports extends Car {
	public static final int STARTING_FUEL_P = 30;
    public static final int STANDARD_DISTANCE_P = 3;
    public static final int CONSUMPTION_RATE_P = 2;
    private char appearance;
    private int fuel;
    
	public Sports(){	
		setAppearance('P');
		fuel = STARTING_FUEL_P;
	}
	
	public int moveNormal(){
		 consumeFuel(CONSUMPTION_RATE_P);
		 int currentFuel;
		 int distance = 0;
		 currentFuel=fuel-CONSUMPTION_RATE_P;
		 distance+=STANDARD_DISTANCE_P;
		 System.out.println("Current fuel: " + currentFuel);
	     System.out.println("Fuel use: " + CONSUMPTION_RATE_P);
         System.out.println("Distance Sports Car moves: "+STANDARD_DISTANCE_P);
	  	 return STANDARD_DISTANCE_P;
	}
	
	public int heatWave(){
		consumeFuel(CONSUMPTION_RATE_P);
	    int currentFuel;
	    int distance = 0;
	    currentFuel=fuel-CONSUMPTION_RATE_P*2;
	    distance+=STANDARD_DISTANCE_P;
	    System.out.println("Current fuel: " + currentFuel);
        System.out.println("Fuel use: " + CONSUMPTION_RATE_P);
        System.out.println("Distance Sports Car moves: "+STANDARD_DISTANCE_P);
 	    return STANDARD_DISTANCE_P;
		
	}
		public void pa(){
			if(fuel>=3){
			    moveNormal();
			    
			}
		}
		
		public void pd(){
			if(fuel>=3){
			    heatWave();
			}
	    }
        
		public int moveWithNewFuel(){
			GameController g=new GameController();
			int feul = g.newFuel;
			consumeFuel(CONSUMPTION_RATE_P);
			 int currentFuel;
			 int distance = 0;
			 currentFuel=fuel-CONSUMPTION_RATE_P;
			 distance+=STANDARD_DISTANCE_P;
			 System.out.println("Current fuel: " + currentFuel);
		     System.out.println("Fuel use: " + CONSUMPTION_RATE_P);
	         System.out.println("Distance Sports Car moves: "+STANDARD_DISTANCE_P);
	         return STANDARD_DISTANCE_P;
		}
		
	
}
		
