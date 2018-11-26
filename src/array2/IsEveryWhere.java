package array2;

/*
https://codingbat.com/prob/p110222

We'll say that a value is "everywhere" in an array if for every 
pair of adjacent elements in the array, at least one of the pair
is that value. Return true if the given value is everywhere in 
the array.


isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
*/
public class IsEveryWhere {
	public boolean isEverywhere(int[] nums, int val) {
		boolean adjacent = true;
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1)
				break;
			if (nums[i] != val && nums[i + 1] != val) {
				adjacent = false;
			}
		}
		return adjacent;
	}
}
