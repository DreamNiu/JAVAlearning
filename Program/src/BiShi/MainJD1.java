package BiShi;

//�������ԣ�����һ������A�����2��A-1���Ʊ�ʾ�����ֵ���ֵ�͵ľ�ֵ
import java.util.Scanner;

public class MainJD1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input");
		while (scanner.hasNextLine()) {// ע��while������case
			int A = scanner.nextInt(); // ������Ҫת��������
			int[] arrayA = new int[A]; // ת���Ľ��Ƹ���
			int result = 0; // ���ս���ķ�����
			int fenmu = A - 2;
			for (int i = 2; i < arrayA.length; i++) {
				// System.out.println(i+"����");
				result += transform(A, i);
				// System.out.println("\n");
			}

			System.out.println(result + "/" + fenmu);
		}

	}

	public static int transform(int num, int n) {
		// ����numΪ�����ʮ������������nΪҪת���Ľ��� ,���ҷ��ظý����µĸ�λ���ĺ�
		int array[] = new int[100];
		int location = 0;
		while (num != 0) {// �����������Ϊ0ʱѭ��ִ������͸�ֵ
			int remainder = num % n;
			num = num / n;
			array[location] = remainder;// ��������뵽������ȥ
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
		// ������ʾָ�����Ƶ���ֵ,��λ�����������ǵ�����ʾ�ģ���Ҫ���䷭ת����������ʾ
		for (int i = n; i >= 0; i--) {
			if (arr[i] > 9) {
				System.out.print((char) (arr[i] + 55));
			} else
				System.out.print(arr[i] + "");
		}
	}
}