package logic1;
/*
https://codingbat.com/prob/p183071


Given 2 ints, a and b, return their sum. However, sums in the range 
10..19 inclusive, are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
*/
public class SortaSum {
	public int sortaSum(int a, int b) {
		//check if a+b is between 10-19
		  if(a+b>9 && a+b<20) return 20;
		  else return a+b;
	}
}
