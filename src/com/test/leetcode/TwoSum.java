package com.test.leetcode;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Node implements Comparable<Node>{
		int val, index;
		public Node(int v, int i){
			this.val = v;
			this.index = i;
		}

		@Override
		public int compareTo(Node arg0) {
			// TODO Auto-generated method stub
			return this.val - arg0.val;
		}
	}
	
	

}
