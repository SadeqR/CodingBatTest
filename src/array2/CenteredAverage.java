package array2;
/*
https://codingbat.com/prob/p136585

Return the "centered" average of an array of ints, which we'll say is the 
mean average of the values, except ignoring the largest and smallest 
values in the array. If there are multiple copies of the smallest value, 
ignore just one copy, and likewise for the largest value. Use int division 
to produce the final average. You may assume that the array is length 3 or 
more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/
public class CenteredAverage {
	public int centeredAverage(int[] nums) {
		  int largest = nums[0];
		  int smallest = nums[0];
		  int sum = 0;
		  for(int i=0; i<nums.length; i++) {
			  smallest = Math.min(smallest, nums[i]);
			  largest = Math.max(largest, nums[i]);
			  sum += nums[i];
		  }
		  sum = sum - largest - smallest;
		  sum = sum/(nums.length-2);
		  return sum;
	}
}
