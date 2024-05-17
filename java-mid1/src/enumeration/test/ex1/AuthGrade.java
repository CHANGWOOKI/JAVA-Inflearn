package enumeration.test.ex1;

import java.util.Scanner;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    Scanner scanner = new Scanner(System.in);

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
