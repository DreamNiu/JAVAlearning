package Sort;

//ð������

//���¶��ϣ�������ң��Ƚ����ڼ�¼�Ĺؼ��ʣ�������������ļ�¼��ʹ�ؼ��ʽϴ�ļ�¼������һ�������ϡ�Ʈ�ơ�ֱ����ˮ�桱��
//

//���Ӷȣ����O(n),�O(n^2),ƽ�����Ӷ�ΪO(n^2)

public class BubbleSort {
	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("����֮ǰ������A��");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// ð������
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}

		}
		System.out.println("\n\n����֮��������");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
