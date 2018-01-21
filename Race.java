import java.util.ArrayList;
import java.io.*;

/**
 * Main class; run this with file path as command line argument
 * Prints minimum Rally employees needed to System.out
 */
public class Race{
  
  public static void main(String[] args){
    String line = null;
    try{
      RallyRunners rally = new RallyRunners();
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      while ((line = br.readLine()) != null){
        rally.add(new RunnerGroup(line));
      }
      System.out.println(rally.getNumRally());
    }
    catch(FileNotFoundException e){
      System.out.println("Error. Unable to open file.");
    }
    catch (IOException e){
      System.out.println("Error reading file.");
    }
  }
}