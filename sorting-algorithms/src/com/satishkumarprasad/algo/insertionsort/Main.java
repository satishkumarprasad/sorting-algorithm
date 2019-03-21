package com.satishkumarprasad.algo.insertionsort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[] = { 8, 2, 5, 0, 7, 3, 9, 6, 1, 4 };
		Sort sort = new InsertionSort();
		System.out.println("Array before sorting: " + Arrays.toString(array));
		sort.sort(array);
		System.out.println("Array after sorting: " + Arrays.toString(array));
	}
	
/*	OutPut:-
  	Array before sorting: [8, 2, 5, 0, 7, 3, 9, 6, 1, 4]
	Array after sorting: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
}
