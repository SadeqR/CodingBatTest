package logic2;
/*
https://codingbat.com/prob/p198700

Given three ints, a b c, one of them is small, one is medium and one is 
large. Return true if the three values are evenly spaced, so the 
difference between small and medium is the same as the difference 
between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/
public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		if(a==b && a==c) return true;
		if(a==b || b==c || c==a) return false;
		if(Math.abs(a-b)==Math.abs(a-c)) return true;
		if(Math.abs(a-b)==Math.abs(b-c)) return true;
		if(Math.abs(c-b)==Math.abs(a-c)) return true;
		return false;
	}
}
