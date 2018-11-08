package string2;
/*
https://codingbat.com/prob/p122943

Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
*/
public class OneTwo {
	public String oneTwo(String str) {
		  String result = "";
		  int noOf3 = str.length()/3;
		  if(str.length()<3) return str;
		  int n = 0;
		  for(int i=0; i<=noOf3; i++, n=n+3) {
			  result = str.substring(n+1, n+2) + str.charAt(n);
		  }
		  if(str.length()%3!=0) {
			  result = result + str.substring(noOf3*2, str.length());
		  }
		  return result;
	}
}
