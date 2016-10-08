 package BiShi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//去除重复单词以及标点符号和空格

public class MainHW2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine(); // 输入字符串
		inputStr = inputStr.replace(",", " "); // 去除逗号
		inputStr = inputStr.replace(".", " "); // 去除句号

		String[] tempStr = inputStr.split(" "); // 将输入的字符串转换为一个字符串数组

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < tempStr.length; i++) {
			// System.out.print(" " + tempStr[i]);
			// System.out.print("\n");
			if (!list.contains(tempStr[i])) {
				// 去除重复的字符串
				list.add(tempStr[i]);
			}
		}
		String[] outputStr = list.toArray(new String[0]); // 输出字符串数组
		for (int i = 0; i < outputStr.length; i++) {
			System.out.print(outputStr[i] + " ");
		}
	
		// Where there is a will,There is a way.
	}
}
