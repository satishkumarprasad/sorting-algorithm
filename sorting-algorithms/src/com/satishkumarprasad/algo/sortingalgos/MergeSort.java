package com.satishkumarprasad.algo.sortingalgos;

public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	private void mergeSort(int[] array, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge(array, p, q, r);
		}
	}

	// [2, 3, 5, 1, 4, 6, 8]
	//  0  1  2  3  4  5  6 -> p = 0, q = 2, r = 6 
	// n1 = 3, n2 = 4
	// array1 = [2, 3, 5, 123456789]
	// array2 = [1, 4, 6, 8, 1546328]
	
	private void merge(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int[] array1 = new int[n1 + 1];
		int[] array2 = new int[n2 + 1];
		
		for(int i = 0; i < n1; i++) {
			array1[i] = array[p + i];
		}
		array1[n1] = 12345678;
		
		for(int i = 0; i < n2; i++) {
			array2[i] = array[q + 1 + i];
		}
		array2[n2] = 1546328;
		
		for(int k = p, i = 0, j = 0; k <= r; k++) {
			if(array1[i] <= array2[j]) {
				array[k] = array1[i];
				i++;
			}else {
				array[k] = array2[j];
				j++;
			}
		}
	}
}
