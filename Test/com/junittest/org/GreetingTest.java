/**
 * 
 */
package com.junittest.org;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Revanth
 * Oct 21, 2016
 * HelloJunit
 * GreetingTest.java
 */
public class GreetingTest {

	private Greeting greeting;

	@Before
	public void setup(){
		System.out.println("Setup");
		greeting = new GreetingImpl();
		
	}
	@Test
	public void greetShouldReturnValidName() {
		System.out.println("greetShouldReturnValidName");
		String result = greeting.greet("Revanth");
		assertNotNull(result);
		assertEquals("Hello Revanth", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	
	public void greetShouldThrowException(){
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowBlank(){
		greeting.greet("");
	}
	
	@After
	public void teardown(){
		System.out.println("Teardown");
		greeting = null;
	}
	

}
