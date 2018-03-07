/*
  Author:  James Tam
  Version: April 1, 2013

  Starting execution point.

*/


public class Driver
{
    public static void main(String [] args)
    {
        Sports aSports=new Sports();
        SUV aSUV=new SUV();
     
        DesertTrack aDesertTrack=new DesertTrack();
        ArcticTrack aArcticTrack=new ArcticTrack();
        GameController aGameController=new GameController();
        Track aTrack =new Track();
        
        int i=0;
        for(i=0;i<10;i++){
        if(aTrack.isWon()==true){
        	if(aSports.getFuel()<=0){
        		System.out.println("The Sports Car won.");
        	}
        	else{
        		System.out.println("The SUV car won.");
        	}
        }
        	else{
        		aDesertTrack.display();
        		aArcticTrack.display();
        		aGameController.start();
        	
        }
    }
}
}