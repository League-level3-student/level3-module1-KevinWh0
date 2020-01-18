package _02_Integer_Stack;

public class IntegerStack {
	
	
	
	
	//1. create a private array of integers
	private int[] ints = new int[0];
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	
	public IntegerStack() {
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		//A. create a new array that is one element larger than the member array
		int[] i = new int[ints.length+1];
		//B. set the last element of the new array equal to the integer passed into the method
		i[i.length] = v;
		//C. iterate through the member array and copy all the elements into the new array
		for (int j = 0; j < ints.length; j++) {
			i[j] = ints[j];
		}
		//D. set the member array equal to the new array.
		ints = i;
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		if(ints.length > 0) {
			int i = ints[ints.length-1];
			return i;
		}else {
			return -1;
		}
		//B. create a new array that is one element smaller than the member array
		
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		
		//D. set the member array equal to the new array
		
		//E. return the variable you created in step A
		//return i;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		ints = new int[0];
	}
	
	//6. Complete the size method to return 
	//   the length of the member array
	public int size() {
		return ints.length;
	}
}
