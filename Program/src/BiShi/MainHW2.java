 package BiShi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ȥ���ظ������Լ������źͿո�

public class MainHW2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine(); // �����ַ���
		inputStr = inputStr.replace(",", " "); // ȥ������
		inputStr = inputStr.replace(".", " "); // ȥ�����

		String[] tempStr = inputStr.split(" "); // ��������ַ���ת��Ϊһ���ַ�������

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < tempStr.length; i++) {
			// System.out.print(" " + tempStr[i]);
			// System.out.print("\n");
			if (!list.contains(tempStr[i])) {
				// ȥ���ظ����ַ���
				list.add(tempStr[i]);
			}
		}
		String[] outputStr = list.toArray(new String[0]); // ����ַ�������
		for (int i = 0; i < outputStr.length; i++) {
			System.out.print(outputStr[i] + " ");
		}
	
		// Where there is a will,There is a way.
	}
}
