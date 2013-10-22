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
	
	private void merge(int [] a, int p,int q,int r){
		
		int lengthL = q-p+1;
		int lengthR = r- q;
		
		int[] L = new int[lengthL + 1];
		int[] R = new int[lengthR+1];
		
		for(int i = 0; i < lengthL;i++){
			L[i] = a[p+i];
		}
		
		for(int i = 0 ; i < lengthR;i++){
			R[i] = a[q+1+i];
		}
		
		L[lengthL] = Integer.MAX_VALUE;
		R[lengthR] = Integer.MAX_VALUE;
		
		int i = 0; 
		int j = 0;
		
		for(int k = 0; k <= r ; k++){
			if(L[i] < R[j]){
				a[k] = L[i];
				i++;
			}else{
				a[k] = R[j];
				j++;
			}
		}
	}
}
