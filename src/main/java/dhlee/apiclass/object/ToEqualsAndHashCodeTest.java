package dhlee.apiclass.object;

import java.awt.*;

public class ToEqualsAndHashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		// 메모리 주소 비교(물리적 비교) : false
		System.out.println(str1 == str2);

		// 문자열 비교(논리적 비교) : true
		System.out.println(str1.equals(str2));

		Student lee = new Student(100, "lee");
		Student lee2 = lee;
		Student hee = new Student(100, "hee");

		System.out.println(lee == lee2);      // 메모리 주소 비교 : true
		System.out.println(lee == hee);       // false 물리적 비교(메모리 주소)
		System.out.println(lee.equals(hee));  // false 논리적 비교

		// Override 정의 후
		System.out.println(lee == hee);       // false 물리적 비교(메모리 주소)
		System.out.println(lee.equals(hee));  // true  논리적 비교

		System.out.println(lee.hashCode());  // 100
		System.out.println(hee.hashCode());  // 100

		System.out.println(System.identityHashCode(lee));  // 366712642
		System.out.println(System.identityHashCode(hee));  // 1829164700
	}
}

class Student {
	int studentNum;
	String studentName;

	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj; // 다운 캐스팅
			return (this.studentNum == std.studentNum);
		}
		return false;
	}

	// @Override
	// public int hashCode() {
	// 	return this.studentNum;
	// }
}
