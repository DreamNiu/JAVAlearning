package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	private static Scanner scanner;

	public static int rank(int key, int[] a) {
		int low = 0;
		int high = a.length;
		while (low <= high) {
			int mid = low + (high + low) / 2;
			if (key < a[mid])
				high = mid - 1;
			else if (key > a[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int[] A = { 8, 132, 53, 3, 6, 8, 4, 8, };
		System.out.println("数组A的长度是："+A.length);
		Arrays.sort(A);
		System.out.println("请输入需要查找的数字：");
		int key=scanner.nextInt();		
		System.out.println(key+"在数组中的位置是："+rank(key, A));
	}
}
