package day0601;

public abstract class Shape {
    // 일반 멤버 변수
    String color;

    // 추상 메소드 선언(정의는 하지 않음, 실체 없음)
    abstract double getArea();

    // 일반 멤버 메소드 선언 및 정의하기
    //  - 자식들에게 공통으로 사용하게 하기위한 메소드로 사용
    public void printColor(){
        System.out.println("도형 색상 : %s".formatted(this.color));
    }
}
