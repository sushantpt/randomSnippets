package practice;

/* Question: Swap the value of two integer without using third variable.*/

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 9;
		int b = 14;
		
		a = a - b; // 9 - 14 = -5
		b = a + b; // -5 + 14 = 9
		a = b - a; // 9 -- 5 = 14
		
		System.out.println("Value of a was 9, now it is: " + a);
		System.out.println("Value of b was 14, now it is: " + b);
	}
}
