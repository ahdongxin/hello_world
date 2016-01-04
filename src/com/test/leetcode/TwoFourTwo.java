package com.test.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class TwoFourTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isAnagram(String s, String t){
		
		char[] A = s.toCharArray();
		char[] B = s.toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		return Arrays.equals(A, B);
	}
}
