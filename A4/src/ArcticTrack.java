//A child of class of Track with the additional ability to generate a blizzard.
//A car traveling during a blizzard will be stuck yet still expend fuel amounts appropriate to the type of car and driving mode
//Each turn there's a 10% chance of a blizzard occurring, otherwise the driving conditions will be normal.
import java.util.Random;

public class ArcticTrack extends Track{
	Sports aSports=new Sports();
	public static final int SIZE = 25;
    private Car [] aTrackA;                                                                 
    private int c;
    private int index;
    
	public ArcticTrack(){
		index=0;
		setLocation(aSports, index);
		aTrackA = new Car[SIZE];
		aSports.setAppearance('p');
	    for (c = 1; c < SIZE; c++){
		aTrackA[c] = null;  
	    }
	     if(c==index){
	     aTrackA[c]=aSports;
	     }
	}
	
	public Car []  getTrackA ()
    {
	return aTrackA;
    }
	
	
	public void move(){
		int i=0;
		for(i=0;i<SIZE;i++){
			index+=3; 
			aTrackA[index]=aSports;
			display();
		}	
	}
	
	public void Blizzard(){
		int i=0;
		int c=0;
		for(i=0;i<SIZE;i++){
			index+=0;
		}
	}
	
	
	public void display(){
		System.out.println("ARTIC TRACK");
	    super.display();
	    }
	
	public void output(){
		Random r=new Random();
	    int n=r.nextInt(100);
	    if(n<10){
		    Blizzard();
	    }
	    else{
		     move();
		     display();
	    }
	}
	
	
	public void CheatLocationP(){
		GameController g=new GameController();
		c=g.newLocationP;
	}
}
