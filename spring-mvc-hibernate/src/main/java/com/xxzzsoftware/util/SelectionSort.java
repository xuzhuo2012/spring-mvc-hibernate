package com.xxzzsoftware.util;

public class SelectionSort {
	
	
	public static void main(String[] args) {
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new SelectionSort().selectionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, min, i);
		}
	}

	private void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
