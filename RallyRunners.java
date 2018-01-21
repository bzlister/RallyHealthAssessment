import java.util.ArrayList;
/**
 * Class for calculating the number of Rally employees needed
 * I thought for a long time about making this class a utility class
 * with static methods and reference variables, and a private constructor.
 * Ultimately, I decided on what you see here because it takes advantadge of
 * OOPs concepts - this could be used in an extended version of the project where
 * multiple race locations are considered, for instance.
 */
public class RallyRunners {
  
  private int numRally = 0;
  private int numOther = 0;
  
  /**
   * Recalculates the number of Rally employees based on the habits of a new group of runners
   * @param A RunnerGroup instance for a new group
   */
  public void add(RunnerGroup rg){
    if (rg.getRunNum() > (numRally + numOther))
      this.numRally = Math.max(0, rg.getRunNum() - numOther);
    else if (rg.getRunNum() <= numRally)
      this.numRally = Math.max(0, numRally - rg.getPopulation());
    this.numOther += rg.getPopulation(); 
  }
  
  /**
   * Returns the current number of Rally employees needed
   * @return The minimum number of Rally employees for all known RunnerGroups to run
   */
  public int getNumRally(){
    return numRally;
  }
  
  /**
   * Returns the current number of non-Rally employees running
   * @return The runners in the race so far who aren't Rally employees
   */
  public int getNumOther(){
    return numOther;
  }
}