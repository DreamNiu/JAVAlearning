package testsss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();

		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("c");
		arrList.add("d");

		// ʹ��Iterator�������
		Iterator<String> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		// ʹ��For Each������
		for (String e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// ʹ��toString�������
		System.out.println(arrList);
	}
}
