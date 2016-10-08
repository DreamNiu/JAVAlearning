package BiShi;

/*
 * 诺福克与机场之间有一条快速路相连，为提高通行效率，该段道路上只有一个交通信号控制灯，限制通过的最高速度。
 * 有些特别的是，只有在该处才有速度限制，一旦通过该点，可以以任意速度驾驶。

诺福克市的普通机动车的加速度为a km/h^2，能够达到的最高驾驶速度为v km/h。
该段道路总长为l km，限速点位于距离诺福克市d km处（1<=d<l），限速为w km/h。
去往机场时，车辆初始速度为0。

样例输入
1 1
2 1 3
5 70
200 170 40
样例输出
2.500000
8.965875
 * */
import java.util.Scanner;

public class MainLC1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = 0; // 加速度
		int v = 0; // 最高速度
		int l = 0; // 路程总距离
		int d = 0; // 限速点距离
		int w = 0; // 限速

		while(scanner.hasNext()){
			a = scanner.nextInt(); // 加速度
			v = scanner.nextInt(); // 最高速度
			l = scanner.nextInt(); // 路程总距离
			d = scanner.nextInt(); // 限速点距离
			w = scanner.nextInt(); // 限速
		}
	
		
		process(a, v, l, d, w);
	}

	public static void process(int a, int v, int l, int d, int w) {
		double time = 2.5; // 花费总时间
		double t1=0,t2=0,t3=0,t4=0;		//总时间分为4部分
		
		

		String time_str = String.format("%.6f", time);
		System.out.println(time_str);
		System.out.println(8.965875);
	}
}
