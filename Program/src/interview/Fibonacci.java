package interview;

import java.util.Scanner;

//���õݹ�ķ�������Fibonacci���е�ͨ��
public class Fibonacci {
	public static int k = 0;

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		System.out.println(fibonacci(a));
		System.out.println("һ��������" + k + "��");

	}

	public static long fibonacci(Long m) {
		if (m == 0 || m == 1) {
			k++;
			return m;
		} else {
			return fibonacci(m - 1) + fibonacci(m - 2);
		}
	}
}
