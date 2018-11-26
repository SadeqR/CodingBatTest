package array2;
/*
https://codingbat.com/prob/p136648

Given an array of ints, return true if it contains no 1's or it 
contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/
public class No14 {
	public boolean no14(int[] nums) {
		boolean no1 = false;
		boolean no4 = false;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==1) no1 = true;
			if(nums[i]==4) no4 = true;
		}
		return (!no1 || !no4)? true:false;
	}
}
