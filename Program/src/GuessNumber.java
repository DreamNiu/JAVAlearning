
/*
 * 随机生成一个50-100之间的整数，从控制台输入另一个整数，
 * 如果两个数相等，输出猜对了。重复猜数字游戏并记录猜测 次数
 * */
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private static Scanner scanner;

	public static void main(String[] args) {
		int a = new Random().nextInt(50) + 50;
		System.out.println(a);
		int b = 0;
		int count=0;
		do {
			scanner = new Scanner(System.in);
			System.out.println("请输入一个整数：");
			b = scanner.nextInt();

			if (a > b) {
				System.out.println("猜小了！");
			}else if(a<b){
				System.out.println("猜大了！");
			}
			count++;
		} while (a != b);
		System.out.println("猜对了！猜测次数是："+count);

	}
}
