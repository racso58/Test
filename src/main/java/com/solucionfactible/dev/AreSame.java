package com.solucionfactible.dev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {

		List<Integer> listA = Arrays.stream(a)
				.boxed()
				.collect(Collectors.toList());

		List<Integer> listB = Arrays.stream(b)
				.boxed()
				.sorted()
				.collect(Collectors.toList());

		List<Integer> listAP = listA.stream()
				.map(x -> (int) Math.pow(x, 2))
				.sorted()
				.collect(Collectors.toList());

		return listAP.equals(listB);
	}

}
