package array2;
/*
https://codingbat.com/prob/p193753

Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the zeros are grouped at the start of the array. 
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes 
{0 ,0, 1, 1}. You may modify and return the given array or make a new 
array.


zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
*/

public class ZeroFront {
	public int[] zeroFront(int[] nums) {
		  int counter = 0;
		  int temp = 0;
		  int[] result = new int[nums.length];
		  for(int i=0; i<nums.length; i++) {
			  if(nums[i]==0) counter++;
		  }
		  for(int j=0; j<counter; j++) {
			  result[j] = 0;
			  temp = j;
		  }
		  for(int x=0; x<nums.length; x++) {
			  if((temp+1+x)<=nums.length) break;
			  if(nums[x]!=0) {
				  result[temp+1+x] = nums[x];
			  }
		  }
		  return result;
	}
}
