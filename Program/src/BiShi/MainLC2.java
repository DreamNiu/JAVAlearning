package BiShi;

import java.util.Scanner;

/*
 * ��˾�����Ҫ����һ������Ʒ��Ϊ��Ʒ��������������ȷ�������ּ���Ʒ��
 * ���ֵļ�Ǯ�ֱ��� A��B������˾�����������Ʒ���ʽ�Ϊn��
 * ���ھ�����֪���ж��ٹ��򷽰�����ʹ���ʽ�ȫ�����꣬�������ּ���Ʒ������һ����
 * 
 * 
��������(n a b)
1700 31 21
�������
3
 * */

public class MainLC2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = 0; // �ܵ��ʽ�
		int a = 0; // ��һ�ּ���ҵļ�Ǯ
		int b = 0; // �ڶ��ּ���ҵļ�Ǯ
		n = scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		process(a, b, n);

	}

	public static void process(int a, int b, int n) {
		int count = 0;
		if(a>0&&b>0){
			for (int i = 1; i <= 100; i++) {
				for (int j = 1; j <= 100; j++) {
					int temp = a * i + b * j;
					if (temp == n) {
						// System.out.println("a="+a+"b="+b);
						count++;
					}
					if (temp > n) {
						break;
					}
				}

			}
		}
		System.out.print(count);
	}
}
