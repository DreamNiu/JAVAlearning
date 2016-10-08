package BiShi;

//华为机试题1，鸡兔同笼问题
import java.util.Scanner;

public class MainHW1 {
	public static void main(String[] args) {
		// System.out.println("s");

		Scanner scanner = new Scanner(System.in);
		int h = 0; // 总的头数
		int f = 0; // 总的脚数
		try {
			h = scanner.nextInt(); // 总的头数
			f = scanner.nextInt(); // 总的脚数

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0 0 0");
			return;
		}

		int m = 0; // 标志最终的头和脚是否匹配
		int r = (f - 2 * h) / 2; // 兔子的数目
		int p = h - r; // 鸽子的数目

		// System.out.println("兔子："+r);
		// System.out.println("鸽子："+p);

		if ((2 * p + 4 * r) == f && (p + r) == h && r >= 0 && p >= 0) {
			m = 1;
		} else {
			m = 0;
			p = 0;
			r = 0;
		}
		System.out.println(m + " " + p + " " + r);
	}
}
