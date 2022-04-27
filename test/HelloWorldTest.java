package test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Random;

import org.junit.jupiter.api.Test;
import  main.HelloWorld;

class HelloWorldTest {
	
	@Test
	void test() {
		Random random = new Random();
		int randomNumber = random.nextInt();
		assertTrue(HelloWorld.numberPlusOne(randomNumber)==randomNumber+1);
	    
		fail("Not yet implemented");
	}

}
