package Tests;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class RemoveCharacter {
	@Test
	public void test() {
	RemoveCharacter char1= new RemoveCharacter();
	String expected="Heo";
        String actual=char1.removeChar1("Heo");
	assertEquals(expected,actual);
	}
    }

  

