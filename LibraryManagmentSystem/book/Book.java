package book;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // 기본적으로 대출 가능
    }

    // 도서 정보 출력
    public void printInfo() {
        System.out.println();
        System.out.println("도서 제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("대출 가능 여부 : " + (isAvailable ? "가능" : "대출 중"));
        System.out.println();
    }

    // 대출 기능
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println();
            System.out.println("도서 [" + title + "] 대출 완료.");
            System.out.println();
            return true;
        } else {
            System.out.println();
            System.out.println("도서 [" + title + "]는 현재 대출 중입니다.");
            System.out.println();
            return false;
        }
    }

    // 반납 기능
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println();
            System.out.println("도서 [" + title + "] 반납 완료.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("도서 [" + title + "]는 이미 반납된 상태입니다.");
            System.out.println();
        }
    }

    // 도서 검색 (제목으로 검색)
    public boolean matchesTitle(String searchTitle) {
        return title.toLowerCase().contains(searchTitle.toLowerCase());
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}