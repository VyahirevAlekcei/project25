package proverka25;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.Massiv;



public class Test2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {;
		Integer[] MassiveTest = Massiv.Massive2(7);
		Integer I = MassiveTest.length;
		Integer right = 7;
		assertEquals(right,I);
		I--;
		while(I > 0) {
			if (MassiveTest[I] == null) {
				fail("Not yet implemented");
			}
			I--;
		}
	}

}
