package learning.exception;

class SimpleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

public class InherrtingException {

	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f();");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		InherrtingException sed=new InherrtingException();
		try{
			sed.f();
		}catch(SimpleException e){
			System.out.println("Catch It!");
		}
	}
}
