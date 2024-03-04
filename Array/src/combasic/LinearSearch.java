package combasic;

import java.util.Scanner;

public class LinearSearch {
	public static int searchelement(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Print the Index of elemnt " + i);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter a size of elemnet ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter array elements ");
		int[] myarr = new int[n];
		for (int i = 0; i < myarr.length; i++) {
			myarr[i] = sc.nextInt();
		}
		System.out.println("Enter target element ");
		int target = sc.nextInt();
		searchelement(myarr, target);

	}

}
