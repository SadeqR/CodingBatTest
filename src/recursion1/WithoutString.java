package recursion1;

/*
https://codingbat.com/prob/p192570

Given two strings, base and remove, return a version of the base string 
where all instances of the remove string have been removed (not case 
sensitive). You may assume that the remove string is length 1 or more. 
Remove only non-overlapping instances, so with "xxx" removing "xx" 
leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/
public class WithoutString {
	public String withoutString(String base, String remove) {
		  base = base.toLowerCase();
		  remove = remove.toLowerCase();
		  String result = "";
		  String temp = "";
		  
		  for(int i=0; i<base.length(); i++) {
			  if(!base.substring(i, i+remove.length()).equals(remove))
				  result += base.charAt(i) + "";
			  else 
				  i = i + remove.length() - 1;
			  
				  
		  }
		  return result;
	}
}
