package learning.exception;

/*
*/
class A {
	int i = 0;

	public void f() {
		System.out.println("hello");
	}
}

public class Test {
	public static void main(String[] args) {
		try {
			int[] B = { 1, 2, 3, 4, 5 };
			for (int i = 0; i < 10; i++) {
				System.out.println(B[i]);
			}
			// A a=null;
			// a.f();
			// System.out.println("Exception test!");
			// throw new Exception("Exception from exception");

			//hello
			//world!
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			System.out.println("Execute Exception");
		}
	}
}
