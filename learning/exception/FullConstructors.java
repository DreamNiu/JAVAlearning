package learning.exception;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
	}

	public MyException(String str) {
		super(str);
	}
}

public class FullConstructors {
	public static void f() throws MyException {
		System.out.println("Throw MyException from f();");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throw MyException from g();");
		throw new MyException("Originated in g()");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
}
