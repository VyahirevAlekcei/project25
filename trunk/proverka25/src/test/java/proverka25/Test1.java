package proverka25;

import static org.junit.Assert.*;


import org.junit.Test;

import Laba2.Random;

public class Test1 {

	@Test
	public void test() {
		Integer RandomTest = Random.rand();
		if (RandomTest > 50) {
		if (RandomTest < 95) {
		System.out.println("Всё гуд!");
		}
		else {fail("Not yet implemented");}
		}
		else {fail("Not yet implemented");}
		fail("Not yet implemented");
		}
}
