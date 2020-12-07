package dhlee.apiclass.classex;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));  // 366712642
        buffer.append("android");
        System.out.println(System.identityHashCode(buffer));  // 366712642, 주소가 변경되지 않음

        java = buffer.toString();
    }
}
