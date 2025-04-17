/**
 * Day0303_Operators 신규 자바 파일 생성
 *  - 연산자 실습
*/
public class Day0303_Operators {
    public static void main(String[] args) {
        System.err.println("<Day0303_Operators> Class");

        /* 연산자 종류
         *  - 산술 연산자, 비교(조건) 연산자, 논리 연산자, 3항 연산자(자바에서는 잘 사용x)
         *  - 산술 연산자 : + - * / % ++ --
         *  - 비교 연산자 : > < >= <= == !=
         *      -> 문자열 중 일반변수 타입에 대해서는 equals()함수 사용해야 함
         *  - 논리 연산자 : && || !(not 연산자, 반대개념, 참이면 거짓, 거짓이면 참)
        */


        /* 산술 연산자 */
        // 정수형 변수 a와 b선언, 값은 10과 3으로 설정
        int a = 10;
        int b = 3;
        int c = 10, d = 3;

        System.out.println("a % 2 = " + a % 2);
        // System.out.println("a // 2 = " + a // 2); << 실행 안됨


        /* 비교 연산자 */
        System.out.println("a > b : " + (a > b)); 

        /* 논리 연산자 */
        System.err.println("a > b && d > c : " + ((a>b) && (d>c)));
        System.err.println("a > b || d > c : " + ((a>b) || (d>c)));

        /* 문자열 비교 */
        String name = "홍길동";
        String name2 = "홍길동";
        System.out.println("name == name2 : " + (name == name2));

        name2 = name;
        System.out.println("name == name2 은" + (name == name2));


        String name3 = new String("홍길동"); // 주소값
        System.out.println("name == name3 은" +  (name == name3));


        String name4 = new String("홍길동");
        System.out.println("name3 == name4 은" + (name3 == name4));
    }

    /**
     * Day0304_IfElse 신규 자바 파일 생성
    */
}
