package array1;
/*
https://codingbat.com/prob/p199519

Given an array of ints of even length, return a new array length 2 
containing the middle two elements from the original array. 
The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		//new array to store results
		int[] result = new int[2];
		//if statement to check if the array is bigger than 2, if not
		//just return the array
		if (nums.length > 2) {
			//add middle values of nums into result using length funtion 
			//to find indexes
			result[0] = nums[(nums.length / 2) - 1];
			result[1] = nums[nums.length / 2];
			return result;
		}
		return nums;
	}
}
