
import java.util.Scanner;
public class Manager {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Number of attack rounds: ");
		System.out.println("Enter percentages for the number of attacks that will be directed: low, medium, high. The total of the three percentagesmust sum to 100%");
		
		String hight0;
		Attacker attacker0=new Attacker();
		attacker0.getHight();
		hight0=attacker0.getHight();
		
		int round=in.nextInt();
		System.out.println("Kombat begins: ");
		System.out.println("-------------------");
		int r;
		if(round<=100&&round>0){
        
            r=round;     
		}
		else{
			r=10;
		}
		
		int i;
		for(i=1;i<=r;i++){
		    Attacker attacker=new Attacker();
            Defender defender=new Defender();
            
            
            System.out.println("round "+i+"...    "+"attacker: "+attacker.hightAttacker()+"    defender: "+defender.hightDefender()+"    "+defender.compare0());    
		}
		System.out.println("Summary of kombat:");
		Defender defender=new Defender();
		System.out.print("Total Block:  "+defender.getHit()+"      ");
		System.out.println("Total Hit:  "+(r-defender.getHit()));
	
		System.out.println("Number of attack rounds: 100.");
		System.out.println("Enter percentages for the number of attacks that will be directed: low, medium, high. The total of the three percentagesmust sum to 100%");
        
		Scanner in1=new Scanner(System.in);
        System.out.println("Percentage of attacks that will be aimed low: "); 
        int l=in1.nextInt();
        
        System.out.println("Percentage of attacks that will be aimed at medium height: ");
        int m=in1.nextInt();
        
        System.out.println("Percentage of attacks that will be aimed high: ");
        int h=in1.nextInt();
        
        int round1=in.nextInt();
		System.out.println("Kombat begins: ");
		System.out.println("-------------------");
		int r;
		if(round<=100&&round>0){
        
            r=round;     
		}
		else{
			r=10;
		}
		
		int k;
		for(k=1;k<=r;k++){
		    Attacker attacker1=new Attacker();
            Defender defender1=new Defender();
            
            
            System.out.println("round "+k+"...    "+"attacker: "+attacker1.hightAttacker()+"    defender: "+defender1.hightDefender()+"    "+defender0.compare0());    
		}
		System.out.println("Summary of kombat:");
		Defender defender1=new Defender();
		System.out.print("Total Block:  "+defender.getHit()+"      ");
		System.out.println("Total Hit:  "+(r-defender.getHit()));
	
	}
	
		}
    


