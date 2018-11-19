package array2;

/*
 * https://codingbat.com/prob/p194525
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
*/
public class Lucky13 {
	public boolean lucky13(int[] nums) {
		boolean found1 = false;
		boolean found3 = false;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==1) found1 = true;
			if(nums[i]==3) found3 = true;
		}
		return (!found1 && !found3) ? true:false;
	}
}
