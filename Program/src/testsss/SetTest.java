package testsss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) throws FileNotFoundException {
		Set<String> words = new HashSet<String>();

		// ͨ����������������
		// ����1:�����������Ҫ�׳��쳣
		//InputStream inStream = SetTest.class.getResourceAsStream("me.txt");

		// ����2�����������Ҫ�׳��쳣
		 InputStream inStream = new
		 FileInputStream("E:\\file\\me.txt");
		Scanner in = new Scanner(inStream);
		while (in.hasNext()) {
			words.add(in.next());
		}

		Iterator<String> iter = words.iterator();

		for (int i = 0; i < 5; i++) {
			if (iter.hasNext())
				System.out.println(iter.next());
		}

		System.out.println(words.size());

	}
}
