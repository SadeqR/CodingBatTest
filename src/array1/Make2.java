package array1;

/*
https://codingbat.com/prob/p143461

Given 2 int arrays, a and b, return a new array length 2 containing, as 
much as will fit, the elements from a followed by the elements from b. 
The arrays may be any length, including 0, but there will be 2 or more 
elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
*/
public class Make2 {
	public int[] make2(int[] a, int[] b) {
		//counter to keep track of index of the new array that will carry
		//the result
		int counter = 0;
		int[] result = new int[2];
		//for loop to store elements from 'a', loop breaks if coutner
		//reaches 2 to prevent index out of bounds error
		for (int i = 0; i < a.length; i++) {
			if(counter==2) break;
			result[counter] = a[i];
			counter++;
		}
		//same idea as above loop 
		for (int i = 0; i < b.length; i++) {
			if(counter==2) break;
			result[counter] = b[i];
			counter++;
		}
		return result;
	}
}
