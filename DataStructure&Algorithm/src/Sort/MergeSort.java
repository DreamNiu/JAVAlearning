package Sort;
//�鲢����

//�鲢������õ��Ƿ��η�ԭ�����η���ָ��һ�������ģΪn������ֽ�Ϊk����ģ��С�������⣬��Щ�����⻥���������ԭ������ͬ��
//Ȼ����õݹ鷽�������Щ�����⣬������ʵ��ķ�������������Ľ�ϲ���ԭ����Ľ⡣

//�鲢����ľ�������ǽ�ԭ����������֣�����Ƕ��֣������ķַ���һ���ȶ���Ч���ã�Ϊ��������A��B��
//������A��B�ٷֱ���ж��֣��ݹ���ȥ...ֱ�����ֵõ�С��ֻ��һ��Ԫ��ʱ˵����С���Ѿ�����
//Ȼ��ÿ�������С����ϵ�һ�������γ�ԭ����� �⡣

//�临�Ӷ�Ϊ��O(nlogn),��һ���ȶ������򷽷�

public class MergeSort {

	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			// ����߽��еݹ�
			mergeSort(a, left, middle);
			// ���ұ߽��еݹ�
			mergeSort(a, middle + 1, right);
			// �ϲ�
			merge(a, left, middle, right);
		}
	}

	private static void merge(int[] a, int left, int middle, int right) {
		int[] tmpArr = new int[a.length];
		int mid = middle + 1; // �ұߵ���ʼλ��
		int tmp = left;
		int third = left;
		while (left <= middle && mid <= right) {
			// ������������ѡȡ��С���������м�����
			if (a[left] <= a[mid]) {
				tmpArr[third++] = a[left++];
			} else {
				tmpArr[third++] = a[mid++];
			}
		}
		// ��ʣ��Ĳ��ַ����м�����
		while (left <= middle) {
			tmpArr[third++] = a[left++];
		}
		while (mid <= right) {
			tmpArr[third++] = a[mid++];
		}
		// ���м����鸴�ƻ�ԭ����
		while (tmp <= right) {
			a[tmp] = tmpArr[tmp++];
		}
	}

	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 10, 1, 8, 5, 6, 9, 4 };
		System.out.println("����֮ǰ������A��");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// ������
		mergeSort(A, 0, A.length - 1);

		System.out.println("\n\n����֮��������");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
