package dhlee.apiclass.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException,
		IllegalAccessException,
		InstantiationException, NoSuchMethodException, InvocationTargetException {
		Person person = new Person("dhlee");
		System.out.println(person);  // dhlee

		Class c1 = Class.forName("dhlee.apiclass.classex.Person");
		// newInstance Person의 default Constructor 생성
		Person person1 = (Person) c1.newInstance();
		System.out.println(person1);  // null

		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);

		Object[] initargs = {"dhlee"};
		Person dhlee = (Person)cons.newInstance(initargs);
		System.out.println(dhlee);   // dhlee
	}
}
