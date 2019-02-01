package string2;
/*
https://codingbat.com/prob/p134250

We'll say that a String is xy-balanced if for all the 'x' chars in the 
string, there exists a 'y' char somewhere later in the string. 
So "xxy" is balanced, but "xyx" is not. One 'y' can balance 
multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
*/
public class XyBalance {
	public boolean xyBalance(String str) {
		  boolean isY = true;
		  for(int i=0; i<str.length(); i++) {
			  if(str.charAt(i)=='x') isY=false;
			  else if(str.charAt(i)=='y' && !isY) isY=true;
		  }
		  return isY;
	}
}
