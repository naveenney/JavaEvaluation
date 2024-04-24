package exercises;

import java.util.*;

public class Frequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array Size:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value:");
			arr[i] = sc.nextInt();
		}

		Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
		sortedEntries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

		System.out.println("Array elements arranged in descending order frequency:");
		for (Map.Entry<Integer, Integer> entry : sortedEntries) {
			int num = entry.getKey();
			int frequency = entry.getValue();
			for (int i = 0; i < frequency; i++) {
				System.out.print(num + " ");
			}
		}
	}
}
