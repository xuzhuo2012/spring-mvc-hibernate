package com.xxzzsoftware.util;

public class InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new InsertSort().insertSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void insertSort(int[] a) {
		int j = 1;
		while (j < a.length) {
			int key = a[j];
			int i = j - 1;
			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
			j++;
		}
	}
}
