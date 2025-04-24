package day09;

import day09.day0901.Student;
import day09.day0901.StudentsManager;
import java.util.ArrayList;

public class Day0901_Exe {
    public static void main(String[] args) {
        System.out.println("Day0901_Exe : 컬렉션 및 사용자정의 예외처리 문제");
        System.out.println("- ** -- ** -- ** -- ** -- ** -- ** -- ** -");

        StudentsManager studentsManager = new StudentsManager();
        studentsManager.inputStudents();

        ArrayList<Student> studentsList = studentsManager.getStudentList();

        // 전체 학생 정보 출력
        studentsManager.printAllStudents();

        // 평균 점수 계산 및 출력
        if (!studentsList.isEmpty()) {
            double totalScore = 0;
            for (Student student : studentsList) {
                totalScore += student.getScore();
            }
            double average = totalScore / studentsList.size();
            System.out.printf("전체 학생의 평균 점수: %.2f점\n", average);
        } else {
            System.out.println("등록된 학생이 없습니다.");
        }
    }
}