package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> bookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 도서 등록
    public void addBook() {
        System.out.println();
        System.out.print("도서 제목 입력 : ");
        String title = scanner.nextLine();
        System.out.print("저자 입력 : ");
        String author = scanner.nextLine();
        System.out.print("ISBN 입력 : ");
        System.out.println();
        String isbn = scanner.nextLine();

        Book newBook = new Book(title, author, isbn);
        bookList.add(newBook);
        System.out.println("도서가 등록되었습니다.\n");
        System.out.println();
    }

    // 도서 전체 조회
    public void viewAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println();
            System.out.println("등록된 도서가 없습니다.\n");
            return;
        }
        System.out.println();
        System.out.println("=== 도서 목록 ===");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("[ " + (i + 1) + " ] ------------------ ");
            bookList.get(i).printInfo();
            System.out.println();
        }
        System.out.println();
    }

    // 도서 검색 (제목 기준)
    public void searchBookByTitle() {
        System.out.println();
        System.out.print("검색할 도서 제목 입력 : ");
        System.out.println();
        String keyword = scanner.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.matchesTitle(keyword)) {
                book.printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("해당 제목을 포함하는 도서를 찾을 수 없습니다.\n");
        }
    }

    // 도서 수정
    public void updateBook() {
        viewAllBooks();
        System.out.println();
        System.out.print("수정할 도서 번호 선택: ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;

        if (idx >= 0 && idx < bookList.size()) {
            Book book = bookList.get(idx);
            System.out.println();
            System.out.print("새 제목 입력 (현재 : " + book.getTitle() + "): ");
            String newTitle = scanner.nextLine();
            System.out.print("새 저자 입력 : ");
            String newAuthor = scanner.nextLine();
            System.out.print("새 ISBN 입력 : ");
            String newIsbn = scanner.nextLine();

            // 새 객체로 교체 (혹은 Book 클래스에 setter 만들어도 됨)
            bookList.set(idx, new Book(newTitle, newAuthor, newIsbn));
            System.out.println();
            System.out.println("도서 정보가 수정되었습니다.\n");
        } else {
            System.out.println();
            System.out.println("잘못된 번호입니다.\n");
        }
    }

    // 도서 삭제
    public void deleteBook() {
        viewAllBooks();
        System.out.println();
        System.out.print("삭제할 도서 번호 선택: ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;

        if (idx >= 0 && idx < bookList.size()) {
            Book book = bookList.remove(idx);
            System.out.println();
            System.out.println("도서 [" + book.getTitle() + "] 가 삭제되었습니다.\n");
        } else {
            System.out.println();
            System.out.println("잘못된 번호입니다.\n");
        }
    }

    // getter for external access
    public ArrayList<Book> getBookList() {
        return bookList;
    }
}