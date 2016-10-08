import java.util.Scanner;
class TestIO{
	private static Scanner scanner;

	public static void main(String args[]){
		scanner = new Scanner(System.in);
		System.out.println("请输入:");
		System.out.println("姓名（不含空格）");
		String name=scanner.next();
		System.out.println("年龄：");
		int age=scanner.nextInt();
		System.out.println("考试成绩：");
		double point=scanner.nextDouble();
		boolean result=(point>=60)?true:false;
		System.out.println("-----------------------");
		System.out.println("输入的信息如下：");
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("考试成绩："+point);
		System.out.print("是否通过：");
		if(result)
			System.out.println("通过！");
		else
			System.out.println("没有通过！");
	}
}