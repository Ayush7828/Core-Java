package combasic;

import java.util.Scanner;

public class MinMumNumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of Array = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of array ");
		int index = 0;
		for (int ele : arr) {
			arr[index++] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		System.out.println("Array Elements");
		for (int ele : arr) {
			if (ele < min) {
				min = ele;
			}

		}
		System.out.print("MiniMum Number of array = " + min + " ");

	}

}
