package com.xxzzsoftware.util;

public class ShellSort {

	public static void main(String[] args) {
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new ShellSort().shellSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void shellSort(int[] a) {
		int h = 0;
		while (h < a.length) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int j = h; j < a.length; j++) {
				int key = a[j];
				int i = j - h;
				while (i >= h && a[i] > key) {
					a[i + h] = a[i];
					i -= h;
				}
				a[i + h] = key;
			}
			h /= 3;
		}
	}

}
