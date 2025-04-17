/**
 * Day0403_While_DoWhile 신규 자바 파일 생성
 * - 반복문 : while, do-while
*/

public class Day0403_While_DoWhile {
    public static void main(String[] args) {
        System.out.println("<Day0403_While_DoWhile> Class : while, do-while 실습");

        /* while문
         *  - 조건에 따라 반복을 수행, 주로 무한반복에 사용
         *  - 조건에 따른 반복의 횟수를 지정하는 경우에는 for문 권장
         *    (단, 시작과 끝을 정확히 알고 있는 경우에만)
         *  - **최초에 조건을 만족해야 반복이 시작**
         *  - 무한반복인 경우에는 종료하기 위한 조건에 따른 break;를 사용해야 함
         * 
         * @ 사용방법
         *  <조건에 따른 반복 처리>
         *  while(조건) {
         *    프로그램 처리
         *  }
         * 
         *  <조건없이 무한반복 처리>
         *  while(true) {
         *    프로그램 처리
         *    if(종료조건) break;
         *  }
         * 
         * do-while문
         *  - while문과 개념 및 사용 방법은 동일
         *  - 차이점은 최초에 무조건 1회 반복을 수행
         *  - 조건은 마지막에 있음
         *  - do-while문은 무한반복으로는 잘 사용되지 않음
         *  - 최초에 한 번 수행 후 조건처리 해야하는 경우가 있을 때 사용(자주 사용되지는 않음)
         * 
         * @ 사용방법
         *  do {
         *    프로그램 처리
         *  } while(비교 조건);
        */

        System.out.println("\n ----------------------------------- \n");

        /*
         * 1~5까지 순서대로 출력
         *  - while문과 do-while문 각각 처리
        */
        System.out.println("@ 1~5까지 순서대로 출력");
        System.out.println("while문");
        int cnt = 1;
        while (cnt < 6) { 
            System.out.println(cnt);
            cnt++;
        }
        System.out.print("\n");
        System.out.println("do-while문");
        cnt = 1;
        do { 
            System.out.println(cnt);
            cnt++;
        } while (cnt < 6);

        System.out.println("\n ----------------------------------- \n");

        /*
         * 구구단 출력
        */
        System.out.println("@ 구구단 출력");
        int i = 2;
        while(i < 10) {
            System.out.println("-**- %d단 -**-".formatted(i));
            
            int j = 1;
            while(j < 10) {
                System.out.println("%d * %d = %d".formatted(i, j, i*j));
                j++;
            }
            i++;
        }
    }
    
    /**
     * Day0404_ClassAndObject 신규 자바 파일 생성
    */
}
