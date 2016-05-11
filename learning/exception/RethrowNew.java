package learning.exception;

class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoExeption extends Exception {
	public TwoExeption(String s) {
		super(s);
	}
}

public class RethrowNew {
	public static void f() throws OneException {
		System.out.println("Originating the exception in f()");
		throw new OneException("Throw fron f()");
	}

	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("caught in inner try,e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoExeption("From inner try");
			}
		} catch (TwoExeption e) {
			System.out.println("caught in outer try,e.printStackTrace() ");
			e.printStackTrace(System.out);
		}
	}
}
