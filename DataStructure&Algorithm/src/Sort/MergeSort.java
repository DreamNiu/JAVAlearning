package Sort;
//归并排序

//归并排序采用的是分治法原理。分治法是指将一个输入规模为n的问题分解为k个规模较小的子问题，这些子问题互相独立且与原问题相同，
//然后采用递归方法求解这些子问题，最后用适当的方法将各子问题的解合并成原问题的解。

//归并排序的具体过程是将原来的数组二分（最好是二分，其他的分法不一定比二分效果好）为两个数组A和B，
//将数组A和B再分别进行二分，递归下去...直到最后分得的小组只有一个元素时说明该小组已经有序，
//然后将每个有序的小组组合到一起最终形成原问题的 解。

//其复杂度为：O(nlogn),是一种稳定的排序方法

public class MergeSort {

	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			// 对左边进行递归
			mergeSort(a, left, middle);
			// 对右边进行递归
			mergeSort(a, middle + 1, right);
			// 合并
			merge(a, left, middle, right);
		}
	}

	private static void merge(int[] a, int left, int middle, int right) {
		int[] tmpArr = new int[a.length];
		int mid = middle + 1; // 右边的起始位置
		int tmp = left;
		int third = left;
		while (left <= middle && mid <= right) {
			// 从两个数组中选取较小的数放入中间数组
			if (a[left] <= a[mid]) {
				tmpArr[third++] = a[left++];
			} else {
				tmpArr[third++] = a[mid++];
			}
		}
		// 将剩余的部分放入中间数组
		while (left <= middle) {
			tmpArr[third++] = a[left++];
		}
		while (mid <= right) {
			tmpArr[third++] = a[mid++];
		}
		// 将中间数组复制回原数组
		while (tmp <= right) {
			a[tmp] = tmpArr[tmp++];
		}
	}

	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 10, 1, 8, 5, 6, 9, 4 };
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 堆排序
		mergeSort(A, 0, A.length - 1);

		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
