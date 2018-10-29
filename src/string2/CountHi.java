package string2;
/*
https://codingbat.com/prob/p147448


Return the number of times that the string "hi" appears anywhere in the 
given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/
public class CountHi {
	public int countHi(String str) {
		  int counter = 0;
		  if(str.length()==1) return 0;
		  for(int i=0; i<str.length(); i++) {
			  if(str.charAt(i)=='h' && str.charAt(i+1)=='i') {
				  counter++;
			  }
		  }
		  return counter;
	}
}
