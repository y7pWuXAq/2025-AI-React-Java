package day09.day0901;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentsManager {
    private static final int MAX_STUDENTS = 5;
    private ArrayList<Student> studentsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private StudentScore validator = new StudentScore();

    public void inputStudents() {
        int count = 0;

        while (true) {
            try {
                System.out.print("몇 명의 학생을 등록하시겠습니까? (최대 " + MAX_STUDENTS + "명): ");
                count = scanner.nextInt();
                scanner.nextLine();

                if (count < 1 || count > MAX_STUDENTS) {
                    System.out.println("1명 이상 " + MAX_STUDENTS + "명 이하만 입력 가능합니다.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해주세요.");
                scanner.nextLine();
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println("\n학생 " + (i + 1) + " 정보 입력");

            int num = 0;
            while (true) {
                try {
                    System.out.print("학번 : ");
                    num = scanner.nextInt();
                    scanner.nextLine();

                    if (isDuplicateNum(num)) {
                        System.out.println("이미 등록된 학번입니다. 다른 학번을 입력해주세요.");
                        continue;
                    }

                    break;
                } catch (InputMismatchException e) {
                    System.out.println("학번은 정수로 입력해주세요.");
                    scanner.nextLine();
                }
            }

            System.out.print("이름 : ");
            String name = scanner.nextLine();

            int score = -1;
            while (true) {
                try {
                    System.out.print("점수 : ");
                    score = scanner.nextInt();
                    scanner.nextLine();

                    validator.validateScore(score);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("점수는 정수로 입력해주세요.");
                    scanner.nextLine();
                } catch (UserDefineException e) {
                    System.out.println(e.getMessage());
                }
            }

            studentsList.add(new Student(num, name, score));
        }
    }

    private boolean isDuplicateNum(int num) {
        for (Student student : studentsList) {
            if (student.getNum() == num) {
                return true;
            }
        }
        return false;
    }

    public void printAllStudents() {
        System.out.println("\n[등록된 학생 목록]");
        for (Student student : studentsList) {
            student.printStudent();
            System.out.println();
        }
    }

    public ArrayList<Student> getStudentList() {
        return studentsList;
    }
}
