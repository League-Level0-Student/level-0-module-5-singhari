package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PrimeOrNot {
	public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	String inputbase = JOptionPane.showInputDialog(null,"Input a number");
	int input = Integer.parseInt(inputbase);
	boolean prime = true;
		for(int x = 2; x < input; x++) {
		if(input%x == 0) {
		//	System.out.println(x+" is a factor of "+input);
			prime = false;
			arrayList.add(x);
		}
	}
		  //Integer[] array = arrayList.toArray(new Integer[0]);
		if(prime == true) {
			System.out.println(input+" is prime!");
		//	System.out.println("Factors: 1, "+input);
		}
		else {
			System.out.println(input+" is composite.");
			System.out.println("Factors: " + arrayList);
		}
	}
}
