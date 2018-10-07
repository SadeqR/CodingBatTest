package warmup2;

/*
https://codingbat.com/prob/p172063

Given a string, return a new string made of 3 copies of the first 2 
chars of the original string. The string may be any length. If there 
are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
*/

public class ExtraFront {
	public String extraFront(String str) {
		//store answer in result
		String result="";
		
		//only store result if string has at least 2 characters
		//else if string has less than 2 characters concatenate what there is
		if(str.length()>1) result = str.substring(0, 2) + str.substring(0, 2)
			+str.substring(0, 2);
		else result = str+str+str;
		return result;
	}
}
