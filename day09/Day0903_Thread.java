package day09;

public class Day0903_Thread {
    /**
     * <스래드(Thread)>
     *  - 하나의 프로세스(java 파일을 의미함) 내에서 
     *    -> 독립적으로 실행되는 소작업 단위를 의미함
     * 
     * <스래드 사용 목적>
     *  - 시간이 오래 걸리는 작업에서...
     *    -> CPU 자원을 효율적으로 사용하여 "병렬로 처리"하고자 할 때 사용
     *  - 사용자에게는 UI를 멈추지 않고 연속적으로 서비스를 유지시켜 주면서,
     *    -> 백그라운드에서는, 처리 시간이 오래 걸리는 작업을 계속해서 수행하기 위해 사용
     *  
     * <적용 예시>
     *  - 대용량 파일 업로드
     *    -> 사용자가 대용량 파일 업로드시, 백그라운드에서는 업로드 처리
     *    -> 사용자는 UI에서 다른 작업(메일 쓰기, 등등)을 계속해서 진행
     * 
     *  - 이메일 전송시
     *    -> 사용자가 메일전송 버튼을 클릭하면,
     *    -> 백그라운드에서는 메일전송 처리가 진행되고
     *    -> 사용자는 UI를 통해 계속해서 다른 작업을 수행
     * 
     * <스래드 구현 방법>
     *  1. Thread 클래스를 상속 받아서 사용하는 방법(가장 간단한 방법, 비추천)
     *    - 실무에서는 사용하지 않음(학습을 위한 방법)
     *    - 단일 상속만 가능하며, 재사용성이 떨어짐
     *    - 스래드를 여러 클래스에 적용하기 위해서는 각각 클래스마다 상속 받아서 
     *      별개로 정의하여 사용해야함 (번거로움)
     *    - 스래드 사용시 해당 Thread 객체를 계속 생성해야함(상속 받기 때문에, 자원낭비)
     * 
     *  2. Runnable 인터페이스를 사용하는 방법(비추천)
     *    - 1번 방법보다 추천되는 방법
     *    - 스레드에 별도로 작업할 클래스를 넣어서 구현됨
     *    - 클래스와 스레드를 분리하여 구현이 가능함
     *    - 1번과 동일하게 스래드를 단일 클래스 단위로 관리해야하는 단점은 있음
     *    - 스레드 사용시 해당 Thread 객체를 계속 생성해야함(자원 낭비)  
     * 
     *  3. ExecutorService 라이브러리를 이용한 구현 방법(추천, 회사에서 많이 사용)
     *    - 1번과 2번의 단점을 보완한 방법
     *    - 스레드 풀(Pool)로 스레드의 갯수를 미리 지정하여 관리함
     *    - 미리 사용 가능한 갯수보다 작게 스레드를 만들어 놓은 후 
     *      -> 필요한 시점에 스레드를 제공해줌
     *      -> 스레드 풀(Pool)에 사용할 스레드가 없는 경우에는
     *         --> 사용중인 스레드 중에 반납되는 스레드를 기다렸다가 다음 스레드를 제공함
     *      -> 사용이 끝난 스레드를 재사용함
     *    - 자원을 효율적으로 관리 할 수 있음
     * 
     *  4. 기타 등등..(매우 많음)
    */

    public static void main(String[] args) {
        System.out.println("Day0903_Thread : 스레드");
        System.out.println("- ** -- ** -- ** -- ** -- ** -- ** -- ** -");

        System.out.println("1. Thread 클래스를 상속 받아서 사용하는 방법");
        // 스레드를 이용할 클래스 생성하기..
        Thread_Example t1 = new Thread_Example();
        Thread_Example2 t2 = new Thread_Example2();

        // start() : 스레드 실행(run 함수 호출됨)
        // - 해당 java 파일 내에서 실행을 하면
        //   -> 총 3개의 스레드 실행
        // - main 스레드 : main 메소드에서 실행되는 프로세스를 의미
        //               : 모든 실행을 위해서 
        t1.start();
        t2.start();

        // 메인 클래스 내에 프로그램 처리로직 추가
        for (int i=1; i<=5; i++) {
            System.out.println("[Main_Thread] 실행 중 : " + i);

            // 예외처리
            try {
                // 0.5초 대기
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                System.out.println("[Main_Thread] 인터럽트 방생");
            }
        }
    }
}


/***
 * Thread를 상속받아서 처리하는 클래스 선언 및 정의
 *  - Thread를 사용한 클래스는 항상 extend Thread를 해야합니다.
*/
class Thread_Example extends Thread{
    /**
     * Thread 클래스의 실행 메소드(run) 재정의(Override) 하기
     *  - run() : 부모(Thread) 메소드를 재정의함
     *          : 스레드의 진입점(시작 메소드임)
    */
    @Override
    public void run(){
        // 스레드(단위 프로세스)로 처리할 프로그램 처리
        for (int i=0; i<=5; i++) {
            System.out.println("[Thread_Example] >>> 실행중 : " + i);

            // 스레드는 예외 처리 필수
            try {
                // 처리할 프로그램은 이곳에
                // 3초 대기 시키기 (1초 = 1000ms)
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                // 스레드는 기본적으로
                //  -> InterruptedException를 발생 시킴
                System.out.println("Thread_Example 인터럽트 발생됨");
            }
        }
    }
}

class Thread_Example2 extends Thread{
    /**
     * Thread 클래스의 실행 메소드(run) 재정의(Override) 하기
     *  - run() : 부모(Thread) 메소드를 재정의함
     *          : 스레드의 진입점(시작 메소드임)
    */
    @Override
    public void run(){
        // 스레드(단위 프로세스)로 처리할 프로그램 처리
        for (int i=0; i<=5; i++) {
            System.out.println("[Thread_Example2] >>> 실행중 : " + i);

            // 처리할 프로그램은 이곳에
            // 스레드는 예외 처리 필수
            try {
                // 단위 프로세스로 처리할 로직
                for (int j=2; j<=9; j++) {
                    for (int k=1; k<=9; k++) {
                        System.out.println("[Thread_Example2 - %d] %d x %d = %d".formatted(i, j, k, j*k));
                    }
                }
                // 3초 대기 시키기 (1초 = 1000ms)
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                // 스레드는 기본적으로
                //  -> InterruptedException를 발생 시킴
                System.out.println("Thread_Example2 인터럽트 발생됨");
            }
        }
    }
}