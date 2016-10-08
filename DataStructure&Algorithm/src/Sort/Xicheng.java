package Sort;
import java.util.*;


public class Xicheng {	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入数组A的元素个数n");
		int n=scanner.nextInt();
		int[] A=new int[n]; 
		System.out.println("请输入数组元素");
		for(int i=0;i<A.length;i++){
			A[i]=scanner.nextInt();
		}
		System.out.println("排序后的数组A是：");
		Arrays.sort(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n请输入数组B的元素个数b：");
		int b=scanner.nextInt();
		scanner.close();

		int[] B=new int[b];
		System.arraycopy(A, 0, B, 0, b);
		System.out.println("赋值后的数组B是：");
		for(int i=0;i<B.length;i++){
			System.out.print(B[i]+" ");
		}
		int[] C;
		C=(int[])B.clone();
		System.out.println("\n复制后的数组C是：");
		for(int i=0;i<C.length;i++){
			System.out.print(C[i]+" ");
		}
		
		int[] D=C;
		System.out.println("\n引用后的数组D是：");
		for(int i=0;i<D.length;i++){
			System.out.print(D[i]+" ");
		}
		
	}
}
