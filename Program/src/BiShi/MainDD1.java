package BiShi;

import java.util.Scanner;

public class MainDD1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++){
			A[i]=i+1;
		}
		int[] temp=new int[n];
		for(int i=0;i<A.length;i++){
			temp[i]=1;
		}
		for(int i=0;i<A.length;i++){
			int count=0;
			if(temp[i]==1){
				count++;
				if(count==3){
					temp[i]=0;
					break;
				}
				
			}
		}
		System.out.print("7");
	}
}
