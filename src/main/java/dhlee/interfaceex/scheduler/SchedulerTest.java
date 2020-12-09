package dhlee.interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {
    /**
     *
     * 고객 센터에는 전화 상담을 하는 직원들이 존재
     * 고객 센터로 전화가 오면 대기열에 저장
     * 상담원이 지정되기 전까지 대기 상태
     * 각 전화가 상담원에게 배분되는 정책은 여러 방식으로 구현될 수 있음
     *    상담원 순서대로 배분
     *    대기가 짧은 상담원 먼저 배분
     *    우선순위가 높은(숙련도가 높은) 상담원에게 먼저 배분
     */
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담원 할당 방식을 선택하세요.");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 우선순위가 높은 고객우선 순력도 높은 상담원");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if(ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
