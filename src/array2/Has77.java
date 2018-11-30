package array2;
/*
https://codingbat.com/prob/p168357

Given an array of ints, return true if the array contains two 
7's next to each other, or there are two 7's separated by one 
element, such as with {7, 1, 7}.


has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
*/
public class Has77 {
	public boolean has77(int[] nums) {
		  boolean is77 = false;
		  for(int i=0; i<nums.length; i++) {
			  if(i==nums.length-1) break;
			  if(nums[i]==7 && nums[i+1]==7) is77 = true;
		  }
		  for(int i=0; i<nums.length; i++) {
			  if(i==nums.length-2 || i==nums.length-1) break;
			  if(nums[i]==7 && nums[i+2]==7) is77 = true;
		  }
		  return is77;
	}
}
