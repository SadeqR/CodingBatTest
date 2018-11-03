package string2;

/*
https://codingbat.com/prob/p109637

Given two strings, word and a separator, return a big string made of count
occurences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/
public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		  String result = "";
		  for(int i=0; i<count; i++) {
			  if(i<count-1) result += word + sep;
			  else result += word;
		  }
		  return result;
	}
}
