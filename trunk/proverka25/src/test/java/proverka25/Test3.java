package proverka25;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.Massive1;
import Laba2.Sorting;

public class Test3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Integer[] MassiveTest = Massive1.Massive2(7);
		Integer I = MassiveTest.length;
		Sorting sorting = new Sorting();
		sorting.sort(MassiveTest);
		I--;
		while(I > 0) {
			if (MassiveTest[I] < MassiveTest[I-1]) {
				fail("Not yet implemented");
			}
			I--;
		}
	}

}
