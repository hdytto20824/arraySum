package arraySum;

import java.util.Scanner;

public class arraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Array Size:");
		int arraySize = scanner.nextInt();
		int[] array1 = new int[arraySize];
		int[] array2 = new int[arraySize];

		for (int i = 0; i < array1.length; i++) {
			System.out.printf("Array1-%d：", i + 1);
			int input = scanner.nextInt();
			array1[i] = input;
		}
		System.out.println("");
		for (int i = 0; i < array1.length; i++) {
			System.out.printf("Array2-%d：", i + 1);
			int input = scanner.nextInt();
			array2[i] = input;
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print((array1[i] + array2[i]) + " ");
		}
	}
}