/**
 * 
 */
package com.junittest.org;

/**
 * @author Revanth
 * Oct 21, 2016
 * HelloJunit
 * GreetingImpl.java
 */
public class GreetingImpl implements Greeting {

	/* (non-Javadoc)
	 * @see com.junittest.org.Greeting#greet(java.lang.String)
	 */
	@Override
	public String greet(String Name) {
		
		if (Name == null || Name.length() == 0){
			throw new IllegalArgumentException();
		}
		
		return "Hello"+" "+Name;
	}

}
