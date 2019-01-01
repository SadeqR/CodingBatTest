package recursion1;
/*
https://codingbat.com/prob/p101372

Given a string, compute recursively (no loops) a new string where all the 
lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/
public class ChangeXY {
	public String changeXY(String str) {
		  if(str.length()<1) return str;
		  if(str.charAt(0)=='x') return 'y' + changeXY(str.substring(1, str.length()));
		  else return str.charAt(0) + changeXY(str.substring(1, str.length()));
	}
}
