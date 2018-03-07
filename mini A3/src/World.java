/*
 * MiniAssignment3
 * Muzhou,Zhai(10106810)
 */

import java.util.Scanner;
public class World {
    //attributes
	private Entity[][]grid;//simulated world
	private int maxRow=5;
	private int maxColumn=5;
	
	//constructor
	public World(){
		//A 5*5 grid
	    grid=new Entity[maxRow][maxColumn];
	    //Entity starts[1][1] 
	    grid[1][1]=new Entity();
	    Entity aEntity=new Entity();
	    aEntity.getAppearance();
	   
	    
	}
	
	//Initialization: setting every unit to null
	public void wipe(){
		int r;
		int c;
        for(r=0;r<maxRow;r++){
        	for(c=0;c<maxColumn;c++){
        		grid[r][c]=null;
        	}
        }
	}
	
	public void move(){	
		
		Scanner in=new Scanner(System.in);
	    System.out.println("Destination row(0-5)");
	    int row=in.nextInt();
	    System.out.println("Destination column(0-5)");
	    int column=in.nextInt();
	    grid=new Entity[row][column];
	    Entity Entity1=new Entity();
	    int row1;
		int column1;
		
		//if the (row/column) within the range of(5/5)
		if((row>=0&&row<=5)&&(column>=0&&column<=5)){
			
	         System.out.println(" - - - - -");
			 for(row1=0;row1<maxRow;row1++){
	        	 for(column1=0;column1<maxColumn;column1++){
	        		if((row1==row)&&(column1==column))
	        		System.out.print("|"+Entity1.DEFAULT);
	        		else
	        	    System.out.print("| ");
	        	}
	        	    System.out.println("|");
	        	    System.out.println(" - - - - -");//switch a new line
	            }
			    move();
			}
		     
	
		//if the (row/column) outside the range of(5/5)  
		/*else if(((row<=5)&&(column>5))||((column>=0&&column<=5)&&(row<0||row>5))){
			wipe();
			grid[1][1]=new Entity();
			
			for(row1=0;row1<maxRow;row1++){
	        	for(column1=0;column1<maxColumn;column1++){
	        		if(grid[row1][column1]==null){
	        		
	        			System.out.print("| ");
	        			}
	        		else
	        			System.out.print("|"+Entity1.DEFAULT);
	        	}
	        	System.out.println("|");
	        	System.out.println(" - - - - -");//switch a new line
	            }	
        	System.out.println("Row/Column: "+row+"/"+column);
        	System.out.println("Outside World");
        	System.out.println("End simulation");
        	}	*/
		
	
		
		else {
			wipe();
			grid[1][1]=new Entity();
			
			for(row1=0;row1<maxRow;row1++){
	        	for(column1=0;column1<maxColumn;column1++){
	        		if(grid[row1][column1]==null){
	        		
	        			System.out.print("| ");
	        			}
	        		else
	        			System.out.print("|"+Entity1.DEFAULT);
	        	}
	        	System.out.println("|");
	        	System.out.println(" - - - - -");//switch a new line
	            }	
        	System.out.println("Row/Column: "+row+"/"+column);
        	System.out.println("Outside World");
        	System.out.println("End simulation");
        	}	
	
	}	
	}
		
	
	   
			