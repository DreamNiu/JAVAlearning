package Sort;
//���ֲ�������

//���ַ����������˼���ֱ�Ӳ���һ����ֻ���Һ��ʵĲ���λ�õķ�ʽ��ͬ�������ǰ����ַ��ҵ����ʵ�λ�ã����Լ��ٱȽϵĴ�����

//ƽ�����Ӷ�Ϊ��O(n^2)


public class BinInsertSort {
	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("����֮ǰ������A��");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// ���ֲ�������
		for (int i = 0; i < A.length; i++) {
			int temp = A[i];	//�������Ԫ��
			int left = 0;
			int right = i - 1;
			int mid = 0;
			while (left <= right) {
				mid = (left + right) / 2;
				if (temp < A[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			for (int j = i - 1; j >= left; j--) {
				A[j + 1] = A[j];	//������temp��Ԫ������ƶ�һλ
			}
			if (left != i) {
				A[left] = temp;
			}
		}

		System.out.println("\n\n����֮��������");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
