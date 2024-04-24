package exercises;

import java.util.*;

public class LargestSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array Size:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value:");
			arr[i] = sc.nextInt();
		}
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		List<Integer> maxSumSubarray = new ArrayList<>();
		List<Integer> currentSubarray = new ArrayList<>();

		for (int num : arr) {
			if (num >= 0) {
				currentSum += num;
				currentSubarray.add(num);
				if (currentSum > maxSum) {
					maxSum = currentSum;
					maxSumSubarray = new ArrayList<>(currentSubarray);
				}
			} else {
				currentSum = 0;
				currentSubarray.clear();
			}
		}

		System.out.println("Largest sum contiguous subarray with non-negative elements:");
		for (int num : maxSumSubarray) {
			System.out.print(num + " ");
		}
		System.out.println("\nSum: " + maxSum);
	}
}
