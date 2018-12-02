package array2;
/*
https://codingbat.com/prob/p159979

Given an array of ints, return true if the array contains either 3 
even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
*/
public class ModThree {
	public boolean modThree(int[] nums) {
		  boolean evenCount = false;
		  boolean oddCount = false;
		  if(nums.length<3) return false;
		  for(int i=0; i<nums.length; i++) {
			  if(i==nums.length-2) break;
			  if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) evenCount=true;
			  if(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0) oddCount=true;
		  }
		  if(evenCount || oddCount) return true;
		  else return false;
	}
}
