package com.xxzzsoftware.util;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new MergeSort().mergeSort(a,0,a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
	
	public void mergeSort(int[] a, int p, int r){
		
		if(p < r){
			int q = (p+r)/2;
			mergeSort(a,p,q);
			mergeSort(a,q+1,r);
			merge(a,p,q,r);
		}
		
	}
	
	public static void merge(int[] a, int start, int offset, int end) {

		int k = 0;
		int i = start;
		int j = offset;

		if (end > a.length)
			end = a.length;

		if (offset > a.length)
			offset = a.length;

		int[] b = new int[end - start];

		while (i < offset && j < end) {

			if (a[i] < a[j]) {
				b[k++] = a[i];
				i++;
			} else {
				b[k++] = a[j];
				j++;
			}
		}

		if (i < offset) {
			for (; i < offset; i++) {
				b[k++] = a[i];
			}
		} else if (j < end) {
			for (; j < end; j++) {
				b[k++] = a[j];
			}
		}

		for (k = 0, i = start; i < end; i++, k++) {
			a[i] = b[k];
		}
	}
}
