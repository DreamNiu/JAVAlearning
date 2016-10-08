package interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//�г�һ���������ȫ��Ԫ�ص���ϣ����磺{1,2},�г�1,2,12,21;ʹ�õݹ��ѭ���㷨
public class ListArraysTest {
	public static void main(String[] args) throws Exception {
		String[] array = { "1", "2","3" };
 		listAll(Arrays.asList(array), "");
	}

	public static void listAll(List candidate, String prefix) {
		System.out.println(prefix);
		for (int i = 0; i < candidate.size(); i++) {
			List temp = new LinkedList(candidate);
			listAll(temp, prefix + temp.remove(i)); // �ݹ����
		}
	}
}
