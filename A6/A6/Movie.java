/* Name muzhou,Zhai ID:10106810 CPSC233-L01-T04

   Version: Dec.3rd, 2015

   Features: class 'Movie' with the 4 attributes (Movie name, The names of the first three cast members,
   The genre of the movie, The number of stars (the rating of the movie).
 */
public class Movie
{
    private String name;
    private String []cast=new String[3];
    private String genre;
    private int star;
    

    public Movie(String aName, String castOne, String castTwo, String castThree, String genre1, int star1)
    {
        name = aName;
        cast[0] = castOne;
        cast[1] = castTwo;
        cast[2] = castThree;
        genre=genre1;
        star=star1;
    }

    public String getName()
    {
        return(name);
       
    }
    
    public String toString()
    {
        String temp;
        
        if (name != null)
            temp = "Movie name: " + name+ "\n"+ cast[0]+"\n"+cast[1]+"\n"+cast[2]+"\n"+genre+"\n"+star;
        else
            temp = "Movie name: No-name";
        return(temp);
    }
    
}