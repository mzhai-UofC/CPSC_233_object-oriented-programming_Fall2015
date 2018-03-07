/*  Nmae: Muzhou,Zhai ID:10106810 CPSC233-L01-T04

   Version: Dec.3rd, 2015
   
   Features: class 'Movie' with the 4 attributes (Movie name, The names of the first three cast members, 
   The genre of the movie, The number of stars (the rating of the movie).
 */
public class Movie
{
    String name;
    String[]name1=new String[3];
    String s0=name1[0];
    String s1=name1[1];
    String s2=name1[2];
    private String s= name+"/t"+s0+"/t"+s1+"/t"+s2;
    
    
    public Movie(String ss)
    {
	    s = ss;
    }

    public String getName()
    {
	return(s);
    }

    public void setName(String ss)
    {
	s = ss;
    }
    
    public String toString()
    {
    	String temp;
	    if (s != null){
	        temp = "Movie name: " + s;
	} 
	    else{
	        temp = "Movie name: No-name";
	}
	    return(temp);
    }
    
}
 