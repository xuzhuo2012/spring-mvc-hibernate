package com.xxzzsoftware.util;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		int[] a = { 111, 3, 2, 45, 6, 7, 7722, 32, 8 };
		new BubbleSort().bubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public void bubbleSort(int[] a){
		
		for(int i = 0 ; i < a.length ; i++){
			boolean swapped = false;
			for(int j = a.length -1 ; j > i ; j--){
				if(a[j] < a[j-1]){
					swap(a,j,j-1);
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		
	}
	
	private void swap(int[] a,int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
