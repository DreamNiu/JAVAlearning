package BiShi;

//��Ϊ������1������ͬ������
import java.util.Scanner;

public class MainHW1 {
	public static void main(String[] args) {
		// System.out.println("s");

		Scanner scanner = new Scanner(System.in);
		int h = 0; // �ܵ�ͷ��
		int f = 0; // �ܵĽ���
		try {
			h = scanner.nextInt(); // �ܵ�ͷ��
			f = scanner.nextInt(); // �ܵĽ���

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0 0 0");
			return;
		}

		int m = 0; // ��־���յ�ͷ�ͽ��Ƿ�ƥ��
		int r = (f - 2 * h) / 2; // ���ӵ���Ŀ
		int p = h - r; // ���ӵ���Ŀ

		// System.out.println("���ӣ�"+r);
		// System.out.println("���ӣ�"+p);

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
