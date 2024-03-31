package arrayPratice;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		System.out.println("Enter a size of array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] myarr = new int[n];
		System.out.println("ENter a array element");
		for (int i = 0; i < myarr.length; i++) {
			myarr[i] = sc.nextInt();
		}
		System.out.println("Output array");
		for (int arr : myarr) {
			System.out.print(arr + " ");
		}

	}

}
