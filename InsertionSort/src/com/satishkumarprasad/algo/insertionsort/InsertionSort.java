package com.satishkumarprasad.algo.insertionsort;

public class InsertionSort implements Sort {
	
	// 8 2 5 3 0 7 -> 6
	@Override
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
}
