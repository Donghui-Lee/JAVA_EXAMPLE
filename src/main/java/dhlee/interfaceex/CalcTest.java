package dhlee.interfaceex;

public class CalcTest {
    public static void main(String[] args) {
        CompleteCalc completeCalc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(completeCalc.add(n1, n2));
        System.out.println(completeCalc.substract(n1, n2));
        System.out.println(completeCalc.times(n1, n2));
        System.out.println(completeCalc.divide(n1, n2));
        completeCalc.showInfo();

        // Default Method 사용
        completeCalc.description();

        // Static Method 사용(인스턴스 변수로 가져다 사용하는 것이 아니라 인터페이스 타입으로 가져다 사용)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
