import java.util.Scanner;
class TestIO{
	private static Scanner scanner;

	public static void main(String args[]){
		scanner = new Scanner(System.in);
		System.out.println("������:");
		System.out.println("�����������ո�");
		String name=scanner.next();
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("���Գɼ���");
		double point=scanner.nextDouble();
		boolean result=(point>=60)?true:false;
		System.out.println("-----------------------");
		System.out.println("�������Ϣ���£�");
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("���Գɼ���"+point);
		System.out.print("�Ƿ�ͨ����");
		if(result)
			System.out.println("ͨ����");
		else
			System.out.println("û��ͨ����");
	}
}