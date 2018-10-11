package array1;
/*
https://codingbat.com/prob/p145365

Given an int array, return true if the array contains 2 twice, or 3 
twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */

public class Double23 {
	public boolean double23(int[] nums) {
		//counters used to check number of 2's and 3's in for loop
		int counter2 = 0;
		int counter3 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) counter2++;
			if (nums[i] == 3) counter3++;
		}
		//if either counter is 2 return true
		return counter2==2 || counter3==2 ? true : false;
	}
}
