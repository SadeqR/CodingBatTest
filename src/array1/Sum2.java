package array1;
/*
https://codingbat.com/prob/p190968

Given an array of ints, return the sum of the first 2 elements in the 
array. If the array length is less than 2, just sum up the elements that 
exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
*/

public class Sum2 {
	public int sum2(int[] nums) {
		int result = 0;
		if (nums.length >= 2) result = nums[0] + nums[1];
		if (nums.length <2 && nums.length >0) return nums[0];
		return result;
	}
}
