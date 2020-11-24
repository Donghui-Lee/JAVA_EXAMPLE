package dhlee.apiclass.string;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); // false, 힙 메모리, 메모리 위치가 다르기 때문

		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // true, 상수 풀에서 가져오기 때문에 주소가 같음
	}
}
