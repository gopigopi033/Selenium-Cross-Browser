package TestNG;

import org.testng.annotations.Test;

public class ParallelExecutionDemo {

	@Test
	public void middleschool() {
		System.out.println("Current thread for 1 | "+Thread.currentThread().getId());

	}

	@Test
	public void highschool() {
		System.out.println("Current thread for 2 | "+Thread.currentThread().getId());

	}

	@Test
	public void ugengineering() {
		System.out.println("Current thread for 3 | "+Thread.currentThread().getId());
	}

	@Test
	public void pgengineering() {
		System.out.println("Current thread for 4 | "+Thread.currentThread().getId());
	}
}
