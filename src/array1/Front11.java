package array1;
/*
https://codingbat.com/prob/p128270

Given 2 int arrays, a and b, of any length, return a new array with the 
first element of each array. If either array is length 0, ignore that 
array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
*/

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		int[] resArray;
		//if array's are empty, i return an empty array
		if(a.length<1 && b.length<1) return a;
		//check if a is empty, if so only take first index of b
		if(a.length == 0) {
			resArray = new int[] {b[0]};
			return resArray;
		}
		//check if b is empty, if so only take first index of a
		if(b.length == 0) {
			resArray = new int[] {a[0]};
			return resArray;
		}
		//if both array size's are >1 then take first index of both
		resArray = new int[] {a[0], b[0]};
		return resArray;
	}
}
