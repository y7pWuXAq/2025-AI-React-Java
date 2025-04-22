import day0701.AppConstants;
import day0701.Person;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day0702_Collection_Framework {
    /*
     * 컬렉션 객체
     *  - 여러개의 값(변수, 객체)들을 저장하기 위한 객체
     *  - 컬렉션 객체에는 인터페이스 클래스와 실제 사용되는 클래스로 구분됨
     *  - 인터페이스 클래스 : List, Set, Map
     *  - 실체 클래스 : List -> ArrayList
     *                : Set  -> Hashset
     *                : Map  -> Hashmap
     *  - List : 여러 데이터(변수, 객체)를 순서대로 저장 관리함
     *         : 중복된 값이 허용되며 인덱스 번호로 관리됨(배열과 유사)
     *         : 저장되는 갯수의 제한 없음(배열과 차이첨)
     *  - Set  : List와 동일하게 사용되나 중복된 값은 자체적으로 제거함
     *  - Map  : key와 value를 쌍으로 데이터 관리됨(파이썬의 딕셔너리와 동일)
     *         : key를 통해 value값을 추출
     *         : 순서에 의미를 두지 않음
    */

    public static void main(String[] args) {
        System.out.println("Day0702_Collection_Framework : 컬렉션 프레임워크 List, Set, Map");
        System.out.println("- ** -- ** -- ** -- ** -- ** -- ** -- ** -");

        /* <List 인터페이스 및 ArrayList> 
         *  - 작성방법 : List<제네릭타입> 변수명 = new new ArrayList<>();
         *  - 제네릭타입 : 어떠한 타입도 사용가능한 타입
        */

        List<Object> students = new ArrayList<>();
        students.add("홍길동1");
        students.add(new Person("홍길동2"));
        students.add(new AppConstants());

        System.out.println("학생 수 : " + students.size());

        // Person에 저장된 name값 출력
        
        // 문자열 타입의 List 객체 생성
        //  - 변수명 : s
        //  - 임의 이름 3개 넣기
        //  - 반복문 이용해 값 추출

        List<String> s = new ArrayList<>();
        s.add("자바");
        s.add("C");
        s.add("파이썬");
        
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }

        /*
         * Set 인터페이스 클래스
         *  - 실체 클래스는 HashSet 사용
         *  - List와 동일하게 사용
        */
        Set<String> names = new HashSet<>();

        // 반복문을 이용해 value 값만 추출
        // key를 이용해 추출


        /* <MemberInfo 클래스 생성>
         * 멤버 변수 2개 선언만
         *  - 아이디(id) : 타입은 문자열, 외부에서 접근 못하게 처리
         *  - 패스워드(pw) : 타입은 문자열, 외부에서 접근 못하게 처리
         * 나머지는 자유롭게 클래스 내에서 사용
         * 
         * <main 클래스에서 처리>
         * MemberInfo 클래스 3개 생성
         * 각각 생성한 클래스를 List에 담기(각각 생성할 때마다 담기)
         * 반복문을 이용하여 아이디와 패스워드 출력
         * 출력 양식 : 아이디 : / 패스워드 : 
        */

        // MemberInfo 객체 생성과 동시에 리스트에 추가
        List<MemberInfo> memberList = new ArrayList<>();

        memberList.add(new MemberInfo("user1", "pass1"));
        memberList.add(new MemberInfo("user2", "pass2"));
        memberList.add(new MemberInfo("user3", "pass3"));

        // 반복문으로 아이디와 패스워드 출력
        for (MemberInfo member : memberList) {
            System.out.println("아이디 : " + member.getId() + " / 패스워드 : " + member.getPw());
        }
    }
}

class MemberInfo {
    // 멤버 변수: 외부에서 접근 못 하도록 private 처리
    private String id;
    private String pw;

    // 생성자
    public MemberInfo(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    // Getter 메서드 (외부에서 접근 가능하게)
    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }
}