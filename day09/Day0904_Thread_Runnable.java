package day09;

import java.io.*;

public class Day0904_Thread_Runnable {

    public static void main(String[] args) {
        System.out.println("Day0904_Thread_Runnable : Runnable 스레드로 처리");
        System.out.println("- ** -- ** -- ** -- ** -- ** -- ** -- ** -");

        String fileName = "./day09/files/day0902_test02.txt";
        System.out.println("저장할 파일의 전체 경로 및 파일명 : " + fileName);

        // 스레드 생성 및 실행
        Thread thread = new Thread(new Thread_FileIO(fileName));
        thread.start();
    }
}

// Runnable 인터페이스를 구현한 클래스
class Thread_FileIO implements Runnable {
    private String fileName;

    public Thread_FileIO(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            // 디렉토리 생성 (존재하지 않을 경우)
            File file = new File(fileName);
            File parentDir = file.getParentFile();
            if (!parentDir.exists()) {
                parentDir.mkdirs();
            }

            // 파일에 내용 쓰기
            FileWriter writer = new FileWriter(file);
            writer.write("스레드를 이용한 파일 쓰기 연습입니다.\n");  
            writer.write("이 파일은 day0902_test02.txt 입니다.\n");
            writer.close();
            System.out.println("파일에 쓰기 완료!");

            // 파일에서 내용 읽기
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("파일 내용 읽기 시작:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("파일 읽기 완료!");

        } catch (IOException e) {
            System.out.println("파일 입출력 오류: " + e.getMessage());
        }
    }
}
