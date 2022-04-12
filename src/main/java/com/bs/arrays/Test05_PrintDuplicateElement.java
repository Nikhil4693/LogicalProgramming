package com.bs.arrays;

public class Test05_PrintDuplicateElement {
	public static void main(String args[]) {
//		// Initialize array
//		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
//		System.out.println("Duplicate elements in given array: ");
//		// Searches for duplicate element
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j])
//					System.out.println(arr[j]);
//			}
//		}
		String str = "Nikhil Wadatkar";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);

//					int k = j;
//					while (k < arr.length) {
//						arr[k] = arr[k + 1];
//						k++;
//					}
				}
			}
		}

	}
}