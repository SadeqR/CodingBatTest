package array2;
/*
https://codingbat.com/prob/p100246

Given a non-empty array of ints, return a new array containing the 
elements from the original array that come before the first 4 in 
the original array. The original array will contain at least one 4. 
Note that it is valid in java to create an array of length 0.


pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
*/
public class Pre4 {
	public int[] pre4(int[] nums) {
		  int index4=0;
		  int[] result;
		  for(int i=0; i<nums.length; i++) {
			  if(nums[i]==4) {
				  index4=i;
				  break;
			  }
		  }
		  result = new int[index4];
		  for(int i = 0; i<result.length; i++)
			  result[i]=nums[i];
		  return result;
	}
}
