/**
 * Day0407_MethodOverlaod 신규 자바 파일 생성
 * 메소드 사용하기
 *  - 오버로드(Overload) 개념을 적용할 수 있음
*/

public class Day0407_MethodOverlaod {
    /*
     * 메소드 오버로드 규칙
     *  - 1. 메소드 이름은 동일
     *  - 2. 매개변수 갯수가 다른경우 사용 가능
     *  - 3. 매개변수 타입이 다른경우 사용 가능
     *  - 4. 2 ~ 3번 중에 하나라도 다른 경우 사용 가능
    */

    // 멤버 메소드 생성하기(오버로드 적용)
    // 덧셈
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 뺄셈
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    // 곱셈
    public int mul(int a, int b) {
        return a * b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    // 나눗셈
    public int div(int a, int b) {
        return a / b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    // 짝수 or 홀수 판별
    public String isEven(int number) {
        return (number % 2 == 0) ? "짝수입니다." : "홀수입니다.";
    }
    
    public static void main(String[] args) {
        System.out.println("<Day0407_MethodOverlaod> Class : 오버로드 실습");

        /*
         * 위 2개 멤버 메소드의 결과 출력
        */
        Day0407_MethodOverlaod dm = new Day0407_MethodOverlaod();
        int mm = dm.add(2, 4);
        System.out.println(mm);

        /*
         * 오버로드 메소드를 이용
         * 더하기, 빼기, 곱하기, 나누기, 짝수 or 홀수 구별에 대한 결과값을 리턴하는 함수 생성 후 출력 
        */

        int result1 = dm.add(2, 4);
        double result2 = dm.add(2.5, 3.7);
        int result3 = dm.sub(10, 3);
        double result4 = dm.sub(5.5, 2.2);
        int result5 = dm.mul(3, 5);
        double result6 = dm.mul(2.2, 4.0);
        int result7 = dm.div(10, 2);
        double result8 = dm.div(9.0, 3.0);
        String evenOdd = dm.isEven(7);

        System.out.println("정수 덧셈: " + result1);
        System.out.println("실수 덧셈: " + result2);
        System.out.println("정수 뺄셈: " + result3);
        System.out.println("실수 뺄셈: " + result4);
        System.out.println("정수 곱셈: " + result5);
        System.out.println("실수 곱셈: " + result6);
        System.out.println("정수 나눗셈: " + result7);
        System.out.println("실수 나눗셈: " + result8);
        System.out.println("7은? " + evenOdd);
    }
}
