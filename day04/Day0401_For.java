
import java.util.Scanner;

/**
 * Day0401_For 신규 자바 파일 생성
 * - 반복문(for) 실습 
*/

/* 반복문
 *  - 반복문 종류 : for, while, do-while
*/

public class Day0401_For {
    public static void main(String[] args) {
        System.out.println("<Day0401_For> Class : 반복문 실습");

        System.out.println("\n ----------------------------------- \n");

        /* <for> 반복문
         * @ 문법
         *  for(시작 변수 선언 및 값 정의; 끝의 범위 조건; 증가할 값) {
         *      프로그램 처리 코드 
         *  }
         * 
         *  for (int i=0; i<1000; i++) {
         *      System.out.println(i); 
         *  }
         * 
         *  @ 배열 데이터인 경우 For문 사용방법 2가지
         *   - 인덱스 번호를 이용하는 방식
         *   - 값을 이용하는 방식 : 향상된 for문 문법에 따름
         *      for(Strint str : 배열변수) {
         *          배열변수에서 0번째부터 값만 추출하여 str 변수에 담아줌
         *          System.out.println(str); 
         *      }
        */

        /*
        * 1부터 5까지 출력
        *  - for문 1번 반복합니다. ... for문 5번 반복합니다.
        */
        System.out.println("@ 1부터 5까지 출력");
        for(int i = 1; i < 6; i++) {
            System.out.println("for문 %d번 반복합니다.".formatted(i));
        }

        System.out.println("\n ----------------------------------- \n");

        /*
        * 1부터 10까지 총 합을 출력
        *  -  1부터 10까지의 총 합은 55입니다.
        */
        System.out.println("@ 1부터 10까지 총 합을 출력");
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            sum1 += i;
        }
        System.out.println("1부터 10까지의 총합은 %d입니다.".formatted(sum1));

        System.out.println("\n ----------------------------------- \n");

        /*
        * 1부터 10까지 짝수값의 총 합을 출력 (2가지 방법으로)
        *  -  1부터 10까지의 총 합은 ??입니다.
        */
        System.out.println("@ 1부터 10까지 짝수값의 총 합을 출력");
        int sum2 = 0;
        for (int i = 1; i <= 11; i++) {
            if (i % 2 == 0) { 
                sum2 += i;
            }
        }
        System.out.println("1부터 10까지의 총합은 %d입니다.".formatted(sum2));

        int sum3 = 0;
        for (int i = 2; i <= 10; i += 2) {
            sum3 += i;
        }
        System.out.println("1부터 10까지의 총합은 %d입니다.".formatted(sum3));

        /* 사용자로부터(키보드) 입력받는 클래스 사용
         *  - 클래스 생성 : Scanner sc = Scanner(System.in) 클래스 사용
         *  - 사용방법
         *    @ 정수값을 입력 받아오고자 할 때 : sc.nextInt()
         *    @ 문자열을 입력 받아오가자 할 때 : sc.nextLine()
         *      -> 간혹 예외처리가 필요한 경우가 발생할 수 있음
        */

        System.out.println("\n ----------------------------------- \n");

        /* 사용자로부터 입력받은 값 출력 */
        // - Ststem.in : 사용자 PC의 키보드로부터 값을 전달받기 위해 대기상태로 기다림
        //               사용자로부터 입력을 받은 후, 더이상 입력을 받지 않는 경우에는 Scanner를 종료해야 함
        //                  -> sc.close()
        System.out.println("@ 사용자로부터 입력받은 값 출력");
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("정수값을 입력하세요.");
        int rs_int = sc.nextInt();
        System.out.println("사용자로부터 입력받은 값 : %d".formatted(rs_int));

        System.out.println("\n ----------------------------------- \n");

        /*
        * 사용자로부터 임의의 값을 입력 받아서 짝수, 홀수 구분
        *  - 3번 반복해서 입력받고, 출력하고 반복 
        */
        System.out.println("@ 사용자로부터 임의의 값을 입력 받아서 짝수, 홀수 구분");
        for (int i = 1; i < 4; i++) {
            System.out.print("정수값을 입력하세요 : ");
            int rs_int1 = sc.nextInt();
            System.out.println("사용자로부터 입력받은 값 : %d".formatted(rs_int1));
            
            if (rs_int1 % 2 == 0) {
                System.out.println("%d는 짝수입니다.".formatted(rs_int1));
            } else {
                System.out.println("%d는 홀수입니다.".formatted(rs_int1));
            }
        }

        System.out.println("\n ----------------------------------- \n");

        /*
        * 사용자로부터 문자열 입력받기
        */
        System.out.print("@ 사용자로부터 문자열 입력받기 : ");
        sc.nextLine(); 
        String msg = sc.nextLine();
        System.out.println("입력받은 문자열 : %s".formatted(msg));

        // Scanner 종료(리소스 반환) : 마지막에 한번만
        sc.close();
    }

    /**
     * Day0402_For_Exe 신규 자바 파일 생성
    */
}
