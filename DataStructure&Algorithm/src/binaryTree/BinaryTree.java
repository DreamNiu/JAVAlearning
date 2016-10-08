package binaryTree;

//申明二叉树并且构造ta

public class BinaryTree {
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
	
	//先根序遍历
	public void preOrder(BinaryTree root){
		if(root!=null){
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	//中根序遍历
	public   void inOrder(BinaryTree root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	//后根序遍历
	public   void postOrder(BinaryTree root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
//
}
