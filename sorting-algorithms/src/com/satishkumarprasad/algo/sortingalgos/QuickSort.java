package com.satishkumarprasad.algo.sortingalgos;

public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}

	private int partition(int[] array, int start, int end) {
		int i = start - 1;
		int pivot = array[end];
		for (int j = start; j < end; j++) {
			if (array[j] <= pivot)// for descending order use >=
				exchange(array, ++i, j);
		}
		return exchange(array, ++i, end);
	}

	private int exchange(int[] array, int source, int destination) {
		int temp = array[destination];
		array[destination] = array[source];
		array[source] = temp;
		return source;
	}
}
