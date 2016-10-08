package Sort;

//快速排序

//不断交换反序对。任取待排序文件中的某个记录 (例如取第一个记录) 作为基准，按照该记录的关键词大小，将整个文件划分为左右两个子文件：
//左侧子文件中所有记录的关键词都小于或等于基准记录的关键词
//右侧子文件中所有记录的关键词都大于或等于基准记录的关键词

//平均复杂度为O(nlogn),是不稳定的排序算法

public class QuickSort {

	public static void quickSort(int[] A, int left, int right) {
		if (left > right){
			return;
		}
		
		int i, j, temp;
		temp = A[left]; // temp中存的就是基准数
		i = left;
		j = right;
		while (i != j) {
			// 顺序很重要，要先从右边开始找
			while (A[j] >= temp && i < j)
				j--;
			// 再找左边的
			while (A[i] <= temp && i < j)
				i++;
			// 交换两个数在数组中的位置
			if (i < j) {
				int t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		// 最终将基准数归位
		A[left] = A[i];
		A[i] = temp;

		quickSort(A, left, i - 1);// 继续处理左边的，这里是一个递归的过程
		quickSort(A, i + 1, right);// 继续处理右边的 ，这里是一个递归的过程
	}

	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 快速排序
		quickSort(A, 0, A.length - 1);

		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
