package exercises;

import java.util.*;

public class HugeNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first array number of digits:");
		int digits = sc.nextInt();

		System.out.println("Enter the second array number of digits:");
		int digits1 = sc.nextInt();

		int[] num1 = new int[digits];
		int[] num2 = new int[digits1];

		for (int i = 0; i < digits; i++) {
			System.out.println("Enter the 1st array value:");
			num1[i] = sc.nextInt();
		}

		for (int i = 0; i < digits1; i++) {
			System.out.println("Enter the 2nd Array value:");
			num2[i] = sc.nextInt();
		}

		List<Integer> sumList = new ArrayList<>();

		int carry = 0;

		int maxLength = Math.max(num1.length, num2.length);
		for (int i = 0; i < maxLength; i++) {
			int digit1 = (i < num1.length) ? num1[num1.length - 1 - i] : 0;
			int digit2 = (i < num2.length) ? num2[num2.length - 1 - i] : 0;
			int sum = digit1 + digit2 + carry;
			sumList.add(0, sum % 10);
			carry = sum / 10;
		}
		if (carry > 0) {
			sumList.add(0, carry);
		}

		int[] sumArray = new int[sumList.size()];
		for (int i = 0; i < sumList.size(); i++) {
			sumArray[i] = sumList.get(i);
		}

		System.out.println("Sum of the two huge numbers:");
		for (int digit : sumArray) {
			System.out.print(digit);
		}
	}

}
