package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// Sorting an array
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;

	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Implementing sorting logic
		// search the array
		int sortedNumbers[] = sortAlgorithm.sort(numbers);
		return 3;
	}

	/**
	 * @param sortAlgorithm the sortAlgorithm to set
	 */
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

}
