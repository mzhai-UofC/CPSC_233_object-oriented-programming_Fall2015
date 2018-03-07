
import java.util.Random;
public class Manager {
	
	    int i=0; 
        double g; 
        final int MAX=40;
        public double[]grades=new double[MAX];
        
	    //creating an 1D array with maximum 40 element
        public  Manager(){
	    	double[]grades=new double[MAX];
	    	for(i=0;i<MAX;i++){
	    		grades[i]=-1;
	    	}
	    }
        
        
        //Random generating the array
        public void Grade(){   	
	    	Random generator=new Random();
	    	System.out.println("No.:GPA");
	    	for(i=0;i<MAX;i++){ 
	        grades[i]=generator.nextDouble()*4;
	        g=grades[0];
	    	}
	    	for(i=0;i<grades.length;i++){
	    		
	        	double g1=((int)(grades[i]*10));
	        	
	    		
	    		System.out.println((i+1)+": "+g1/10);
	
	    		g+=(grades[i]);	
	    	}	    	
	    }
       

		//method for getting the average grade    
	    public void Average(){
	    	double g2=((int)((g/MAX)*10));
	    	System.out.println(g2/10);
	    }
	    
	    //method for getting the highest grade
	    public void Highest(){
	    	double max;
	    	max=grades[0];
	    	for(i=0;i<grades.length;i++){
	    		if(grades[i]>max){
	    			max=grades[i];
	    		}	    		
	    	}
	    	double g3=((int)(max*10));
	    	System.out.println(g3/10);   	
	    }
	    
	    //method for getting lowest grade
	    public void Lowest(){
	    	double min;
	    	min=grades[0];
	    	for(i=0;i<grades.length;i++){
	    		if(grades[i]<min){
	    			min=grades[i]; 	
	             }	    
	        }
	    	double g4=((int)(min*10));
	    	System.out.println(g4/10); 
	    }
	    
	    public void Random(){
	    	Random generator=new Random();
	    	System.out.println("No.:GPA");
	    	for(i=0;i<MAX;i++){ 
	        grades[i]=generator.nextDouble()*4;
	       
	    	}
	    	for(i=0;i<grades.length;i++){
	    		
	        	double g0=((int)(grades[i]*10));
	        	System.out.println((i+1)+": "+g0/10);
	
	    		
	    	}	    	
	    }
	    
	    //assign the first 10 element with 
	    public void Initial(){
	    	
	    	System.out.println("No.:GPA");
            for(int i = 0;i < 10;i++){
            	double grade=2.0;
            	
                System.out.println(i+1+":" +grade);
            
            }
            for(int i = 11;i < MAX-10;i++){  
            	double g5=((int)(grades[i+10]*10));
    	    	
                  System.out.println(i+11+":"+g5/10);
                  
             }
         }
     }
      
	   


