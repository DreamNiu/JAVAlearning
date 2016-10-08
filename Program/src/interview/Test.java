package interview;

public class Test {
	public static void main(String[] args) {
		String str = "sdasewdasdaeawfawerfadsdfasrfqwesssss";
		int count = 0;
		char res = getMostFrequencyChar(str, count);
		System.out.println("���ִ���������ĸ�ǣ�" + res);
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
		System.out.println("�������Ĵ���Ϊ��" + count + "��");
		return ret;
	}
}
