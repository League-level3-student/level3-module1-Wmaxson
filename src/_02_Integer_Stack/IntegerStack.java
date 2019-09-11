package _02_Integer_Stack;

import java.util.ArrayList;

public class IntegerStack {
	//1. create a private array of integers
	private int[] intStack;
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	
	public IntegerStack() {
		intStack = new int[0];
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		//A. create a new array that is one element larger than the member array
		int[] intt = new int[intStack.length+1];
		intt[intt.length-1] = v;
		//C. iterate through the member array and copy all the elements into the new array
		for (int i = 0; i < intStack.length; i++) {
			intt[i] = intStack[i];
		}
		
		//D. set the member array equal to the new array.
		intStack = intt;
		
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		int var = intStack[intStack.length-1];
		//B. create a new array that is one element smaller than the member array
		int[] intt = new int[intStack.length-1];
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		for (int i = 0; i < intt.length; i++) {
			intt[i] = intStack[i];
		}
		//D. set the member array equal to the new array
		intStack = intt;
		//E. return the variable you created in step A
		return var;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		
		intStack = new int[0];
		
	}
	
	//6. Complete the size method to return 
	//   the length of the member array
	public int size() {
		return intStack.length;
	}
}
