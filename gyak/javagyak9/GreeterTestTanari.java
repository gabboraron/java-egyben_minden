
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class GreeterTestTanari {
  @Test(expected=IllegalAccessException.class)
  public void testGreetNull() {
    Greeter.greet(null);
  }

  @Test(expected=IllegalAccessException.class)
  public void testGreetEmpty() {
    Greeter.greet("");
  }

  @Test(expected=IllegalAccessException.class)
  public void testGreetSpace() {
    Greeter.greet(" ");
  }
  
  @Test
  public void testGreetHelloworld() {
    String result = Greeter.greet("World");
	assertEquals("Hello, World",result);
	//assertEquals("World is accepted, ...", "Hello world", result);
  }
}
