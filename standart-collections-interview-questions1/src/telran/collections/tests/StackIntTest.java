package telran.collections.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.StackInt;

class StackIntTest {
	StackInt numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new StackInt(); 
	}
//	
//	Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
//	List<Integer> numbers = Arrays.asList(numbers);
//	List<Integer> listMutable;

	@Test
	void testPop() {
		//TODO
		//removes last number and returns removed number
		//throws exception NoSuchElementException for empty stack
		assertThrows(NoSuchElementException.class, () -> numbers.pop());
		numbers.push(13);
		assertEquals(13, numbers.pop());
		 
	}

	@Test
	void testPush() {
		//TODO
		//adds number at end of a stack
		numbers.push(33);
		assertFalse(numbers.isEmpty());
	}

	@Test
	void testIsEmpty() {
		//TODO
		//returns true if a stack is empty
		assertTrue(numbers.isEmpty());
	}

	@Test
	void testGetMaxNumber() {
		//TODO
		//returns maximal number existing in a stack
				//throws exception NoSuchElementException for empty stack
		assertThrows(NoSuchElementException.class, () -> numbers.getMaxNumber());
		numbers.push(101);
		numbers.push(18);
		numbers.push(10);
		assertEquals(101, numbers.getMaxNumber());
		
	}

}
