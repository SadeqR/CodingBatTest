package logic1;
/*
https://codingbat.com/prob/p100962

We'll say a number is special if it is a multiple of 11 or if it is one 
more than a multiple of 11. Return true if the given non-negative number 
is special. Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
*/
public class SpecialEleven {
	public boolean specialEleven(int n) {
		//only return true if it divides by 11 to give no remainders
		//or to diving by itself to give 1
		return n%11==0 || n%11==1 ? true : false;
	}
}
