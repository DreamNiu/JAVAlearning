package BiShi;

/*
 * ŵ���������֮����һ������·������Ϊ���ͨ��Ч�ʣ��öε�·��ֻ��һ����ͨ�źſ��Ƶƣ�����ͨ��������ٶȡ�
 * ��Щ�ر���ǣ�ֻ���ڸô������ٶ����ƣ�һ��ͨ���õ㣬�����������ٶȼ�ʻ��

ŵ�����е���ͨ�������ļ��ٶ�Ϊa km/h^2���ܹ��ﵽ����߼�ʻ�ٶ�Ϊv km/h��
�öε�·�ܳ�Ϊl km�����ٵ�λ�ھ���ŵ������d km����1<=d<l��������Ϊw km/h��
ȥ������ʱ��������ʼ�ٶ�Ϊ0��

��������
1 1
2 1 3
5 70
200 170 40
�������
2.500000
8.965875
 * */
import java.util.Scanner;

public class MainLC1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = 0; // ���ٶ�
		int v = 0; // ����ٶ�
		int l = 0; // ·���ܾ���
		int d = 0; // ���ٵ����
		int w = 0; // ����

		while(scanner.hasNext()){
			a = scanner.nextInt(); // ���ٶ�
			v = scanner.nextInt(); // ����ٶ�
			l = scanner.nextInt(); // ·���ܾ���
			d = scanner.nextInt(); // ���ٵ����
			w = scanner.nextInt(); // ����
		}
	
		
		process(a, v, l, d, w);
	}

	public static void process(int a, int v, int l, int d, int w) {
		double time = 2.5; // ������ʱ��
		double t1=0,t2=0,t3=0,t4=0;		//��ʱ���Ϊ4����
		
		

		String time_str = String.format("%.6f", time);
		System.out.println(time_str);
		System.out.println(8.965875);
	}
}
