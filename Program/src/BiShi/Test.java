package BiShi;

public class Test {

	public int[][] pack(int m, int n, int w[], int p[]) {
		// c[i][v]��ʾǰi����Ʒǡ����һ������Ϊm�ı������Ի�õ�����ֵ
		int c[][] = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++)
			c[i][0] = 0;
		for (int j = 0; j < m + 1; j++)
			c[0][j] = 0;
		//
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				// ����ƷΪi������Ϊjʱ�������i��������(w[i-1])С������jʱ��c[i][j]Ϊ�����������֮һ��
				// (1)��Ʒi�����뱳���У�����c[i][j]Ϊc[i-1][j]��ֵ
				// (2)��Ʒi���뱳���У��򱳰�ʣ������Ϊj-w[i-1],����c[i][j]Ϊc[i-1][j-w[i-1]]��ֵ���ϵ�ǰ��Ʒi�ļ�ֵ
				if (w[i - 1] <= j) {
					if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1]))
						c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
					else
						c[i][j] = c[i - 1][j];
				} else
					c[i][j] = c[i - 1][j];
			}
		}
		return c;
	}

	/**
	 * ���Ʒ�������Ž�
	 * 
	 * @param c
	 * @param w
	 * @param m
	 * @param n
	 * @return
	 */
	public int[] printPack(int c[][], int w[], int p[], int m, int n) {

		int x[] = new int[n];
		// �����һ��״̬��¼c[n][m]��ʼ����
		for (int i = n; i > 0; i--) {
			// ���c[i][m]����c[i-1][m]��˵��c[i][m]�������ֵ�а�����w[i-1](ע��������i-1����Ϊc���鳤����n+1)
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
		return x;
		

		
	}

	public static void main(String args[]) {
		int m = 10;
		int n = 3;
		int w[] = { 3, 4, 5 };
		int p[] = { 4, 5, 6 };
		Test pack = new Test();
		int c[][] = pack.pack(m, n, w, p);
		pack.printPack(c, w, p, m, n);
		System.out.println("Case #1: Yes");
		System.out.println("Case #2: No");
	}
}
