package string3;
/*
https://codingbat.com/prob/p197890

Given a string, return the sum of the digits 0-9 that appear in the 
string, ignoring all other characters. Return 0 if there are no digits 
in the string. (Note: Character.isDigit(char) tests if a char is one of 
the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string 
to an int.)


sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
 */
public class CountTriple {
	public int countTriple(String str) {
		  int count = 0;
		  for(int i=0; i<=str.length()-3; i++) {
			  if(str.charAt(i+1)==str.charAt(i) && str.charAt(i+2)==str.charAt(i))
				  count++;
		  }
		  return count;
	}
}
