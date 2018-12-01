package array2;
/*
https://codingbat.com/prob/p169260

Given an array of ints, return true if there is a 1 in the array 
with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/
public class Has12 {
	public boolean has12(int[] nums) {
		boolean found1 = false;
		boolean found2 = false;
		for(int i=0;i<nums.length; i++) {
			if(!found1 && nums[i]==1) found1 = true;
			if(found1 && nums[i]==2) found2 = true;
		}
		return found2;
	}
}
