/**
 * A class for representing a group of runners who require the same encouragment to run (corresponds to a line from the
 * input file)
 */
public class RunnerGroup{
 
  private int runNum;
  private int population;
  
  /**
   * Constructor
   * @param String with the format "%d %d"
   * @throws IllegalArgumentException if a negative integer is passed
   */
  public RunnerGroup(String lineInput){
    this.runNum = Integer.parseInt(lineInput.split(" ")[0]);
    this.population = Integer.parseInt(lineInput.split(" ")[1]);
    if ((runNum < 0) || (population < 0))
      throw new IllegalArgumentException("Error. Only whole numbers allowed");
  }
  
  /**
   * Constructor
   * @param Integer for encouragment level
   * @param Integer for the count of such people
   * @throws IllegalArgumentException if a negative integer is passed
   */
  public RunnerGroup(int runNum, int population){
    this.runNum = runNum;
    this.population = population;
    if ((runNum < 0) || (population < 0))
      throw new IllegalArgumentException("Error. Only whole numbers allowed");
  }
  
  /**
   * Changes the runNum (encouragment level) of the group
   * @param the desired runNum
   */
  public void setRunNum(int runNum){
    this.runNum = runNum;
  }
  
  /**
   * Changes the population of the group
   * @param the desired population
   */
  public void setPopulation(int population){
    this.population = population;
  }
  
  /**
   * Returns the runNum of the group
   * @return the group's runNum
   */
  public int getRunNum(){
    return runNum;
  }
  
  /**
   * Returns the population of the group
   * @return the group's population
   */
  public int getPopulation(){
    return population;
  }
}