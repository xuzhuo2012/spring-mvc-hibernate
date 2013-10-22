package com.xxzzsoftware.util;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new QuickSort().quickSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void quickSort(int[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}

	private int partition(int[] a, int p, int r) {
		int pivot = a[r];
		int i = p;
		for (int j = p; j < r; j++) {
			if (a[j] <= pivot) {
				swap(a, i, j);
				i++;
			}
		}
		swap(a, i, r);
		return i;
	}

	private void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
