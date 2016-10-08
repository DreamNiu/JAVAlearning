package BiShi;

//京东笔试，输入一个数字A，求从2到A-1进制表示该数字的数值和的均值
import java.util.Scanner;

public class MainJD1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input");
		while (scanner.hasNextLine()) {// 注意while处理多个case
			int A = scanner.nextInt(); // 输入需要转换的数字
			int[] arrayA = new int[A]; // 转换的进制个数
			int result = 0; // 最终结果的分子数
			int fenmu = A - 2;
			for (int i = 2; i < arrayA.length; i++) {
				// System.out.println(i+"进制");
				result += transform(A, i);
				// System.out.println("\n");
			}

			System.out.println(result + "/" + fenmu);
		}

	}

	public static int transform(int num, int n) {
		// 参数num为输入的十进制数，参数n为要转换的进制 ,并且返回该进制下的各位数的和
		int array[] = new int[100];
		int location = 0;
		while (num != 0) {// 当输入的数不为0时循环执行求余和赋值
			int remainder = num % n;
			num = num / n;
			array[location] = remainder;// 将结果加入到数组中去
			location++;
		}
		int temp = 0;
		for (int i = 0; i < array.length - location-1; i++) {
			temp = temp + array[i];
		}
		// System.out.println(temp);
		//show(array,location-1);
		return temp;

	}

	private static void show(int[] arr, int n) {
		// 用于显示指定进制的数值,各位数在数组中是倒序显示的，需要将其翻转过来正序显示
		for (int i = n; i >= 0; i--) {
			if (arr[i] > 9) {
				System.out.print((char) (arr[i] + 55));
			} else
				System.out.print(arr[i] + "");
		}
	}
}