package interview;

public class Test {
	public static void main(String[] args) {
		String str = "sdasewdasdaeawfawerfadsdfasrfqwesssss";
		int count = 0;
		char res = getMostFrequencyChar(str, count);
		System.out.println("出现次数最多的字母是：" + res);
	}

	public static char getMostFrequencyChar(String str, int count) {
		char ret = ' ';
		int[] sum = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))
				sum[c]++;
		}
		for (int i = 0; i < sum.length; i++)
			if (sum[i] > count) {
				count = sum[i];
				ret = (char) i;
			}
		System.out.println("出现最多的次数为：" + count + "次");
		return ret;
	}
}
