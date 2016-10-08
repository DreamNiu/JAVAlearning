package Sort;
//希尔排序



/*基本思想：该方法实质上是一种渐减增量排序。
 * 它是直接插入排序算法的一种更高效的改进版本，是不稳定的一种排序算法。
  
  把记录按下标的一定增量分组，对每组使用直接插入排序法，
  随着增量逐渐减少，所分成的组包含的关键词越来越多，
  到增量值减至1时，整个文件恰好被分成一个组，算法便告终止。

 * */


//复杂度为O(nLogn)

public class ShellSort {
	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 5, 6, 4 };
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 希尔排序
		int gap = A.length / 2;
		while (1 <= gap) {
			// 把距离为 gap 的元素编为一个组，扫描所有组
			for (int i = gap; i < A.length; i++) {
				int j = 0;
				int temp = A[i];
				// 对距离为 gap 的元素组进行排序
				for (j = i - gap; j >= 0 && temp < A[j]; j = j - gap) {
					A[j + gap] = A[j];
				}
				A[j + gap] = temp;
			}
			gap = gap / 2; // 减小增量
		}

		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}

}
