package array2;
/*
https://codingbat.com/prob/p191878

Given an array of ints, return true if the array contains a 2 next 
to a 2 or a 4 next to a 4, but not both.


either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
*/
public class Either24 {
	public boolean either24(int[] nums) {
		  boolean contains22 = false;
		  boolean contains44 = false;
		  for(int i=0; i<nums.length; i++) {
			  if(i==nums.length-1) break;
			  if(nums[i]==2 && nums[i+1]==2) contains22 = true;
			  if(nums[i]==4 && nums[i+1]==4) contains44 = true;
		  }
		  if(contains22 && contains44) return false;
		  else if(!contains22 && !contains44) return false;
		  else return true;
	}
}
