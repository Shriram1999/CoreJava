package com.rays.unitsolve;

import java.util.Arrays;


public class Largest_number15 {

	public static void main(String[]args) {
		
		int[]arr= {5,8,11,24,13,16,17};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}
