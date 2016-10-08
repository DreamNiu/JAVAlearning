package binaryTree;

//�������������ҹ���ta

public class BinaryTree {
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
	
	//�ȸ������
	public void preOrder(BinaryTree root){
		if(root!=null){
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	//�и������
	public   void inOrder(BinaryTree root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	//��������
	public   void postOrder(BinaryTree root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
//
}
