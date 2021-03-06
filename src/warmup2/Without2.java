package warmup2;

/*
https://codingbat.com/prob/p142247

Given a string, if a length 2 substring appears at both its beginning 
and end, return a string without the substring at the beginning, so 
"HelloHe" yields "lloHe". The substring may overlap with itself, so 
"Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
*/

public class Without2 {
	public String without2(String str) {
		//check string is larger than 1 character and check/create new string
		if(str.length()>1 && str.substring(0, 2).equals(str.substring(str.length()-2, str.length())))
			return str.substring(2, str.length());
		//if string is of size 1 return that
		return str;
	}
}
