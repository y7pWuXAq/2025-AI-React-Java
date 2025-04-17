/**
 * Day0402_For_Exe 신규 자바 파일 생성
*/

public class Day0402_For_Exe {
    public static void main(String[] args) {
        System.out.println("<Day0402_For_Exe> Class : 반복문 예제 실습");

        System.out.println("\n ----------------------------------- \n");
    
        /*
         * @ 구구단을 2~9단까지 출력 
        */
        System.out.println("@ 구구단을 2~9단까지 출력");
        for(int i = 2; i < 10; i++) {
            System.out.println("-**- %d단 -**-".formatted(i));
            for(int j = 1; j < 10; j ++) {
                System.out.println("%d * %d = %d".formatted(i, j, i*j));
            }
        }
        
        System.out.println("\n ----------------------------------- \n");

        /*
         * @ 구구단 수평출력
        */
        System.out.println("@ 구구단을 2~9단까지 출력");
        for(int i = 2; i < 10; i++) {
            System.out.println("-**- %d단 -**-".formatted(i));
            for(int j = 1; j < 10; j ++) {
                System.out.print("%d * %d = %d  ".formatted(i, j, i*j));
            }
            System.out.print("\n");
        }
        
        System.out.println("\n ----------------------------------- \n");

        /*
         * @ 구구단 수평출력 ver2
        */
        System.out.println("@ 구구단을 2~9단까지 출력");
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j ++) {
                System.out.print("%d * %d = %d  ".formatted(j, i, i*j));
            }
            System.out.print("\n");
        }

        /* @ break : 반복을 종료할 때 사용 (for, while, do-while 모두 사용 가능)
         *  - 사용방법 : 반복문 내에서 종료하고 싶은 시점에 break; 작성
         * @ continue : 현재 반복을 건너뛰고 다음 반복을 수행 보통 조건문과 같이 사용 (for, while, do-while 모두 사용 가능)
         *  - 사용방법 : 반복문 내에서 건너뛰고 싶은 시점에 continue; 작성
        */
    }

    /**
     * Day0403_While_DoWhile 신규 자바 파일 생성
    */
}
