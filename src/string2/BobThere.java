package string2;
/*
https://codingbat.com/prob/p175762

Return true if the given string contains a "bob" string, but where the 
middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
*/
public class BobThere {
	public boolean bobThere(String str) {
		  if(str.length()<3) return false;
		  for(int i =0; i<str.length(); i++) {
			  if(i==str.length()-2) break;
			  if(str.charAt(i)=='b' && str.charAt(i+2)=='b') return true;
		  }
		  return false;
	}
}
