package string3;
/*
https://codingbat.com/prob/p198664

We'll say that a lowercase 'g' in a string is "happy" if there is another 
'g' immediately to its left or right. Return true if all the g's in the 
given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/
public class GHappy {
	public boolean gHappy(String str) {
		  boolean happy = true;
		  for(int i=0; i<str.length(); i++) {
			  if(str.charAt(i)=='g') {
				  if(i>=1 && str.charAt(i-1)=='g') happy = true;
				  else if(i<=str.length()-2 && str.charAt(i+1)=='g') happy = true;
				  else happy = false;
			  }
		  }
		  return happy;
	}
}
