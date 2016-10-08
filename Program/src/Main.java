
class ABC {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("参数" + i + "的数值为：" + args[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		String[] string = { "tom", "jack", "danney" };
		ABC.main(string);

		
		 if(args.length==0){
		 System.out.println("您调用的main方法没有任何参数！");
		 }
		 else{
		 System.out.println("您调用main函数是指定的参数包括：");
		 for(int i=0;i<args.length;i++){
		 System.out.println("参数"+i+"的数值为："+args[i]);
		 }
		 }
	}
}
