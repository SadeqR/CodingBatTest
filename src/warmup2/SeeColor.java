package warmup2;

/*
https://codingbat.com/prob/p199216

Given a string, if the string begins with "red" or "blue" return that 
color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public class SeeColor {
	public String seeColor(String str) {
		//check the string size and colour accordingly
		if(str.length()>2 && str.substring(0, 3).equals("red")) 
			return "red";
		if(str.length()>3 && str.substring(0, 4).equals("blue")) 
			return "blue";
		//if no 'red' or 'blue' string is found return empty string
		return "";
	}
}
