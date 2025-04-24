import book.Book;
import book.BookManager;
import java.util.ArrayList;
import java.util.Scanner;

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserChoiceMenu validator = new UserChoiceMenu();
        BookManager bookManager = new BookManager(); // BookManager 객체 생성
        ArrayList<Book> bookList = bookManager.getBookList(); // 책 목록 가져오기

        while (true) {
            System.out.println("- ** - ** - 도서 대출 관리 시스템 - ** - ** -");
            System.out.println("1. 사용자");
            System.out.println("2. 관리자");
            System.out.println("3. 프로그램 종료");
            System.out.println();
            System.out.print("메뉴를 선택하세요 : ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                validator.choiceMenu(choice);

                switch (choice) {
                    case 1 -> {
                        System.out.println("[사용자 메뉴로 이동합니다.]");
                        runUserMenu(scanner, bookList);
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("[관리자 메뉴로 이동합니다.]");
                        runAdminMenu(scanner, bookManager);
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;
                    }
                    default -> throw new UserDefineException("유효하지 않은 메뉴 선택입니다.");
                }

            } catch (UserDefineException e) {
                System.out.println("[경고] " + e.getMessage());
            } catch (Exception e) {
                System.out.println("[오류] 잘못된 입력입니다. 입력을 확인하세요.");
                System.out.println();
            }

            System.out.println();
        }
    }

    // 사용자 메뉴
    public static void runUserMenu(Scanner scanner, ArrayList<Book> bookList) {
        while (true) {
            System.out.println("\n- ** - ** - 사용자 메뉴 - ** - ** -");
            System.out.println("1. 도서 목록 보기");
            System.out.println("2. 도서 대출");
            System.out.println("3. 도서 반납");
            System.out.println("4. 도서 검색");
            System.out.println("5. 이전 메뉴로");
            System.out.println();
            System.out.print("선택 : ");

            try {
                int input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1 -> {
                        for (Book book : bookList) {
                            book.printInfo();
                            System.out.println("- ** - ** - - ** - ** -");
                        }
                    }
                    case 2 -> {
                        System.out.print("대출할 도서 제목 입력 : ");
                        String borrowTitle = scanner.nextLine();
                        for (Book book : bookList) {
                            if (book.matchesTitle(borrowTitle)) {
                                book.borrowBook();
                                break;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("반납할 도서 제목 입력 : ");
                        String returnTitle = scanner.nextLine();
                        for (Book book : bookList) {
                            if (book.matchesTitle(returnTitle)) {
                                book.returnBook();
                                break;
                            }
                        }
                    }
                    case 4 -> {
                        System.out.print("검색할 제목 입력 : ");
                        String keyword = scanner.nextLine();
                        for (Book book : bookList) {
                            if (book.matchesTitle(keyword)) {
                                book.printInfo();
                                System.out.println("-------------------");
                            }
                        }
                    }
                    case 5 -> {
                        return;
                    }
                    default -> {
                        System.out.println("잘못된 입력입니다.");
                    }
                }

            } catch (Exception e) {
                System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
            }
        }
    }

    // 관리자 메뉴
    public static void runAdminMenu(Scanner scanner, BookManager bookManager) {
        while (true) {
            System.out.println("\n- ** - ** - 관리자 메뉴 - ** - ** -");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 이전 메뉴로");
            System.out.println();
            System.out.print("선택: ");

            try {
                int input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1 -> bookManager.addBook();
                    case 2 -> bookManager.viewAllBooks();
                    case 3 -> bookManager.updateBook();
                    case 4 -> bookManager.deleteBook();
                    case 5 -> {
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다.");
                }

            } catch (Exception e) {
                System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
            }
        }
    }
}

// 사용자 정의 예외 클래스
class UserDefineException extends Exception {
    public UserDefineException(String msg) {
        super(msg);
    }
}

// 사용자 메뉴 선택 검증 클래스
class UserChoiceMenu {
    public void choiceMenu(int idx) throws UserDefineException {
        if (idx < 1 || idx > 3) {
            throw new UserDefineException("유효하지 않은 선택지 입니다. 메뉴 번호를 확인해주세요.\n");
        } else {
            System.out.println("\n선택이 완료 되었습니다.\n");
        }
    }
}
