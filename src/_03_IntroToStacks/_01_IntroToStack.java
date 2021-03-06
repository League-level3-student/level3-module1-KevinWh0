package _03_IntroToStacks;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			stack.push(rand.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		Scanner in = new Scanner(System.in); 
		
		
		System.out.println("Enter a number");
		String input = in.nextLine();
		int inputNum = Integer.parseInt(input);
		
		System.out.println("Enter a second number");
		String input2 = in.nextLine();
		int inputNum2 = Integer.parseInt(input2);
		
		
		double j;
		//int count = 0;
		for (int i = 0; i < 100; i++) {
			j = Double.parseDouble(stack.pop().toString());
			
			if(j > inputNum && j < inputNum2 || j < inputNum && j > inputNum2) {
				System.out.println(j);
				//count++;
			}
		}
		//System.err.println(count);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
