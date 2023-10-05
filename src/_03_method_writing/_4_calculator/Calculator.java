package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
//System.out.println("task is number "+task);
		// 3) Call the correct method depending on what option the user chooses
		if(task == 0) {
		int answer = divide(number1, number2);
			result(answer);
		}
		else if(task ==1) {
			int answer = multiply(number1, number2);
			result(answer);
		}
		else if(task == 2) {
			int answer = subtract(number1, number2);
			result(answer);
		}
		else {
			int answer = add(number1, number2);
			result(answer);
		}
		}
		// 4) Call the result() method and put the answer in a pop-up
	
	//add is 3
	//subtract is 2
	//divide is 0
	//multiply is 1
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
	public static int divide(int number1, int number2) {
		int answer = number1/number2;
		return answer;
	}
	public static int multiply(int number1, int number2) {
		int answer = number1*number2;
		return answer;
	}
	public static int subtract(int number1, int number2) {
		int answer = number1-number2;
		return answer;
	}
	public static int add(int number1, int number2) {
		int answer = number1+number2;
		return answer;
	}
	public static void result(int answer) {
		System.out.println("Your answer is "+answer+".");

	}
}

