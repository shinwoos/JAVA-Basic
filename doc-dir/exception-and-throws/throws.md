# throws

- 메소드에서 발생하는 예외를 메인 함수에서 실행시키는 위치에서 예외를 처리할 수 있음

```java
public class ExceptionExam2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int k = divide(x, y); // 메소드 실행부분 throws 명시로 예외를 받아서
            System.out.println(k); // 여기서 처리가능
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }

    }

    public static int divide(int x, int y) throws ArithmeticException{
        int k = x/y; // 예외 발생 부분 메소드
        return k;
    }
}

```
