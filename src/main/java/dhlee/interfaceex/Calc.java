package dhlee.interfaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // Defalt Method
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        //myMethod();
    }

    // Static Method
    static int total(int[] arr) {
        //myStaticMethod();
        int total = 0;

        for(int i : arr) {
            total += i;
        }
        return total;
    }

    // Private Method (일반 Method)
    // Java 9 부터 제공
    //private void myMethod() {
    //    System.out.println("private method");
    //}
    // Private Method (Static Method)
    //private static void myStaticMethod() {
    //    System.out.println("private static method");
    //}

}
