package BiShi;

import java.util.Scanner;

public class MainFibo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k;
		while (scanner.hasNext()) {
			try {
				k = scanner.nextInt();
				System.out.println(fibonaci(k));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(" ‰»Î”–ŒÛ£°");
				return;
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
