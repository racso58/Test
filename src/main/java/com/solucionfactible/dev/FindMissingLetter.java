package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {

		for (int i = 1; i < array.length; i++) {
			char caracter1 = array[i];
			char caracter2 = array[i - 1];
			if (caracter1 - caracter2 != 1) {
				return (char) (array[i] - 1);
			}
		}

		return ' ';
	}

}
