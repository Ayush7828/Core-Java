package praticeLogicalQuestion;

import java.util.Scanner;

public class Search {
	public static int elementsearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Elemnt Found at index = " + i);
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		System.out.println("Enter a size of array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a key");
		int key = sc.nextInt();

		elementsearch(arr, key);
	}

}
