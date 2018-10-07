package warmup2;

/*
https://codingbat.com/prob/p110141


Given a string, return a version without the first 2 chars. Except 
keep the first char if it is 'a' and keep the second char if it is 
'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/
public class deFront {
	public String deFront(String str) {    
		String result = "";  
		if(str.charAt(0)=='a') result = result + str.substring(0, 1);
		if(str.charAt(1)=='b') result = result + str.substring(1, 2);
		result = result + str.substring(2, str.length());
		return result;
	}
}
