package com.solucionfactible.dev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {

		List<Integer> listA = Arrays.stream(a)
				.boxed()
				.collect(Collectors.toList());
		List<Integer> listB = Arrays.stream(b)
				.boxed()
				.collect(Collectors.toList());

		List<Integer> finalList = listA.stream()
				.filter(x -> !listB.contains(x))
				.collect(Collectors.toList());

		int[] finalArray = finalList.stream()
				.mapToInt(i -> i)
				.toArray();

		return finalArray;
	}

}
