
public class HelloService{
	
       public static String sayHello(String firstName){
             return new String(" Hello "+firstName+"!");
       }
       public static void main(String[] args) {
		String firstName="�˽�";
		System.out.println(sayHello(firstName));
	}
}
