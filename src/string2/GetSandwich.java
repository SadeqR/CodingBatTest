package string2;
/*
https://codingbat.com/prob/p129952

A sandwich is two pieces of bread with something in between. Return the 
string that is between the first and last appearance of "bread" in the 
given string, or return the empty string "" if there are not two pieces 
of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/
public class GetSandwich {
	public String getSandwich(String str) {
		  String result = "";
		  int firstIndex = 0;
		  int lastIndex = 0;
		  boolean breadFound = false;
		  if(str.length()<11) return result;
		  for(int i=0; i<str.length()-4; i++) {
			  if(str.substring(i, i+5).equals("bread") && breadFound==false) {
				  firstIndex = i+5;
				  breadFound = true;
			  }
			  if(str.substring(i, i+5).equals("bread") && breadFound==true) {
				  lastIndex = i;
			  }
		  }
		  result = str.substring(firstIndex, lastIndex);
		  return result;
	}
}
