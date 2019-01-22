package string3;
/*
https://codingbat.com/prob/p141736

Given a string, return true if the number of appearances of "is" anywhere 
in the string is equal to the number of appearances of "not" anywhere in 
the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/
public class EqualIsNot {
	public boolean equalIsNot(String str) {
		  int countIs = 0;
		  int countNot = 0;
		  for(int i=0; i<str.length(); i++) {
			  if(i<=str.length()-2) {
				  if(str.substring(i, i+2).equals("is")) countIs++;
			  }
			  if(i<=str.length()-3) {
				  if(str.substring(i, i+3).equals("not")) countNot++;
			  }
		  }
		  return countIs==countNot? true:false;
	}
}
