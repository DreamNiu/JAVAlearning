package Sort;

//冒泡排序

//自下而上（或从左到右）比较相邻记录的关键词，交换存在逆序的记录；使关键词较大的记录如气泡一般逐渐往上“飘移”直至“水面”。
//

//复杂度：最好O(n),最坏O(n^2),平均复杂度为O(n^2)

public class BubbleSort {
	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 冒泡排序
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}

		}
		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
