package com.suresh.Java.practice;

public class BubbleSortMain {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		 bubbleSort(arr);
//		insertionSort(arr);
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

//	public static int[] insertionSort(int[] arr) {
//		for (int i = 1; i < arr.length; i++) {
//			int valueToSort = arr[i];
//			int j;
//			for (j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
//				arr[j] = arr[j - 1];
//			}
//			arr[j] = valueToSort;
//		}
//		return arr;
//	}
//
//	public static int[] selectionSort(int[] arr) {
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			int index = i;
//			for (int j = i + 1; j < arr.length; j++)
//				if (arr[j] < arr[index])
//					index = j;
//
//			int smallerNumber = arr[index];
//			arr[index] = arr[i];
//			arr[i] = smallerNumber;
//		}
//		return arr;
//	}

}
