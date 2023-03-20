/**
 * Write a description of class Theater here.
 *
 * @author Griffin Heatley
 * @version 3/20/23
 */
public class Theater
{
    private Seat[] [] theaterSeats;
    
    //constructor part a 
    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows)
    {
      theaterSeats = new Seat[tier1Rows + tier2Rows][seatsPerRow];
    }
    
    //method part b 
    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol)
    
    {
      if((fromRow <= (theaterSeats.length/2)) || (fromRow > theaterSeats.length/2 && toRow < theaterSeats.length/2))
      {
        theaterSeats[fromRow][fromCol].setAvailability(true);
        theaterSeats[toRow][toCol].setAvailability(false);
        return true;
      }
      else
      {
        return false;
      }
    } 
}
