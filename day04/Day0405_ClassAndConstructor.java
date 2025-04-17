/**
 * Day0405_ClassAndConstructor 신규 자바 파일 생성
 *  - 생성자 정의시 -> 오버로드(Overload) 개념을 적용할 수 있음
*/

public class Day0405_ClassAndConstructor {
    /*
     * 멤버 변수 선언하기..
     *  - 자동차 이름, 자동차 연식
    */
    String carName;
    int carYear;

    int a;
    int b;
    int tot;

    /*
     * 생성자 정의하기
     *  - 자동차 이름과, 연식을 매개변수로 전달 받아서
     *  - 멤버 변수(자동차 이름과 연식)에 저장하기
     *  - **(중요) 매개변수 또는 프로그램 처리된 생성자가 작성된 경우에는
     *             디폴트 생성자에 대한 처리는 사용할 수 없음
     *             만약, 사용하고자 한다면, 정의해야 함
    */
    public Day0405_ClassAndConstructor(){}
    public Day0405_ClassAndConstructor(String carName, int carYear) {
        // 멤버 메소드 내에서는 멤버 변수에 접근할 때는 -> this를 사용
        // - 파이썬에서 사용한 self와 같음
        this.carName = carName;
        this.carYear = carYear;
    }

    public Day0405_ClassAndConstructor(int a, int b){
        this.a = a;
        this.b = b;
        this.tot = a * b;
    }


    public static void main(String[] args) {
        System.out.println("<Day0405_ClassAndConstructor> Class : 클래스 생성자를 이용해서 멤버 변수에 값 정의");

        // 클래스 생성 후 자동차 이름과 년식 출력
        // - 매개변수 또는 프로그램 처리된 생성자가 작성된 경우
        //    -> 디폴트 생성자에 대한 처리는 사용할 수 없음
        Day0405_ClassAndConstructor dc1 = new Day0405_ClassAndConstructor();
        System.out.println("%s는 %d년식 입니다.".formatted(dc1.carName, dc1.carYear));
        
        Day0405_ClassAndConstructor dc2 = new Day0405_ClassAndConstructor("K7", 2016);
        System.out.println("%s는 %d년식 입니다.".formatted(dc2.carName, dc2.carYear));


        /*
         * 클래스 내에서 처리
         *  - 멤버 변수 1개 추가 : 변수명 자유롭게
         *  - 정수 타입의 멤버 변수 2개를 전달 받기
         *  - 2개의 매개변수를 곱한 값을 멤버 변수에 저장
         * main 메소드에서 처리
         *  - 곱한 값을 출력 
        */
        Day0405_ClassAndConstructor dc3 = new Day0405_ClassAndConstructor(50, 40);
        System.out.println("a x b = %d".formatted(dc3.tot));
        System.out.println("%d x %d = %d".formatted(dc3.a, dc3.b, dc3.tot));
    }

    /**
     * Day0406_MethodDefine 신규 자바 파일 생성
    */
}
