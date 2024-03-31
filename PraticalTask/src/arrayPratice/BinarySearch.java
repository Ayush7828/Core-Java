package arrayPratice;

import java.util.Scanner;

public class BinarySearch {
	public static int binsearch(int[] arr, int n) {
		int l = 0, r = arr.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == n) {
				return mid;
			} else if (arr[mid] < n) {
				l = mid + 1;

			} else {
				r = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter a size of array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] myarr = new int[n];
		System.out.println("ENter a array element");
		for (int i = 0; i < myarr.length; i++) {
			myarr[i] = sc.nextInt();
		}
		System.out.println("Enter a search element ");
		int key = sc.nextInt();

		int ans = binsearch(myarr, key);
		if (ans == -1) {
			System.out.println("Element not fount ");
		} else {
			System.out.println("Element found at index = " + ans);
		}

	}

}
