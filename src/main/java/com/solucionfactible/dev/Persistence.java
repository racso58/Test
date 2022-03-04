package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {

		int count = 0;
		boolean notExit = true;
		while (notExit){
			List<Long> list = new ArrayList<>();

			while(num > 0){
				list.add(num % 10);
				num = num / 10;
			}

			if(list.size() >= 2){
				num = list.get(0);
				for (int i = 1; i < list.size(); i++){
					num *= list.get(i);
				}
				count ++;
			}else {
				notExit = false;
			}
		}

		return count;
	}

}
