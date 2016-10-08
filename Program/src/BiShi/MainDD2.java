package BiShi;

import java.util.Scanner;

public class MainDD2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k;
		while (scanner.hasNext()) {
			k = scanner.nextInt();
			if (k == 1) {
				System.out.print("0"+" "+"1");
			}
			if (k >= 2) {
				System.out.print(fibonaci(k-1)+" "+fibonaci(k));
			}
		}
	}

	public static int fibonaci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonaci(n - 1) + fibonaci(n - 2);
		}
	}
}
