package dhlee.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메서드
    // 시나리오는 변하면 안됨 : 하위 클래스에서 재정의 할 수 없게 하기 위해 final 사용
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
