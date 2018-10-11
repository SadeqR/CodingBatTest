package array1;
/*
https://codingbat.com/prob/p120347

Given an int array length 3, if there is a 2 in the array immediately 
followed by a 3, set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
*/

public class Fix23 {
	public int[] fix23(int[] nums) {
		// check if there is a 2 followed by 3
		// loop through and starting from 2nd index and if it equals
		// 3 and has a 2 at prev index, replace the 3 by a 0 in nums array
		for (int i = 1; i < nums.length; i++)
			if (nums[i] == 3 && nums[i - 1] == 2) {
				nums[i] = 0;
				break;
			}
		return nums;
	}
}
