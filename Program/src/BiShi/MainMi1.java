package BiShi;

import java.util.Scanner;

public class MainMi1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		int n;		//树的结点的个数
		n=scanner.nextInt();
		
		//二维数组分别用于存储父节点和子节点的信息
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
	int data; // 根节点数据
	BinaryTree left; // 左子树
	BinaryTree right; // 右子树

	// 实例化二叉树
	public BinaryTree(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	// 向二叉树中插入子节点
	public void insert(BinaryTree root, int data) {
		if (data > root.data) { // 右子树的值都大于根节点
			if(root.right==null){
				root.right=new BinaryTree(data);
			}else{
				this.insert(root.right, data);
			}
		} else { // 左子树的值都小于等于根节点
			if(root.left==null){
				root.left=new BinaryTree(data);
			}else{
				this.insert(root.left, data);
			}
		}
	}
}