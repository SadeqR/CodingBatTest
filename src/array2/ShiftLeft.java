package array2;

/*
https://codingbat.com/prob/p105031

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns 
{2, 5, 3, 6}. You may modify and return the given array, or return a new 
array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
*/
public class ShiftLeft {
	public int[] shiftLeft(int[] nums) {
		if(nums.length<1) return nums;
		int temp;
		int firstInd = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(i==nums.length-1) {
				nums[i]=firstInd;
				break;
			}
			temp = nums[i+1];
			nums[i] = temp;
		}
		return nums;
	}
}
