package com.satishkumarprasad.app;

public enum SortingAlgorithms {
	INSERTION_SORT ("insertion sort"), 
	MERGE_SORT ("merge sort"), 
	SELECTION_SORT ("selection sort"), 
	QUICK_SORT ("selection sort");
	
	private String algorithm;

	private SortingAlgorithms(String algorithm) {
		this.algorithm = algorithm;
	}
	public String getAlgorithm() {
		return algorithm;
	}
}
