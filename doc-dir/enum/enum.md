# 열거형(enum)

- static 상수로 string 변수에 값을 대입하면 마지막에 대입 시킨 값으로 초기화 되지만
- enum을 사용하면 enum gender 객체에는 열거된 값 말고는 다른 값으로 초기화 불가능

```java
public class EnumExam {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2; // enum
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        gender2 = "boy";
    }
}

enum Gender { // enum
    MALE, FEMALE;
}

```
