package string2;
/*
https://codingbat.com/prob/p111624

Return true if the string "cat" and "dog" appear the same number of 
times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/
public class CatDog {
	public boolean catDog(String str) {
		  int countDog = 0;
		  int countCat = 0;
		  for(int i=0; str.length()>2 && i<str.length(); i++) {
			  if(i==str.length()-2) break;
			  if(str.substring(i, i+3).equals("dog")) countDog++;
			  if(str.substring(i, i+3).equals("cat")) countCat++;
		  }
		  return countDog==countCat? true:false;
	}
}
