package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//added one comment 

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
public int[] sort(int[] numbers){
	return numbers;
}
}
