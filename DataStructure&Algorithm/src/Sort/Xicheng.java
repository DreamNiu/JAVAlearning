package Sort;
import java.util.*;


public class Xicheng {	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����������A��Ԫ�ظ���n");
		int n=scanner.nextInt();
		int[] A=new int[n]; 
		System.out.println("����������Ԫ��");
		for(int i=0;i<A.length;i++){
			A[i]=scanner.nextInt();
		}
		System.out.println("����������A�ǣ�");
		Arrays.sort(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n����������B��Ԫ�ظ���b��");
		int b=scanner.nextInt();
		scanner.close();

		int[] B=new int[b];
		System.arraycopy(A, 0, B, 0, b);
		System.out.println("��ֵ�������B�ǣ�");
		for(int i=0;i<B.length;i++){
			System.out.print(B[i]+" ");
		}
		int[] C;
		C=(int[])B.clone();
		System.out.println("\n���ƺ������C�ǣ�");
		for(int i=0;i<C.length;i++){
			System.out.print(C[i]+" ");
		}
		
		int[] D=C;
		System.out.println("\n���ú������D�ǣ�");
		for(int i=0;i<D.length;i++){
			System.out.print(D[i]+" ");
		}
		
	}
}
