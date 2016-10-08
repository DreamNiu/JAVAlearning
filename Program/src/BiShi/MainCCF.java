package BiShi;

//������

/*
 * 
ģ�����Ʊϵͳ����λ�ֲ�ʵ��

��λ����1-100���ܹ�20�ţ�ÿ��5����ͬһ�����������ȷ�����������λ�����û����������Ϊ��δ����ĳ�С�������
����һ������n����Ҫ����Ĵ���
������n�����֣�1-5��ÿ����Ҫ�����Ʊ������

ʾ�����������
���룺
4
2 5 4 2
�����
1 2
6 7 8 9 10
11 12 13 14
3 4
 * */

import java.util.Scanner;

public class MainCCF {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); // ������Ҫ����Ĵ���
		int[] inputArray = new int[n]; // ����ÿ�ζ����Ĺ����Ʊ��
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scanner.nextInt();
		}

		getTickets(n, inputArray); // ���ô����������Ʊ���
	}

	public static void getTickets(int n, int[] A) {
		// ���帨�����飨��1-100�����㣩��������¼ÿ��Ʊ��״̬��δ�۳�״̬Ϊ1���۳�״̬Ϊ0
		int[] ticketState = new int[101];
		for (int i = 0; i < ticketState.length; i++) {
			ticketState[i] = 1;
		}

		// ѭ������ÿ�ʶ���
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
			System.out.print("\n"); // ������һ��֮�����һ������

		}
	}

	public static void soldTickets(int[] ticketState, int temp) {
		boolean flag = false; // ��־�Ƿ�����������Ʊ
		boolean gotTicket = false; // ��־�Ƿ���������Ʊ
		for (int j = 1; j < 100; j += 5) {
			for (int k = j; k <= j + 5 - temp; k++) {
				flag = true;
				gotTicket = false;
				for (int t = k; t < k + temp; t++) {
					if (ticketState[t] != 1) {
						flag = false; // û��������Ʊ����־λ��Ϊfalse
					}
				}
				if (flag) {
					gotTicket = true;
					for (int t = k; t < k + temp; t++) {
						System.out.print(t + " "); // ����򵽵�Ʊ�ĺ���
						ticketState[t] = 0; // ���Ѿ��۳���Ʊ��־λ��0
					}
					break; // ��Ʊ���˳�ѭ��
				}
			}
			if (gotTicket) { // �Ѿ���������Ʊ
				break;
			}
		}
		if (!gotTicket) { // ���û��������Ʊ������δ�۳�����С����λ��
			int count = 0; // ���ڱ�־�Ƿ��Ѿ���ָ��������Ʊ
			for (int k = 1; k <= 100; k++) {
				if (ticketState[k] == 1) {
					System.out.print(k + " ");
					ticketState[k] = 0;
					count++;
				}
				if (count == temp) {
					break; // �Ѿ���ָ��������Ʊ���˳�ѭ��
				}
			}
		}
	}
}
