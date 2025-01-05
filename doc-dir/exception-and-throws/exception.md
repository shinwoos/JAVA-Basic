# Exception

- try: 수행할 코드, 예외 발생 가능성이 있는 블록
- catch: 예외 처리 블록
- finally: 예외 발생 여부에 상관 없이 반드시 실행되는 블록 (생략가능)
- 예외 클래스 Exception은 모든 에러를 처리하는 예외 클래스
- 모든 에러의 상위

```java
public class ExceptionExam {
    public static void main(String[] args) {

        int i = 10;
        int j = 5;
        try{
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다."+e.toString());
        }finally {
            System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행.");
        }
        System.out.println("main end.");

    }
}
```
