package telran.util;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StackInt {
	List<Integer> numbers = new ArrayList<Integer>();
	
	
	//TODO fields
		//complexity of all following methods is O[1]
	public int pop() {
		//TODO
		//removes last number and returns removed number
		//throws exception NoSuchElementException for empty stack
		if(numbers.isEmpty()) {
			throw new NoSuchElementException();
		}
		int a = numbers.remove(numbers.size() - 1);
		
		return a;
	}
	
	
	
	public void push(int number) {
		//TODO
		//adds number at end of a stack
		if(number > maxNumber) {
			maxNumber = number;
		}
		numbers.add(maxNumber);
	}
	public boolean isEmpty() {
		//TODO
		//returns true if a stack is empty
		return numbers.isEmpty();
	}
	int maxNumber;
	public int getMaxNumber() {
		//TODO
		//returns maximal number existing in a stack
		//throws exception NoSuchElementException for empty stack
		if(numbers.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return maxNumber;
	}
}
