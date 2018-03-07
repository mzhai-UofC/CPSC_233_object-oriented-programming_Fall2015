import java.util.Random;

//A child of class of Track with the additional ability to generate a heat wave.
//A sports car traveling during a heat wave will overheat.
//Each turn there's a 10% chance of a heat wave occurring, otherwise temperature will be normal. 
public class DesertTrack extends Track {
	
	public static final int SIZE = 25;
    private Car [] aTrackD;
    SUV aSUV=new SUV();
    private int c;
    private int index;
    
    public DesertTrack(){
    	index=0;
    	aSUV.setAppearance('v');
    	setLocation(aSUV, index);
    	int c;
    	
		aTrackD = new Car[SIZE];
	    for (c = 1; c < SIZE; c++)
		     aTrackD[c] = null;
	    if(c==index){
	    	aTrackD[c]=aSUV;
	    }
    }
    
    public Car []  getTrackD ()
    {
	return aTrackD;
    }
    
    public void move(){
    	int i=0;
		for(i=0;i<SIZE;i++){
			index+=3;
			aTrackD[index]=aSUV;
			display();
			
		}	
    }
    
    public void HeatWave(){
    	int i=0;
		int c=0;
		for(i=0;i<SIZE;i++){
			index+=1;
		}
    }
    
    public void display(){
		System.out.println("DESERT TRACK");
	    super.display();
	    }
	
	public void output(){
		Random r=new Random();
	    int n=r.nextInt(100);
	    if(n<10){
		    HeatWave();
	    }
	    else{
		     move();
		     display();
	    }
	}
	
    
    public void CheatLocationV(){
		GameController g=new GameController();
		c=g.newLocationV;
	
	}
}
