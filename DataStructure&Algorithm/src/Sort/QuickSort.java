package Sort;

//��������

//���Ͻ�������ԡ���ȡ�������ļ��е�ĳ����¼ (����ȡ��һ����¼) ��Ϊ��׼�����ոü�¼�Ĺؼ��ʴ�С���������ļ�����Ϊ�����������ļ���
//������ļ������м�¼�Ĺؼ��ʶ�С�ڻ���ڻ�׼��¼�Ĺؼ���
//�Ҳ����ļ������м�¼�Ĺؼ��ʶ����ڻ���ڻ�׼��¼�Ĺؼ���

//ƽ�����Ӷ�ΪO(nlogn),�ǲ��ȶ��������㷨

public class QuickSort {

	public static void quickSort(int[] A, int left, int right) {
		if (left > right){
			return;
		}
		
		int i, j, temp;
		temp = A[left]; // temp�д�ľ��ǻ�׼��
		i = left;
		j = right;
		while (i != j) {
			// ˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ��
			while (A[j] >= temp && i < j)
				j--;
			// ������ߵ�
			while (A[i] <= temp && i < j)
				i++;
			// �����������������е�λ��
			if (i < j) {
				int t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		// ���ս���׼����λ
		A[left] = A[i];
		A[i] = temp;

		quickSort(A, left, i - 1);// ����������ߵģ�������һ���ݹ�Ĺ���
		quickSort(A, i + 1, right);// ���������ұߵ� ��������һ���ݹ�Ĺ���
	}

	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("����֮ǰ������A��");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// ��������
		quickSort(A, 0, A.length - 1);

		System.out.println("\n\n����֮��������");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
