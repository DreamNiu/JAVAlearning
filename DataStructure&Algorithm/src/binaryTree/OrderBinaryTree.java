package binaryTree;

//遍历二叉树

public class OrderBinaryTree {

	public static void main(String[] args) {
		int[] array = { 12, 76, 35, 22, 16, 48, 90, 46, 9, 40 };
		BinaryTree root = new BinaryTree(array[0]); // 创建二叉树
		for (int i = 1; i < array.length; i++) {
			root.insert(root, array[i]); // 向二叉树中插入数据
		}
		System.out.print("先根遍历：");
		root.preOrder(root);
		System.out.print("\n中根遍历：");
		root.inOrder(root);
		System.out.print("\n后根遍历：");
		root.postOrder(root);
	}
}
