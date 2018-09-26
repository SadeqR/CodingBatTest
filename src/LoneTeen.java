
public class LoneTeen {
	public boolean loneTeen(int a, int b) {
		return ((a>12 && a<20) && (b<13 || b>19) || (b>12 && b<20) && (a<13 || a>19));
	}
}
