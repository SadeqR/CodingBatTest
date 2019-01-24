package string3;

public class CountTriple {
	public int countTriple(String str) {
		  int count = 0;
		  for(int i=0; i<=str.length()-3; i++) {
			  if(str.charAt(i+1)==str.charAt(i) && str.charAt(i+2)==str.charAt(i))
				  count++;
		  }
		  return count;
	}
}
