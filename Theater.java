/**
 * Write a description of class Theater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
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
