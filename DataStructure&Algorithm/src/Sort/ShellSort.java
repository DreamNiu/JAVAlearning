package Sort;
//ϣ������



/*����˼�룺�÷���ʵ������һ�ֽ�����������
 * ����ֱ�Ӳ��������㷨��һ�ָ���Ч�ĸĽ��汾���ǲ��ȶ���һ�������㷨��
  
  �Ѽ�¼���±��һ���������飬��ÿ��ʹ��ֱ�Ӳ������򷨣�
  ���������𽥼��٣����ֳɵ�������Ĺؼ���Խ��Խ�࣬
  ������ֵ����1ʱ�������ļ�ǡ�ñ��ֳ�һ���飬�㷨�����ֹ��

 * */


//���Ӷ�ΪO(nLogn)

public class ShellSort {
	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1, 5, 6, 4 };
		System.out.println("����֮ǰ������A��");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		// ϣ������
		int gap = A.length / 2;
		while (1 <= gap) {
			// �Ѿ���Ϊ gap ��Ԫ�ر�Ϊһ���飬ɨ��������
			for (int i = gap; i < A.length; i++) {
				int j = 0;
				int temp = A[i];
				// �Ծ���Ϊ gap ��Ԫ�����������
				for (j = i - gap; j >= 0 && temp < A[j]; j = j - gap) {
					A[j + gap] = A[j];
				}
				A[j + gap] = temp;
			}
			gap = gap / 2; // ��С����
		}

		System.out.println("\n\n����֮��������");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}

}
