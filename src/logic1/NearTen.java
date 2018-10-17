package logic1;
/*
https://codingbat.com/prob/p193613

Given a non-negative number "num", return true if num is within 2 of a 
multiple of 10. Note: (a % b) is the remainder of dividing a by b, so 
(7 % 5) is 2. See also: Introduction to Mod


nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
*/
public class NearTen {
	public boolean nearTen(int num) {
		//if reminder is 0,1,2,8,9 return true
		return num%10<3 || num%10>7? true : false;
	}
}
