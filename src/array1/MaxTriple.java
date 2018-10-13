package array1;
/*
https://codingbat.com/prob/p185176

Given an array of ints of odd length, look at the first, last, and 
middle values in the array and return the largest. The array length 
will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
*/

public class MaxTriple {

	public static void main(String[] args) {
		int[] test = { 5, 1, 7, 3, 7, 8, 9 };
		int res = maxTriple(test);
		System.out.println(res);
	}

	public static int maxTriple(int[] nums) {
		int largest;
		//check first index against last 2
		if (nums[0] > nums[((nums.length + 1) / 2) - 1]) {
			if (nums[0] > nums[nums.length - 1])
				largest = nums[0];
			else
				largest = nums[(nums.length + 1 / 2) - 1];
		//check 2nd index against last index if 1st index is smaller 
		//than 2nd index
		} else if (nums[((nums.length + 1) / 2) - 1] >= nums[nums.length - 1]) {
			largest = nums[((nums.length + 1) / 2) - 1];
		} else {
			largest = nums[nums.length - 1];
		}
		return largest;
	}
}
