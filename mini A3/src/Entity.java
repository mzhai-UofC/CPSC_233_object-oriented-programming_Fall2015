/*
  Author:  James Tam
  Version: September 2, 2015

*/

public class Entity
{
    public static final char DEFAULT = 'X';
    private char appearance;

    public Entity()
    
    {
        setAppearance(DEFAULT);
    }

    public Entity(char newAppearance)
    {
        setAppearance(newAppearance);
    }

    public char getAppearance()
    {
        return(appearance);
    }

    private void setAppearance(char newAppearance)
    {
        appearance = newAppearance;
    }

		
}