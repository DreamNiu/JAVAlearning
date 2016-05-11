package learning.type;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	Toy() {}

	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	public FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name:" + cc.getName() + "is interface?[" + cc.isInterface() + "]");
		System.out.println("Simple name:" + cc.getSimpleName());
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("learning.type.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("FancyToy can't find.");
			System.exit(1);
		}
		System.out.println(c);
		for (Class face : c.getInterfaces()) {
			System.out.println(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			// TODO: handle exception
			System.out.println("can't Instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			System.out.println("can't access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}

}
