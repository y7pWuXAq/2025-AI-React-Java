/***
 * 객체 배열(Array)을 활용한 다형성(Employee) 예시
*/

public class Day0604_Employee_ObjectArray {
    public static void main(String[] args) {
        System.out.println("Day0604_Employee_ObjectArray : 객체 배열(Array)을 활용한 다형성(Employee)");
        System.out.println("------------------------------");

        /***
         * 다형성 객체 배열 선언 및 정의하기
         *  - [부모 클래스] 타입으로 배열 객체 선언 및 자식 2개 클래스를 배열에 넣으면서 생성하기
         *    부모 = {자식1생성, 자식2생성} 이 방식으로 코드 작성(배열에 여러개 넣기)
         *  
         *  - 부모 배열에 있는 자식들의 객체를 반복문을 이용하여 추출 후 
         *    -> pay(값 전달) 메소드 호출
         * 
         *  - 실행 후 자식들이 출력한 pay() 결과값 확인하기
        */

        // 다형성 객체 배열 선언 및 정의
        Payment[] employees = {
            new CreditCard(), 
            new PayPal()
        };

        // 반복문을 이용한 pay() 호출
        int[] amounts = {100000, 200000};
        for (int i = 0; i < employees.length; i++) {
            employees[i].pay(amounts[i]);
        }
    }
}

/***
 * [공통]으로 사용할 클래스 정의하기
 *  - 클래스명 : PublicClass
 *  - 메소드 2개 정의
 *  - 메소드 첫번째명 : printView (리턴없음, 매개변수 double tot 사용)
 *    -> 처리 기능 : "[PublicClass] 신용카드로 tot원 결재됨" 출력
 * 
 *  - 메소드 두번째명 : printView (리턴없음, 매개변수 int tot 사용)
 *    -> 처리 기능 : "[PublicClass] 신용카드로 tot원 결재됨" 출력
*/
class PublicClass {
    public void printView(double tot) {
        System.out.println("[PublicClass] 신용카드로 " + (int)tot + "원 결재됨");
    }

    public void printView(int tot) {
        System.out.println("[PublicClass] 신용카드로 " + tot + "원 결재됨");
    }
}

/***
 * [부모 인터페이스(interface) 클래스 정의하기]
 *  - 결제 인터페이스 메소드 정의
 *  - 클래스명 : Payment
 *  - 메소드명 : pay (리턴 없음, 매개변수 정수타입의 amount 사용)
*/
// [인터페이스 클래스 정의]
interface Payment {
    void pay(int amount);
}

/***
 * [자식클래스1] 신용카드 결재 클래스
 *  - 클래스명 : CreditCard
 *  - [공통] 클래스는 상속(extends) 받기
 *  - [부모] 클래스는 implements 하기
 *  - [부모] 클래스의 pay 메소드 재정의 하기
 *    -> 처리 기능 : 결재값 계산 = 전달 받은 매개변수(amount)에 0.95 곱하기
 *                 : 결재값을 [공통] 클래스의 printView 메소드에 전달하여 출력하기
 *                 : 부모클래스의 메소드 호출시에는 super. 으로 접근
*/
// [자식클래스1] CreditCard
class CreditCard extends PublicClass implements Payment {
    @Override
    public void pay(int amount) {
        double result = amount * 0.95;
        super.printView(result);  // 부모 클래스 메소드 호출
    }
}

/***
 * [자식클래스2] 페이팔 결재 클래스
 *  - 클래스명 : PayPal
 *  - [공통] 클래스는 상속(extends) 받기
 *  - [부모] 클래스는 implements 하기
 *  - [부모] 클래스의 pay 메소드 재정의 하기
 *    -> 처리 기능 : 결재값 계산 = 전달 받은 매개변수(amount)에 0.9 곱하기
 *                 : 결재값을 [공통] 클래스의 printView 메소드에 전달하여 출력하기
 *                 : 부모클래스의 메소드 호출시에는 super. 으로 접근
*/
// [자식클래스2] PayPal
class PayPal extends PublicClass implements Payment {
    @Override
    public void pay(int amount) {
        double result = amount * 0.9;
        super.printView(result);  // 부모 클래스 메소드 호출
    }
}