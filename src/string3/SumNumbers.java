package string3;
/*
https://codingbat.com/prob/p121193

Given a string, return the sum of the numbers appearing in the string, 
ignoring all other characters. A number is a series of 1 or more digit 
chars in a row. (Note: Character.isDigit(char) tests if a char is one 
of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string 
to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */
public class SumNumbers {
	public int sumNumbers(String str) {
		  int result = 0;
		  String wholeNo = "";
		  int temp = 0;
		  for(int i=0; i<str.length(); i++) {
			  if(Character.isDigit(str.charAt(i))) {
				  if(i<=str.length()-2 && Character.isDigit(str.charAt(i+1))) {
					  wholeNo += str.charAt(i);
				  }
				  else {
					  wholeNo += str.charAt(i);
					  temp = Integer.parseInt(wholeNo);
					  result += temp;
					  wholeNo = "";
				  }
			  }
		  }
		  return result;
	}
}
