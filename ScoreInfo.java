
/**
 * Write a description of class ScoreInfo here.
 *
 * @author Griffin Heatley
 * @version 3/16/23
 */
public class ScoreInfo
{
    private int score;
    private int numStudents;
    
    public ScoreInfo(int aScore)
    {
        score = aScore;
        numStudents = 1;
    }
    
    public void increment()
    {
        numStudents++;
    }
    
    public int getScore()
    {
       return score; 
    }
    public int getFrequency()
    {
        
        return numStudents;
    }
    
    public String toString() // added to check output
    {
    return("The score is "+ getScore() + " and the frequency is  " + getFrequency()+"\n"); 
     }
      
  
}
//