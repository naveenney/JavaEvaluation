package exercises;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char input = scanner.next().charAt(0);

		int n = input - 'A' + 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.print((char) ('A' + i));
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			if (i != 0) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.print((char) ('A' + i));
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			if (i != 0) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
	}
}