import junit.framework.TestCase;
import org.junit.*;
/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class RallyTest extends TestCase {
  
  private RallyRunners rally;
  
  @Before
  public void setUp(){
    rally = new RallyRunners();
  }
  
  public void testRunnerGroupConstructors(){
    RunnerGroup rg1 = new RunnerGroup("17 3");
    RunnerGroup rg2 = new RunnerGroup(17, 3);
    RunnerGroup rg3 = new RunnerGroup("4 23");
    RunnerGroup rg4 = new RunnerGroup(4, 23);
    assertTrue((rg1.getRunNum() == rg2.getRunNum()) && (rg1.getPopulation() == rg2.getPopulation())); 
    assertTrue((rg3.getRunNum() == rg4.getRunNum()) && (rg3.getPopulation() == rg4.getPopulation()));
  }
  
  public void testInOrder() {
    rally.add(new RunnerGroup(1, 3));
    rally.add(new RunnerGroup(2, 1));
    rally.add(new RunnerGroup(4, 1));
    rally.add(new RunnerGroup(7, 6));
    assertTrue(rally.getNumRally() == 2);
  }
  
  public void testReverseOrder() {
    rally.add(new RunnerGroup(-20, 1));
    rally.add(new RunnerGroup(15, 3));
    rally.add(new RunnerGroup(10, 5));
    rally.add(new RunnerGroup(5, 3));
    rally.add(new RunnerGroup(2, 1));
    assertTrue(rally.getNumRally() == 8);
  }
  
  public void testNoOrder() {
    rally.add(new RunnerGroup(0, 2));
    rally.add(new RunnerGroup(6, 3));
    rally.add(new RunnerGroup(3, 1));
    rally.add(new RunnerGroup(19, 4));
    rally.add(new RunnerGroup(5, 2));
    rally.add(new RunnerGroup(8, 9));
    assertTrue(rally.getNumRally() == 2);
  }
  
  public void testInput1() {
    rally.add(new RunnerGroup(2, 1));
    rally.add(new RunnerGroup(3, 1));
    rally.add(new RunnerGroup(6, 3));
    rally.add(new RunnerGroup(7, 6));
    assertTrue(rally.getNumRally() == 4);
  }
  
  public void testInput2() {
    rally.add(new RunnerGroup(0, 1));
    rally.add(new RunnerGroup(1, 1));
    rally.add(new RunnerGroup(2, 1));
    rally.add(new RunnerGroup(3, 1));
    rally.add(new RunnerGroup(4, 1));
    assertTrue(rally.getNumRally() == 0);
  }
}
