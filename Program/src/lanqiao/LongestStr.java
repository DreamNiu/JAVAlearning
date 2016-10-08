package lanqiao;

public class LongestStr {

	public static String getStart(String[] str) {
		String tmp = "";
		boolean flag = true;
		for (int i = 1; i < str[0].length() && flag; i++) {
			tmp = str[0].substring(0, i);
			for (int j = 1; j < str.length && flag; j++) {
				if (!str[j].startsWith(tmp)) {
					flag = false;
					break;
				}
			}
		}
		return tmp.substring(0, tmp.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(getStart(new String[] { "abcdef", "abc", "abckhi", "abcj180" }));
	}

}
