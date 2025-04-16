/**
 * Day0304_IfElse 신규 자바 파일 생성
 * - 조건문 (if문)
 *  if(조건1) {
 *  } else if (조건2) {
 *  } else if (조건3) {
 *  } else {
 *  }
*/
public class Day0304_IfElse {
    public static void main(String[] args) {
        System.out.println("<Day0304_IfElse> Class : 조건문 실습");

        /* - score 변수 생성하기 : 임의 값으로 정의
         * - score의 값이 90 이상이면 : A학점 입니다.
         *                80 이상이면 : B학점 입니다.
         *                   나머지면 : F학점 입니다.
        */
        int score = 91;
        char grade;
        if (score >= 90) {
            grade = 'A';
        }else if (score >= 80) {
            grade = 'B';
        }else{
            grade = 'F';
        }

        System.out.println(grade + "학점 입니다.");
        System.out.println("입력하신 점수(%d)이고, %s학점 입니다.".formatted(score, grade));


        System.out.println("\n ----------------------------------- \n");

        /**
         * 임의 변수에 정수값을 정의한 후
         *  - 짝수면 짝수입니다, 홀수면 홀수입니다, 출력
         */
        int num = 67;

        if(num%2 == 0) System.out.println("짝수 입니다.");
        else System.out.println("홀수 입니다.");

        // 3항 연산자로 짝수/홀수 처리하기
        // - (조건) ? 참인결과값 : 거짓인결과값
        String result = (num%2 == 0) ? "짝수" : "홀수";
        System.out.println(result + " 입니다.");
    }

    /**
     * Day0305_Switch 신규 자바 파일 생성
    */
}
