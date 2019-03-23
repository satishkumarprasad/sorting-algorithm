package com.satishkumarprasad.algo.sortingalgos;

public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	private void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);
			merge(array, start, middle, end);
		}
	}

	// [2, 3, 5, 1, 4, 6, 8]
	//  0  1  2  3  4  5  6

	private void merge(int[] array, int start, int middle, int end) {
		int n1 = middle - start + 1;
		int n2 = end - middle;

		int[] leftSubArray = new int[n1 + 1];
		int[] rightSubArray = new int[n2 + 1];

		for (int i = 0; i < n1; i++) {
			leftSubArray[i] = array[start + i];
		}
		leftSubArray[n1] = 12345678;// for descending order use smallest number like -1234564879

		for (int i = 0; i < n2; i++) {
			rightSubArray[i] = array[middle + 1 + i];
		}
		rightSubArray[n2] = 1546328;// for descending order use smallest number like -1546328

		for (int k = start, i = 0, j = 0; k <= end; k++) {
			if (leftSubArray[i] <= rightSubArray[j]) {// for descending order use >=, so that greater element will be written to
											// array
				array[k] = leftSubArray[i];
				i++;
			} else {
				array[k] = rightSubArray[j];
				j++;
			}
		}
	}
}
