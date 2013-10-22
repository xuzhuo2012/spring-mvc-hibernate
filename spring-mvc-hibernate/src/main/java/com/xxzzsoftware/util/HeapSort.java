package com.xxzzsoftware.util;

public class HeapSort {

	public static void main(String[] args) {
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new HeapSort().heapSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void heapSort(int[] a) {
		buildMaxHeap(a);
		int heapSize = a.length;
		for (int i = a.length - 1; i > 0; i--) {
			swap(a, 0, i);
			heapSize--;
			maxHeapify(a, 0, heapSize);
		}
	}

	private void buildMaxHeap(int[] a) {
		for (int i = a.length / 2; i >= 0; i--) {
			maxHeapify(a, i, a.length);
		}
	}

	private void maxHeapify(int[] a, int i, int heapSize) {

		int left = i * 2;
		int right = i * 2 + 1;
		int largest = i;

		if (left < heapSize && a[left] > a[i]) {
			largest = left;
		}

		if (right < heapSize && a[right] > a[largest]) {
			largest = right;
		}

		if (i != largest) {
			swap(a, i, largest);
			maxHeapify(a, largest, heapSize);
		}
	}

	private void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
