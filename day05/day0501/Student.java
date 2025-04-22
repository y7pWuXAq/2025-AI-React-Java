package day0501;
/***
 * 학생 정보 관리 클래스
*/

public class Student {
    // 멤버 변수 : 접근 못하게 private
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
