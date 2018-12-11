package array2;

/*
https://codingbat.com/prob/p164144

Given a non-empty array of ints, return a new array containing the 
elements from the original array that come after the last 4 in the 
original array. The original array will contain at least one 4. Note 
that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/
public class Post4 {
	public int[] post4(int[] nums) {
		int[] empty = new int[0];
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				int[] res;
				res = new int[nums.length - 1 - i];
				for (int j = 0; j < res.length; j++)
					res[j] = nums[i + 1 + j];
				return res;
			}
		}
		return empty;
	}
}
