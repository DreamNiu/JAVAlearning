package interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//列出一个数组里的全部元素的组合，例如：{1,2},列出1,2,12,21;使用递归的循环算法
public class ListArraysTest {
	public static void main(String[] args) throws Exception {
		String[] array = { "1", "2","3" };
 		listAll(Arrays.asList(array), "");
	}

	public static void listAll(List candidate, String prefix) {
		System.out.println(prefix);
		for (int i = 0; i < candidate.size(); i++) {
			List temp = new LinkedList(candidate);
			listAll(temp, prefix + temp.remove(i)); // 递归过程
		}
	}
}
