

import java.util.Scanner;

public class Sum {
	public int intnumber(){
		System.out.println("�����������ֱ������999������999�����������");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		return i;
	}
	public static void main(String []args){
		Sum sum=new Sum();
		int s=sum.intnumber();
	for(;sum.intnumber()!=999;){
		//System.out.println("===");
		s=s+sum.intnumber();
	}
	System.out.println("����������ĺ�Ϊ��"+s);
}
}