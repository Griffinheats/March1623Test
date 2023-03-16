
/**
 * Write a description of class Seat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seat
{
    private boolean available;
    private int tier;
    public Seat(boolean isAvail, int tierNum)
    {
        
       available = isAvail;
       tier = tierNum;
        
    }
    public boolean isAavilable()
    {
      return available;  
    }
    public int getTier()
    {
        
        return tier;
    }
    
    public void setAvailability (boolean isAvail)
    {
        available = isAvail;
        
    }
   
    
}
