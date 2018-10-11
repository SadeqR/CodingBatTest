package array1;
/*
https://codingbat.com/prob/p109537

Start with 2 int arrays, a and b, each length 2. Consider the sum of 
the values in each array. Return the array which has the largest sum. 
In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

public class BiggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		// check if sum of b is bigger, if not return a as it will either
		// be bigger or same size
		return (a[0] + a[1]) < (b[0] + b[1]) ? b : a;
	}
}
