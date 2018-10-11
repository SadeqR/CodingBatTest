package array1;
/*
https://codingbat.com/prob/p155713

Given an array of ints of odd length, return a new array length 3 
containing the elements from the middle of the array. The array length 
will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */

public class MidThree {
	public int[] midThree(int[] nums) {
		//array of length 3 to store middle values of nums
		int[] result = new int[3];
		if(nums.length>3) {
			result[0]=nums[(nums.length+1)/2-2];
			result[1]=nums[(nums.length+1)/2-1];
			result[2]=nums[(nums.length+1)/2];
			return result;
		}
		//if nums is only of length 3 it is returned
		return nums;
	}
}
