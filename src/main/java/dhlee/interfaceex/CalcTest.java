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
    }
}
