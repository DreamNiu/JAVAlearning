package BiShi;

import java.util.Scanner;

public class MainMi1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		int n;		//���Ľ��ĸ���
		n=scanner.nextInt();
		
		//��ά����ֱ����ڴ洢���ڵ���ӽڵ����Ϣ
		int[][]  arr= new int[n][2]; 

		for (int i = 0; i < n; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		for(int i=0;i<n-1;i++){
			while(arr[i][0]==arr[i=1][0]){
				BinaryTree tree=new BinaryTree(arr[i][0]);
			}
		}
	}
}
class BinaryTree {
	int data; // ���ڵ�����
	BinaryTree left; // ������
	BinaryTree right; // ������

	// ʵ����������
	public BinaryTree(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	// ��������в����ӽڵ�
	public void insert(BinaryTree root, int data) {
		if (data > root.data) { // ��������ֵ�����ڸ��ڵ�
			if(root.right==null){
				root.right=new BinaryTree(data);
			}else{
				this.insert(root.right, data);
			}
		} else { // ��������ֵ��С�ڵ��ڸ��ڵ�
			if(root.left==null){
				root.left=new BinaryTree(data);
			}else{
				this.insert(root.left, data);
			}
		}
	}
}