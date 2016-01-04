package com.test.leetcode;

//https://leetcode.com/problems/create-maximum-number/ 第321题

public class maxNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] maxNumber(int[] nums1, int[] nums2, int k) {
		 int[] nums = new int[k];
		 int i = 1; // 剩下来的长度为 left_i = nums1.length - i;
		 int j = 1; // 剩下来的长度为 left_j = nums2.length - i;
		 int g = 1; // 剩下来的长度为 left_g = nums.length - i;
		 
		 //初始化数组第一位
		 if(nums1[i-1]>nums[j-1]){
			 nums[g-1] = nums[i-1];
		 }else{
			 nums[g-1] = nums[j-1];
		 }
		 
		 
		 int left_i = nums1.length - i + 1;
		 int left_j = nums2.length - j + 1;
		 int left_g = nums.length - g + 1;
		 
		 while(left_g>0){
			 int tmp = 0;
			 if(nums1[i-1]>nums[j-1]){
				 tmp = nums[i-1];
				 i++;
			 }else{
				 tmp = nums[j-1];
				 j++;
			 }
			 
			 if(left_i+left_j>=k){ //还剩下足够多的数字时。
				 g = this.replace(nums, 1, g, tmp);
				 g++;
			 }else if(left_i+left_j<k && left_i+left_j> left_g){ //够填满一些时候
				 g = this.replace(nums, k-left_i-left_j+1, g, tmp);
				 g++;
			 }else if(left_i+left_j == left_g){ //剩下的数字刚刚够时候
				 nums[g-1] = tmp;
				 g++;
			 }
			 
			 left_i = nums1.length - i +1;
			 left_j = nums2.length - j +1;
			 left_g = nums.length - g +1;
			 
		 }
		 return nums;
	 }
	 
	 public int replace (int[] nums, int start, int end, int k){
		 int i = start;
		 while(true){
			 if(i==end+1){
				 nums[i-1]=k;
				 return i;
			 }
			 if(k>nums[i-1]){
				 nums[i-1] = k;
				 return i; //抵换成功返回真
			 }
			 i++;
		 }
	 }

}
