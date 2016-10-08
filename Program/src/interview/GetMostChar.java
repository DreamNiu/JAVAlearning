package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;


//一个字符串可包含a-z中的多个字符，求出出现次数最多的字母及其出现的次数，如有多个字母重复出现就全部求出

public class GetMostChar {
	public static void main(String[] args) {
		String str = "abbcccddddeeeeffffggggghhhhhhkkkkkk";
		doString(str);
	}

	public static void doString(String str) {
		char[] chars = str.toCharArray();
		ArrayList lists = new ArrayList();
		TreeSet set = new TreeSet();
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
		System.out.println(set);
		Collections.sort(lists);
		System.out.println(lists);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i));
		}
		str = sb.toString();
		System.out.println(str);
		int max = 0;
		String maxString = "";
		ArrayList maxList = new ArrayList();

		Iterator its = set.iterator();
		while (its.hasNext()) {
			String os = (String) its.next();
			int begin = str.indexOf(os);
			int end = str.lastIndexOf(os);
			int value = end - begin + 1;
			if (value > max) {
				max = value;
				maxString = os;
				maxList.add(os);
			} else if (value == max) {
				maxList.add(os);
			}
		}
		int index = 0;
		for (int i = 0; i < maxList.size(); i++) {
			if (maxList.get(i).equals(maxString)) {
				index = i;
				break;
			}
		}
		System.out.print("max data:");
		for (int i = index; i < maxList.size(); i++) {
			System.out.println(maxList.get(i) + " ");
		}
		System.out.println("\n" + "max=" + max);
	}
}
