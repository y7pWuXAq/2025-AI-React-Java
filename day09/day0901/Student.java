package day09.day0901;

public class Student {
    private int num;
    private String name;
    private int score;

    // 생성자
    public Student(int num, String name, int score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    // 학생 정보 출력
    public void printStudent() {
        System.out.println("-- ** -- * 학생 정보 * -- ** --");
        System.out.println("학번 : " + num);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }

    // getter
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
