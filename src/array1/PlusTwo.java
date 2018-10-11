package array1;
/*
https://codingbat.com/prob/p180840

Given 2 int arrays, each length 2, return a new array length 4 
containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */

public class PlusTwo {
	public int[] plusTwo(int[] a, int[] b) {
		//new array to store elements for a and b
		int[] result = {a[0], a[1], b[0], b[1]};
		return result;
	}
}
