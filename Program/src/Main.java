
class ABC {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("����" + i + "����ֵΪ��" + args[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		String[] string = { "tom", "jack", "danney" };
		ABC.main(string);

		
		 if(args.length==0){
		 System.out.println("�����õ�main����û���κβ�����");
		 }
		 else{
		 System.out.println("������main������ָ���Ĳ���������");
		 for(int i=0;i<args.length;i++){
		 System.out.println("����"+i+"����ֵΪ��"+args[i]);
		 }
		 }
	}
}
