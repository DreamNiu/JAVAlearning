package testsss;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// ʮ�������ķ�Χ��l~r��������������m��1
		int l = 0, r = 0, m = 0;
		int count = 0; // �������Ĵ���
		while (scanner.hasNext()) {
			l = scanner.nextInt();
			r = scanner.nextInt();
			m = scanner.nextInt();

			if (l > r)
				count = -1;
			for (int i = l; i <= r; i++) {
				if (checkOne(i, m))
					count++;
				// System.out.println("count:" + count);
			}
			if (count == 0)
				count = -1;
			System.out.println("" + count);
		}

	}

	public static boolean checkOne(int i, int m) {
		while (i != 0) {
			if ((i & 1) == 1)
				m--;
			i = i >> 1;
		}
		// System.out.println("m:" + m);
		if (m == 0)
			return true;
		else
			return false;
	}

}
