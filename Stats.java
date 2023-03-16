import java.util.*; 
/**
 * Write a description of class Stats here.
 *
 * @author Griffin Heatley
 * @version 3/16/23
 */
public class Stats
{
    private ArrayList<ScoreInfo> scoreList;
    
    //constructor added to compile code 
    public Stats()
    {
      scoreList = new ArrayList<ScoreInfo>(); 
      scoreList.add(new ScoreInfo(1));
      scoreList.add(new ScoreInfo(4));
      
    }
    //part a
    public boolean record(int score)
    {
        for(int i = 0; i < scoreList.size(); i++)
        {
            if(score == scoreList.get(i).getScore())
            {
                scoreList.get(i).increment();
                return false;
            }
        }
        ScoreInfo newScore = new ScoreInfo(score);
        for(int i = 0; i < scoreList.size(); i++)
        {
            if(score < scoreList.get(i).getScore())
            {
                scoreList.add(i-1, newScore);
            }
        }
        return true;    
    }
        
    //part b 
    public void recordScores(int[] stuScores)
    {
       
        
        
    } 
    
    //added to test code 
    public String toString()
    {
        return scoreList.toString(); 
               
    }
    
    
    //code to test methods 
    public static void main (String[] args)
    {
        Stats a = new Stats();
        //boolean response = a.record(6);
        //System.out.println(response);
        int [] stuScores = {2,5,8,9,10,5,2,11};
        a.recordScores(stuScores); 
       
        System.out.println(a); 
       
        
        
    } 
   
}
