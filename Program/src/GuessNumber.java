
/*
 * �������һ��50-100֮����������ӿ���̨������һ��������
 * �����������ȣ�����¶��ˡ��ظ���������Ϸ����¼�²� ����
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
			System.out.println("������һ��������");
			b = scanner.nextInt();

			if (a > b) {
				System.out.println("��С�ˣ�");
			}else if(a<b){
				System.out.println("�´��ˣ�");
			}
			count++;
		} while (a != b);
		System.out.println("�¶��ˣ��²�����ǣ�"+count);

	}
}
