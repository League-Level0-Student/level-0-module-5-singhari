package _01_algorithms._2_fibonacci;

public class FindThatFibonacci {
	public static void main(String[] args) {
		int number1=0;
		int number2=1;
		int sum = number1+number2;
		System.out.print(number1+", "+number2);
		for(int x = 0; x< 30; x++) {
			sum =number1+number2;
	//		System.out.println(number1+", "+number2+", ");
		//	System.out.println("number1 ="+number1+". Number2 ="+number2);
		//    System.out.println("sum="+sum);
			System.out.print(", "+sum);
		    number1 = number2;
		    number2 = sum;
	//		
		}
	}
}
