import java.util.Random;
public class Defender {
	    public String hight;
		public String hight0;
		public String compare0;
		public String hightDefender(){
		int i;
		int n=0;
		 
			Attacker attacker0=new Attacker();
			attacker0.getHight();
			hight0=attacker0.getHight();
			
	     
	        Random r=new Random();
			int n1 = r.nextInt(3);
			if(n1<1 ){ 
			hight= "Low";
			}
			else if(n1< 2){
			hight = "Mideum";
			}
			else{
			hight= "High";
			} 
			return hight;
			}
		
		
	    int n=0; 
		public  String compare0(){
			if((hight=="High"&&hight0=="High")||(hight=="Mideum"&&hight0=="Mideum")||(hight=="Low"&&hight0=="Low")){
				compare0="Block";
				
			}
			else{
				compare0="Hit";
			}
			return compare0;
			}
			
		public int getHit(){
			return(n);
		}
			
			
		
		}
		
		
		
	


	