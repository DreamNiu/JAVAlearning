package testsss;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	

	 public static void main(String[] args) {  
	        Scanner in = new Scanner(System.in);  
	        while (in.hasNextInt()) {//注意while处理多个case  
	            int a = in.nextInt();  
	            int b = in.nextInt();  
	            System.out.println(a + b);  
	        }  
	    }  
}
