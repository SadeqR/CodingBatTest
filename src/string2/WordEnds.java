package string2;
/*
https://codingbat.com/prob/p147538

Given a string and a non-empty word string, return a string made of each 
char just before and just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, and a char 
may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
*/

public class WordEnds {
	public String wordEnds(String str, String word) {
		  String res = "";
		  for(int i=0; i<str.length()-word.length()+1; i++) {
			  if(str.substring(i, i+word.length()).equals(word)) {
				  //take left index long as 'word' does not start from 0
				  if (i>0){
					  res += str.substring(i-1,i);
				  }
				  //take right index long as 'word' does not end at last index
				  if(i<=(str.length()-word.length())-1) {
					  res += str.substring(i+word.length(),i+word.length()+1);
				  }
			  }
		  }
		  return res;
	}
}
