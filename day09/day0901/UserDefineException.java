package day09.day0901;

// 사용자 정의 예외 클래스
public class UserDefineException extends Exception {
    public UserDefineException(String msg) {
        super(msg);
    }
}

// 점수 예외 검사 클래스
class StudentScore {
    public void validateScore(int score) throws UserDefineException {
        if (score < 0) {
            throw new UserDefineException("성적 점수는 음수가 될 수 없습니다.");
        }
    }
}
