package BiShi;

import java.util.Scanner;

public class MainFH1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			int n = 0; // ս������������
			int m = 0; // �ʽ�

			n = scanner.nextInt();
			m = scanner.nextInt();

			int[] w = new int[n]; // �۸�
			int[] v = new int[n]; // ս����

			for (int i = 0; i < n; i++) {
				w[i] = scanner.nextInt();
				v[i] = scanner.nextInt();
			}
			pack(m, n, w, v);

		}
		scanner.close();
	}

	// ��̬�滮�㷨ʵ�ֽ������Լ������Ϊ�����Ž�Ϊ���������
	public static void pack(int m, int n, int w[], int p[]) {
		int c[][] = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++)
			c[i][0] = 0;
		for (int j = 0; j < m + 1; j++)
			c[0][j] = 0;
		//
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {

				if (w[i - 1] <= j) {
					if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1]))
						c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
					else
						c[i][j] = c[i - 1][j];
				} else
					c[i][j] = c[i - 1][j];
			}
		}
		//����x[]���ڼ�¼���Ž�����
		int x[] = new int[n];
		// �����һ��״̬��¼c[n][m]��ʼ����
		for (int i = n; i > 0; i--) {
			if (c[i][m] > c[i - 1][m]) {
				x[i - 1] = 1;
				m -= w[i - 1];
			}
		}

		int maxAttack = 0;
		for (int j = 0; j < n; j++) {
			if (x[j] == 1) {
				maxAttack += p[j];
			}
		}
		System.out.print(maxAttack);
	}

}
