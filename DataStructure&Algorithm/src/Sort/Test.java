package Sort;

public class Test {

	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 8, 5, 6, 4 };
		System.out.println("排序之前的数组A：");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// 直接选择

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
		System.out.println("\n\n排序之后的数组Ａ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
