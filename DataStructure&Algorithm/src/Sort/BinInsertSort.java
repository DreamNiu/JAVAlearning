package Sort;
//二分插入排序

//二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，这里是按二分法找到合适的位置，可以减少比较的次数。

//平均复杂度为：O(n^2)


public class BinInsertSort {
	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 二分插入排序
		for (int i = 0; i < A.length; i++) {
			int temp = A[i];	//待插入的元素
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
				A[j + 1] = A[j];	//将大于temp的元素向后移动一位
			}
			if (left != i) {
				A[left] = temp;
			}
		}

		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
