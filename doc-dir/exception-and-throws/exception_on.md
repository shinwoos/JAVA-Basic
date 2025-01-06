# Exception 발생시키기

- divide 메소드에서 y가 0일 때 에러를 제어하려고 throw new IllegalArgumentException로 exception을 발생 시키고 throws로 메소드가 실행되는 곳으로 예외를 넘겨 처리한다.

```java
public class ExceptionExam3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try{
            int k = divide(x,y);
            System.out.println(k);
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }

    public static int divide(int x, int y) throws IllegalArgumentException{
        if(y == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = x / y;
        return k;
    }
}

```
