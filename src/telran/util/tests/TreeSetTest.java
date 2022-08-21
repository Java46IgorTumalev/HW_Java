package telran.util.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.Collection;
import telran.util.TreeSet;

public class TreeSetTest extends SetTests {
    TreeSet<Integer> tree;
	@Override
	protected Collection<Integer> createCollection() {
		
		return new TreeSet<Integer>();
	}
	@Override
	@BeforeEach
	void setUp() throws Exception {
		super.setUp();
		tree = (TreeSet<Integer>)collection;
	}
	@Test
	@Override
	void toArrayTest() {
		Arrays.sort(expected);
		super.toArrayTest();
	}
	@Test
	void firstTest() {
		assertEquals((Integer)(-5), tree.first());
	}
	@Test
	void lastTest() {
		assertEquals((Integer)(40), tree.last());
	}

	@Test
	void displayRotatedTest() {
		tree.displayRotated();
	}
	
	@Test
	void displayDirectoryTest() {
		tree.displayAsDirectory();
		//  lesenka po ocheredi 10 -5 13 20 ... i td
	}
	
	@Test
	void heightTest() {
		assertEquals(4, tree.height());
	}
	@Test
	void weightTest() {
		assertEquals(3, tree.width());
	}
	@Test
	void inversionTest() {
		tree.inversion();
		Integer expected1[] = {40, 20, 15, 13, 10, -5};
		assertArrayEquals(expected1, tree.toArray(new Integer[0]));
		containsTest();
		
	}
	
}
//package telran.util.tests;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.Arrays;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import telran.util.Collection;
//import telran.util.TreeSet;
//
//public class TreeSetTest extends SetTests {
//    TreeSet<Integer> tree;
//	@Override
//	protected Collection<Integer> createCollection() {
//		
//		return new TreeSet<Integer>();
//	}
//	@Override
//	@BeforeEach
//	void setUp() {
//		this.setUp();
//		tree = (TreeSet<Integer>)collection;
//	}
//	@Test
//	@Override
//	void toArrayTest() {
//		Arrays.sort(expected);
//		super.toArrayTest();
//		
//	}
//	@Test
//	void firstTest() {
//		assertEquals((Integer)(-5), tree.first());
//	}
//	@Test
//	void lastTest() {
//		assertEquals((Integer)(-5), tree.first());
//	}
//
//
//}
