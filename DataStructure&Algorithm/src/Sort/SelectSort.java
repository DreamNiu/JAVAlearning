package Sort;

//ֱ��ѡ������

//�Դ�������ļ�����n��ѡ�����е� i ��ѡ��� i С���󣩵ļ�¼���ڵ� i��n-i+1����λ���ϡ�
//������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼ(���)λ�ã�ֱ��ѡ������Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��ǰ�棩��
//�Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
//ƽ�����Ӷ�Ϊ O(n^2),��һ�ֲ��ȶ������򷽷�


public class SelectSort {	//ѡ������ľ���ʵ��

	public static void selectSort(int[] A) {

		for (int i = 0; i < A.length; i++) {
			int temp = A[i];
			int flag = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < temp) {
					temp = A[j];
					flag = j;
				}
			}
			A[flag] = A[i];
			A[i] = temp;
		}
	}

	public static void main(String[] args) {
	
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("����֮ǰ������A��");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// ֱ��ѡ������
		selectSort(A);

		System.out.println("\n\n����֮��������");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
