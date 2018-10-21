package logic1;
/*
https://codingbat.com/prob/p113261

Given three ints, a b c, return true if it is possible to add two of 
the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
*/
public class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		  if(a+b==c) return true;
		  if(a+c==b) return true;
		  if(c+b==a) return true;
		  return false;
	}
}
