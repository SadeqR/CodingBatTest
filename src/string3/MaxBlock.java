package string3;

/*
https://codingbat.com/prob/p179479

Given a string, return the length of the largest "block" in the string. 
A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/
public class MaxBlock {
	public int maxBlock(String str) {
		int startCount = 1;
		int highestCount = 0;
		if(str.length()==0) return 0;
		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - 2) {
				if (str.charAt(i) == str.charAt(i + 1))
					startCount++;
				else
					startCount = 1;
			}
			else
				startCount = 1;
			if(startCount>highestCount)
				highestCount = startCount;
		}
		return highestCount;
	}
}
