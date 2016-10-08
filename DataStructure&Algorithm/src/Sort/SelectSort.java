package Sort;

//直接选择排序

//对待排序的文件进行n次选择，其中第 i 次选择第 i 小（大）的记录放在第 i（n-i+1）个位置上。
//首先在未排序序列中找到最小（大）元素，存放到排序序列的起始(最后)位置，直接选择排序然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾（前面）。
//以此类推，直到所有元素均排序完毕。
//平均复杂度为 O(n^2),是一种不稳定的排序方法


public class SelectSort {	//选择排序的具体实现

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
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 直接选择排序
		selectSort(A);

		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
