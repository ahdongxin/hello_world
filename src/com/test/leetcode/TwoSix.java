package com.test.leetcode;

import java.util.Iterator;

public class TwoSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,3,4,5,5,6};
		TwoSix rD = new TwoSix();
		System.out.println(rD.removeDuplicate(nums));
		
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+ " ");
		}

	}
	
	public int removeDuplicate (int[] nums){
		int p1 = 0;
		int p2 = 1;
		while (p2<nums.length){
			if(nums[p1]==nums[p2]){
				//p2++;
				p2++;
			}else{
				nums[p1+1] = nums[p2];
				p1++;
				p2++;
			}
		}
		return p1+1;
	}
}
