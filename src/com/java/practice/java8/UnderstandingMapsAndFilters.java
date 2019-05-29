/**
 * 
 */
package com.java.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * @author thots
 *
 */
public class UnderstandingMapsAndFilters {

	private String[] generateNumbersArray(int size) {
		String numbers[] = new String[size];//{"1","2","3","4","5","6","7","8","9","10"};
		// Why should you hardcode when you can automate..!
		for(int i=1, j=0; i<=size; i++, j++) {
			numbers[j] = String.valueOf(i);
		}
		return numbers;
	}
	
	public static void main(String[] args) {
		UnderstandingMapsAndFilters ourClassObj = new UnderstandingMapsAndFilters();
		
		// call our function to get first n numbers array.. stream on it by calling arrays.asList.. sysout them to verify the generation
		List<String> NumbersList = Arrays.asList(ourClassObj.generateNumbersArray(14));
		NumbersList.stream().forEach(s-> System.out.println(s));
		
		// lets see how map() function works.. we are using map to convert each object into something.. in this case each string digit to integer
		List<Integer> IntegersList = NumbersList.stream().map(eachStringNumber -> Integer.valueOf(eachStringNumber)).collect(Collectors.toList());
		System.out.println(IntegersList);
	}

}
