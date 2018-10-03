package warmup2;

/*
 * 
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.


	stringX("xxHxix") → "xHix"
	stringX("abxxxcd") → "abcd"
	stringX("xabxxxcdx") → "xabcdx"
 */

public class AltPairs {
	public String altPairs(String str) {
		  String result = "";
		  for(int i=0; i<str.length(); i=i+4) {
			  if(i+1>str.length()-1) {
				  result = result + str.charAt(i);
				  break;
			  }
			  result = result + str.charAt(i) + str.charAt(i+1);
		  }
		  return result;
	}
}
