

import java.util.Scanner;

public class Sum {
	public int intnumber(){
		System.out.println("请输入加数，直到输入999结束（999不计入加数）");
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
	System.out.println("输入的整数的和为："+s);
}
}