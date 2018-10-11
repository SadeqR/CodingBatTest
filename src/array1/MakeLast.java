package array1;
/*
https://codingbat.com/prob/p137188

Given an int array, return a new array with double the length where its 
last element is the same as the original array, and all the other 
elements are 0. The original array will be length 1 or more. Note: by 
default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
*/

public class MakeLast {
	public int[] makeLast(int[] nums) {
		//new array with double array size
		int[] result = new int[nums.length * 2];
		//adding last index value to end of new array
		result[result.length - 1] = nums[nums.length - 1];
		return result;
	}
}
