import java.util.Random;
//import java.util.Scanner;
public class Attacker{
	String hight;
	public String hightAttacker(){
		 int i;
		 
	        
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
	        
		public String getHight(){
			
			return(hightAttacker());
		}
		/*System.out.println("Number of attack rounds: 100.");
		System.out.println("Enter percentages for the number of attacks that will be directed: low, medium, high. The total of the three percentagesmust sum to 100%");
        
		Scanner in=new Scanner(System.in);
        System.out.println("Percentage of attacks that will be aimed low: "); 
        int l=in.nextInt();
        
        System.out.println("Percentage of attacks that will be aimed at medium height: ");
        int m=in.nextInt();
        
        System.out.println("Percentage of attacks that will be aimed high: ");
        int h=in.nextInt();
        
        Random r=new Random();
		int n0 = r.nextInt(100);
		if(n0< l){ //55个数字的区间，55%的几率

		hight= "Low";

		}else if(n0 < m+l){//[55,95)，40个数字的区间，40%的几率

		hight = "Mideum";

		}else{

		hight= "High";
        
		}
		System.out.println(hight);
		
        }*/
        
    }
	

