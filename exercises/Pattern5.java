package exercises;

import java.util.Scanner;

public class Pattern5 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the value");
		int n = scanner.nextInt();
		new Pattern5().printPattern(n);
	}

	private void printPattern(int n) {
		int[][] spMatrix = new int[n][n];
		int rStrt = 0, rEnd = n - 1, colStrt = 0, colEnd = n - 1;
		int sp = 1;
		while (rStrt <= rEnd) {
			for (int i = rStrt; i <= rEnd; i++) {
				spMatrix[rStrt][i] = sp;
			}
			rStrt++;
			for (int i = rStrt; i <= colEnd; i++) {
				spMatrix[i][colEnd] = sp;
			}
			colEnd--;
			for (int i = colEnd; i >= colStrt; i--) {
				spMatrix[rEnd][i] = sp;
			}
			rEnd--;
			for (int i = rEnd; i >= rStrt; i--) {
				spMatrix[i][colStrt] = sp;
			}
			colStrt++;
			if (sp == 1)
				sp = 0;
			else
				sp = 1;
		}

		for (int[] i : spMatrix) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
