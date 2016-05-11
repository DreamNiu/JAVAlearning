package learning.collection;

import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Orange {
}

public class AppleAndOrange {
	public static void main(String[] args) {
		// ArrayList apples = new ArrayList();
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		// apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			// ((Apple) apples.get(i)).id();
			System.out.println(apples.get(i).id());
		}
		for(Apple c:apples)
			System.out.println(c.id());
	}
}
