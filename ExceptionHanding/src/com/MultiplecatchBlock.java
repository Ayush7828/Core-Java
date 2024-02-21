package com;

public class MultiplecatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ek time p ek hi exception try and catch chalega */

		try {
			int a = 10 / 0;
			System.out.println(a);

			int[] arr = { 10, 20, 30, };
			System.out.println(arr[3]);

			String nm = null;
			System.out.println(nm.toUpperCase());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Main Prgram End");
	}

}
