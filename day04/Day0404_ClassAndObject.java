/**
 * Day0404_ClassAndObject 신규 자바 파일 생성
 *  - 클래스(Class)와 객체(Object) 인스턴스
*/

public class Day0404_ClassAndObject {
    /**
     * <생성자> 
     *  - 클래스 생성시(new) 자동으로 호출됨
     *  - 생성자 작성 규칙
     *    -> 리턴타입은 없음
     *    -> 생성자 이름은 무조건 클래스 이름과 동일해야함
     *    -> 매개변수 및 처리하는 프로그램이 없는 경우 : 생략가능(디폴트 생성자라고 칭함)
     *    -> 매개변수 또는 처리하는 프로그램이 있는 경우에는 생성자를 작성해야함(생략 불가)
     *    -> 생성자는 여러개 작성 가능
     *       단, 생성자는 클래스이름을 사용해야하기 때문에,
     *           여러개를 사용하는 경우에는 -> 매개변수의 갯수가 다르거나,
     *                                      -> 매개변수의 타입이 달라야 함
     *                                      -> 이를 "오버로드(Overload)"라고 칭함
    */
    
    
    public Day0404_ClassAndObject(){};
    // 아래는 오버로드 처리한 생성자
    // public Day0404_ClassAndObject(String msg, int msg2){}
    // public Day0404_ClassAndObject(int msg, int msg2){}
    
    /*
     * 클래스(Class)
     *  - 변수들 또는 함수들을 모아둔 곳
     *  - 단, 특정 성격에 맞는 변수들과 기능을 수행할 함수들만 모아둔 곳
     *  - 클래스의 성격에 맞게 모아놓은 변수들과 함수들
     *    -> 멤버 변수, 멤버 메소드(함수)라고 칭함
     *  - 클래스는 정의해 놓고 향후 필요한 곳에서 생성하여 사용
     * 
     *  - 클래스를 정의한 것은
     *    -> 메모리가 없는 단순 형태만 존재하는 곳
     *    -> 형태만 존재한다는 의미 -> 개체라고 칭함
     * 
     *  - 클래스를 사용할 곳에서 생성 -> 메모리가 만들어짐
     *    -> 이때 메모리의 주소를 저장해두는 곳 즉, 변수를 객체 변수 또는 인스턴스 변수라고 칭함
     *    -> 보통, 클래스 변수라고도 함
    */

    /*
     * 멤버 변수 선언하기 : 보통 멤버 변수는 정의(초기화)하지 않음
    */
    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("<Day0404_ClassAndObject> Class : 클래스와 객체 실습");

        // 클래스 생성시키기
        //  - dc : 인스턴스변수 또는 객체변수 또는 클래스변수 또는 레퍼런스변수
        //       : 주소를 가짐
        Day0404_ClassAndObject dc = new Day0404_ClassAndObject();

        // 멤버 변수에 접근하기
        //  - 접근지정자 : 점(.)을 통해서 객체 메모리 공간에 접근
        dc.name = "정오";
        dc.age  = 20;

        System.out.println("이름[%s], 나이[%d]".formatted(dc.name, dc.age));
    }

    /**
     * Day0405_ClassAndConstructor 신규 자바 파일 생성
    */
}
