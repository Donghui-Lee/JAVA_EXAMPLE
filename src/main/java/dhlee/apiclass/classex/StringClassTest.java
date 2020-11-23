package dhlee.apiclass.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {
	public static void main(String args[]) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");

		Constructor[] cons = c.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}

		System.out.println();

		Method[] methods = c.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}
}
