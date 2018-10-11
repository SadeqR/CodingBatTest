package array1;
/*
https://codingbat.com/prob/p109660

Start with 2 int arrays, a and b, of any length. Return how many of the 
arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

public class Start1 {
	public int start1(int[] a, int[] b) {
		//counter to counter 1's
		int counter=0;
		//check if arrays are at least of length 1
		if(a.length>0 && a[0]==1)
			counter++;
		if(b.length>0 && b[0]==1)
			counter++;
		return counter;
	}
}
