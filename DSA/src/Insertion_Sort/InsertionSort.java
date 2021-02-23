package Insertion_Sort;

import java.util.Arrays;

public class InsertionSort {

	private int length,indexValue;
	
	public int[] insertionsort(int a[]) {
		length=a.length;
		for(int i=1;i<length;i++) {
			indexValue=a[i];
			int j=i-1;
			while(j>=0 && indexValue > a[j]) {
				System.out.println("value to compare"+a[j]);
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=indexValue;
		}
		return a;
	}
	
	public void printArray(int arr[]) {
		System.out.println("After Sorting Array");
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
}
