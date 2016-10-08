package BiShi;

import java.util.Scanner;

/*
 * 公司最近需要购进一批纪念品作为奖品，经过调查他们确定了两种纪念品，
 * 两种的价钱分别是 A和B，而公司用来购买纪念品的资金为n，
 * 现在经理想知道有多少购买方案，能使得资金全部用完，而且两种纪念品至少有一个。
 * 
 * 
样例输入(n a b)
1700 31 21
样例输出
3
 * */

public class MainLC2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = 0; // 总的资金
		int a = 0; // 第一种纪念币的价钱
		int b = 0; // 第二种纪念币的价钱
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
