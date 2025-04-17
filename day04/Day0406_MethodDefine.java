/**
 * Day0406_MethodDefine 신규 자바 파일 생성
 * 메소드 사용하기
 *  - 오버로드(Overload) 개념을 적용할 수 있음
*/

public class Day0406_MethodDefine {
    /*
     * 메소드 정의
     *  - 클래스 내에 정의한 메소드는 멤버 메소드라고 칭함
     *  - 모든(변수, 메소드) 멤버는 클래스 생성을 통해서만 접근이 가능
     *  - 메소드는 오버로드(Overload) 개념을 적용하여 생성 가능
    */

    /**
     * 두개의 매개변수를 전달받아서 곱한 값을 리턴
     * @param a
     * @param b
     * @return
    */

    // 더하기
    public int plus(int a, int b) {
        return a + b;
    }

    // 빼기
    public int minus(int a, int b) {
        return a - b;
    }

    // 곱하기
    public int multiply(int a, int b) {
        return a * b;
    }

    // 나누기
    public int divide(int a, int b) {
        return a / b;
    }

    // 짝수 or 홀수 판별 메소드
    public String evenOrodd(int number) {
        return (number % 2 == 0) ? "짝수" : "홀수";
    }

    public static void main(String[] args) {
        System.out.println("<Day0406_MethodDefine> Class : 메소드 정의하기");

        // plus 메소드 결과 출력
        Day0406_MethodDefine dm = new Day0406_MethodDefine();
        int result = dm.plus(4, 7);
        System.out.println(result);

        /*
         * 더하기, 빼기, 곱하기, 나누기, 짝수 or 홀수 구별에 대한 결과값을 출력
        */
        int a = 10, b = 5;

        System.out.println("더하기: " + dm.plus(a, b));
        System.out.println("빼기: " + dm.minus(a, b));
        System.out.println("곱하기: " + dm.multiply(a, b));
        System.out.println("나누기: " + dm.divide(a, b));

        // 짝수/홀수 테스트
        int num1 = 7, num2 = 12;
        System.out.println(num1 + "는 " + dm.evenOrodd(num1));
        System.out.println(num2 + "는 " + dm.evenOrodd(num2));
    }

    /**
     * Day0407_MethodOverlaod 신규 자바 파일 생성
    */
}
