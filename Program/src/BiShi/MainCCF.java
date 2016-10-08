package BiShi;

//升级版

/*
 * 
模拟火车售票系统的座位分布实现

座位号是1-100，总共20排，每排5个，同一个订单里优先分配连续的座位，如果没有连续的作为按未分配的虫小到大分配
输入一个整数n，需要购买的次数
再输入n个数字（1-5）每次需要购买的票的张数

示例输入输出：
输入：
4
2 5 4 2
输出：
1 2
6 7 8 9 10
11 12 13 14
3 4
 * */

import java.util.Scanner;

public class MainCCF {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); // 输入需要购买的次数
		int[] inputArray = new int[n]; // 输入每次订单的购买的票数
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scanner.nextInt();
		}

		getTickets(n, inputArray); // 调用处理函数输出订票结果
	}

	public static void getTickets(int n, int[] A) {
		// 定义辅助数组（从1-100更方便），用来记录每张票的状态，未售出状态为1，售出状态为0
		int[] ticketState = new int[101];
		for (int i = 0; i < ticketState.length; i++) {
			ticketState[i] = 1;
		}

		// 循环处理每笔订单
		for (int i = 0; i < n; i++) {
			int temp = A[i];
			if (temp == 1) {
				for (int k = 1; k <= 100; k++) {
					if (ticketState[k] == 1) {
						System.out.print(k + " ");
						ticketState[k] = 0;
						break;
					}
				}
			} else {
				soldTickets(ticketState, temp);
			}
			System.out.print("\n"); // 处理完一笔之后输出一个换行

		}
	}

	public static void soldTickets(int[] ticketState, int temp) {
		boolean flag = false; // 标志是否有连座的余票
		boolean gotTicket = false; // 标志是否买到连座的票
		for (int j = 1; j < 100; j += 5) {
			for (int k = j; k <= j + 5 - temp; k++) {
				flag = true;
				gotTicket = false;
				for (int t = k; t < k + temp; t++) {
					if (ticketState[t] != 1) {
						flag = false; // 没有连座的票，标志位置为false
					}
				}
				if (flag) {
					gotTicket = true;
					for (int t = k; t < k + temp; t++) {
						System.out.print(t + " "); // 输出买到的票的号码
						ticketState[t] = 0; // 将已经售出的票标志位置0
					}
					break; // 买到票，退出循环
				}
			}
			if (gotTicket) { // 已经买到连座的票
				break;
			}
		}
		if (!gotTicket) { // 如果没有连座的票，分配未售出的最小的座位号
			int count = 0; // 用于标志是否已经买到指定张数的票
			for (int k = 1; k <= 100; k++) {
				if (ticketState[k] == 1) {
					System.out.print(k + " ");
					ticketState[k] = 0;
					count++;
				}
				if (count == temp) {
					break; // 已经买到指定张数的票，退出循环
				}
			}
		}
	}
}
