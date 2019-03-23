package com.satishkumarprasad.app;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import com.satishkumarprasad.algo.sortingalgos.InsertionSort;
import com.satishkumarprasad.algo.sortingalgos.MergeSort;
import com.satishkumarprasad.algo.sortingalgos.QuickSort;
import com.satishkumarprasad.algo.sortingalgos.SortingAlgorithm;

public class Main {

	public static void main(String[] args) {
		int array1[] = { 8, 2, 5, 0, 7, 3, 9, 6, 1, 4 };
		sort(array1, new InsertionSort(), SortingAlgorithms.INSERTION_SORT);

		int array2[] = { 8, 2, 5, 0, 7, 3, 9, 6, 1, 4 };
		sort(array2, new MergeSort(), SortingAlgorithms.MERGE_SORT);

		int array3[] = { 8, 2, 5, 0, 7, 3, 9, 6, 1, 4 };
		sort(array3, new QuickSort(), SortingAlgorithms.QUICK_SORT);

	}

	private static void sort(int[] array, SortingAlgorithm sortingAlgo, SortingAlgorithms algorithm) {
		System.out.println("Executing " + algorithm.getAlgorithm() + " algorithm:");
		System.out.println("Array before sorting: " + Arrays.toString(array));
		
		Instant startTime = Instant.now();
		sortingAlgo.sort(array);
		Instant endTime = Instant.now();
		
		System.out.println("Array after sorting: " + Arrays.toString(array));
		System.out.println("Time taken for sorting: " + Duration.between(startTime, endTime).getNano());
	}
	/*
	 * OutPut:- 
	 * Array before sorting: [8, 2, 5, 0, 7, 3, 9, 6, 1, 4] 
	 * Array after sorting: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 */
}
