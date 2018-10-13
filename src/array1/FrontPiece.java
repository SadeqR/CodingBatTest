package array1;
/*
https://codingbat.com/prob/p142455

Given an int array of any length, return a new array of its first 2 
elements. If the array is smaller than length 2, use whatever elements 
are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */

public class FrontPiece {
	public int[] frontPiece(int[] nums) {
		// check array size is bigger than 1, if so fill new array with
		// first 2 indexes
		if (nums.length > 1) {
			int[] result = { nums[0], nums[1] };
			return result;
		}
		//if array size is smaller than 2, return as is
		return nums;
	}
}
