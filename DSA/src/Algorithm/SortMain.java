package Algorithm;

import Insertion_Sort.InsertionSort;

public class SortMain {

	public static void main(String[] args) {
		int a[] = {10,4,12,13,1} ;
		int sortArray[];
		InsertionSort insertion = new InsertionSort();
		sortArray=insertion.insertionsort(a);
		insertion.printArray(sortArray);
	}

}
