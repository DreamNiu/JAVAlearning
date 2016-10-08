import java.util.Random;

class Shape{
	public void draw(){
		System.out.println("draw()");
	}
	public void erase(){
		System.out.println("erase()");
	}
	public void print(){
		System.out.println("I'm a function");
	}
}

class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("1:Circle draw()");
	}
	@Override
	public void erase(){
		System.out.println("1:Circle erase()");
	}
	public void print(){
		System.out.println("1: I'm a function");
	}
}

class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("2:Square draw()");
	}
	public void erase(){
		System.out.println("2:square erase()");
	}
}

class Triangle extends Shape{
	@Override
	public void draw(){
		System.out.println("3:Triangle draw()");
	}
	public void erase(){
		System.out.println("3:Triangle erase£¨£©");
	}
}

class RandomShapeGenerator{
	private Random rand=new Random(47);
	public Shape next(){
		switch(rand.nextInt(3)){
		default:
		case 0: return new Circle();
		case 1: return new Square();
		case 2: return new Triangle();		
		}
	}
}

public class Test{
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++)
			s[i]=gen.next();
		for(Shape shp:s){
			shp.draw();
			//shp.erase();
		}		
	}
}







