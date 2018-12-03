package array2;
/*
https://codingbat.com/prob/p109783

Given an array of ints, return true if the value 3 appears in the array 
exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
*/
public class HaveThree {
	public boolean haveThree(int[] nums) {
		  int counter = 0;
		  for(int i=0; i<nums.length-1; i++){
			  if(nums[i]==3 && nums[i+1]!=3) counter++;
		  }
		  if(nums.length>1 && nums[nums.length-1]==3) counter++;
		  return counter==3 ? true:false;
	}
}
