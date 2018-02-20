import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.Before;

public class FruitTest {
  
	@Test
	public void testMakeReturnNull() {
		String name = "name";
		String price = "price";

		assertEquals(null, Fruit.make(name,price));
	}  

	@Test
	public void testMakeReturnNull2() {
		String name = "name";
		String price = "0.5";

		assertEquals(null, Fruit.make(name,price));
	}

	@Test
	public void testMakeReturnFruit() {
		String name = "name";
		String price = "5";
		Fruit myFruit = Fruit.make(name,price);
		assertEquals(myFruit.getPrice(),5);
	}

	@Test
	public void testcheaperThan() {
		String name = "name";
		String price = "5";
		Fruit myFruit1 = Fruit.make(name,price);
		Fruit myFruit2 = Fruit.make("aaaa","125");
		assertEquals(myFruit1.cheaperThan(myFruit2), true);
	}

	@Test
	public void testFirstMake() {
		List<String> testarguments = Arrays.asList();
		assertEquals("hmmm", Arrays.asList(),Fruit.make(testarguments));
	}
	
	@Test
	public void tooShortName(){
		Fruit fruit = Fruit.make("abdf", "100");
		assertEquals("Single fruit is cheapest", fruit, Fruit.getCheapsetFruit());
	}
	
	/*
		@Before - ral lehet egy adott programrészt minden egyes futás előtt lefuttatni!!
		Ez minden egyes test előtt lefut.
		Ez jó pl egy reseteléshez, inicializáláshoz!
	*/
}