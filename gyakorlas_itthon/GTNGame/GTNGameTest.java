
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import java.util.*;

public class GTNGameTest {
  @Test
  public void testMaxValueSetter() {
	String tmp[] = new String []{"5"};
    GTNGame testValue = new GTNGame(tmp);
	//System.out.println("testValue.getMaxNum(): " + testValue.getMaxNum());
	assertTrue(testValue.getMaxNum() == 5);
  }
  
  @Test
  public void testSetTheGuessedNumber() {
	String tmp[] = new String []{"5"};
    GTNGame testValue = new GTNGame(tmp);
	assertTrue(testValue.getTheGuessedNumber() < 5);
  }
  
/*  @Test
  public void testNullNameAtMake() {
    Fruit myFruit = new Fruit();
	//myFruit = myFruit.make("alma",-1);
	assertTrue(myFruit.getName() == null);
  }

  @Test
  public void manualSuccess() {
    return;
  }

  @Test
  public void manualFail() {
    fail("Always fails");
    assertTrue(1 == 1);
  }

  @Test
  public void testUnexpectedException() {
    throw new RuntimeException("Varatlan hiba tortent");
  }

  @Test(expected = RuntimeException.class)
  public void testExpectedException() {
    throw new RuntimeException("Varakozasnak megfelelo hiba tortent");
  }

  @Test
  public void testExpectedException2() {
    try{
      int x = 3/0;
      fail("Nem tortent kivitel");
    } catch(ArithmeticException e){}
  }


  @Test(timeout=2000)
  public void abortWhenInfiniteLoop(){
    while(true){}
  }*/
}
