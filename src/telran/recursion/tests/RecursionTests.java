package telran.recursion.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static telran.recursion.LineRecursion.*
;class RecursionTest {
int count = 0;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void factorialTest() {
		assertEquals(24, factorial(4));
	}
	@Test
	void powTest() {
		assertEquals(1000, pow(10, 3));
		assertEquals(-1000, pow(-10, 3));
		assertEquals(100,pow(-10, 2));
	}
	@Test
	void sumTest() {
		int ar[] = {1, 2, 3, 4};
		assertEquals(10, sum(ar));
	}
	@Test
	void squareTest() {
		assertEquals(100, square(10));
		assertEquals(100, square(-10));
	}
	
//	private void f() {
//		
//		if(Math.random() < 0.99) {
//			f();
//			count++;
//		}
//		
//		
//	}

}

//package telran.recursion.tests;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static telran.recursion.LineRecursion.*
//;class RecursionTest {
//int count = 0;
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@Test
//	void factorialTest() {
//		assertEquals(24, factorial(4));
//	}
//	@Test
//	void powTest() {
//		assertEquals(1000, pow(10, 3));
//		assertEquals(-1000, pow(-10, 3));
//		assertEquals(100,pow(-10, 2));
//	}
//	@Test
//	void sumTest() {
//		int ar[] = {1, 2, 3, 4};
//		assertEquals(10, sum(ar));
//	}
//
////	private void f() {
////		
////		if(Math.random() < 0.99) {
////			f();
////			count++;
////		}
////		
////		
////	}
//
//}
//
////package telran.recursion.tests;
////
////import static org.junit.jupiter.api.Assertions.*;
////import static telran.recursion. 
////
////import org.junit.jupiter.api.Test;
////
////import telran.recursion.LineRecursion;
////
////class RecursionTests {
////
////	@Test
////	void test() {
////		fail("Not yet implemented");
////	}
////	@Test
////	void powTest() {
////		assertEquals(1000, LineRecursion.pow(10, 3));
////		assertEquals(-1000, LineRecursion.pow(-10, 3));
////		assertEquals(100, LineRecursion.pow(-10, 2));
////	}
////
////	@Test
////	void sumTest() {
////		int ar[] = {1,2,3,4};
////		assertEquals(10, 10);
////	}
////}
