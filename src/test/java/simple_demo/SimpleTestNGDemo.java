package simple_demo;

import org.testng.annotations.Test;

public class SimpleTestNGDemo {
	
	@Test
	public void hello() {
		System.out.println("Hello TestNG!");
	}
	
	@Test (enabled = false)
	public void bye() {
		System.out.println("Goodbye \'main\' method!");
	}
	
	@Test
	public void excited() {
		System.out.println("More fun is ahead!");
	}

}
