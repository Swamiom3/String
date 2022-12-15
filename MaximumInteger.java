package Assignments;
public class MaximumInteger {

	public static void main(String[] args) {
		int a=12345;
		int b=23;
		int maxNumber = Integer.MAX_VALUE;

		System.out.println("maxNumber: " + maxNumber);

		int number1 = Integer.MAX_VALUE - 1;

		System.out.println("number1: " + number1);

		if (number1 < maxNumber) {
			System.out.println("number1 < maxNumber");
		}
	}
}