package BiShi;

import java.util.Scanner;

public class MainFH1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			int n = 0; // 战斗机器的种类
			int m = 0; // 资金

			n = scanner.nextInt();
			m = scanner.nextInt();

			int[] w = new int[n]; // 价格
			int[] v = new int[n]; // 战斗力

			for (int i = 0; i < n; i++) {
				w[i] = scanner.nextInt();
				v[i] = scanner.nextInt();
			}
			pack(m, n, w, v);

		}
		scanner.close();
	}

	// 动态规划算法实现结果处理，约束条件为金额，最优解为攻击力最大
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
		//数组x[]用于记录最优解序列
		int x[] = new int[n];
		// 从最后一个状态记录c[n][m]开始逆推
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
