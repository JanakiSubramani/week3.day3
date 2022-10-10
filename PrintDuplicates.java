package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		
		// declare an int variable named count
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//Using Set
		// get the length of the array
		Set<Integer> set=new LinkedHashSet<Integer>();
		Set<Integer> duplicateSet=new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) duplicateSet.add(arr[i]);
		}
		System.out.println("Duplicates removed are " + duplicateSet);
	}
}
