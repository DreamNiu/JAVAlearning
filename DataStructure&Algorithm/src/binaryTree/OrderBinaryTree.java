package binaryTree;

//����������

public class OrderBinaryTree {

	public static void main(String[] args) {
		int[] array = { 12, 76, 35, 22, 16, 48, 90, 46, 9, 40 };
		BinaryTree root = new BinaryTree(array[0]); // ����������
		for (int i = 1; i < array.length; i++) {
			root.insert(root, array[i]); // ��������в�������
		}
		System.out.print("�ȸ�������");
		root.preOrder(root);
		System.out.print("\n�и�������");
		root.inOrder(root);
		System.out.print("\n���������");
		root.postOrder(root);
	}
}
