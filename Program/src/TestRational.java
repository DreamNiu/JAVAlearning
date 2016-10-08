class Rational{
	public int sign;
	public int numerator;
	public int denominator;
	public Rational(){
		this(1,1);
	}
	public Rational(Rational r){
		sign=r.sign;
		numerator=r.numerator;
		denominator=r.denominator;
	}
	public Rational(int n,int d){
		sign=n*d>0?1:-1;
		n=Math.abs(n);
		d=Math.abs(d);
		int s=gcd(n,d);
		numerator=n/s;
		denominator=d/s;
	}
	static int gcd(int m,int n){
		int r=m%n;
		while(r!=0){
			m=n;
			n=r;
			r=m%n;
		}
		return n;
	}
	public Rational add(Rational r){
		int d=denominator*r.denominator;
		int n=numerator*r.denominator+denominator*r.numerator;
		return new Rational(n,d);
	}
	public Rational minus(Rational r){
		int d=denominator*r.denominator;
		int n=numerator*r.denominator-denominator*r.numerator;
		return new Rational(n,d);
	}
	public Rational multiply(Rational r){
		int s=sign*r.sign;
		int n=numerator*r.numerator;
		int d=denominator*r.denominator;
		return new Rational(s*n,d);
	}
	public Rational divide(Rational r){
		int s=sign*r.sign;
		int n=numerator*r.denominator;
		int d=denominator*r.numerator;
		return new Rational(s*n,d);
	}
	public void print(){
		String str=sign*numerator+"/"+denominator;
		System.out.println(str);
	}
}
class TestRational {
	public static void main(String args[]){
		Rational r1=new Rational();
		r1.print();
		Rational r2=new Rational(1,2);
		r2.print();
		Rational r3=new Rational(-1,4);
		r2.add(r3).print();
	}

}
