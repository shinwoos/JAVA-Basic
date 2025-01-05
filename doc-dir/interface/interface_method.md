# Interface Method

- java8로 업그레이드 되면서 default method와 static method를 정의할 수 있습니다.
- default method를 override 할 수 있습니다.
- 그렇다면 인터페이스에 default method가 추가된 이유는?
  - 인터페이스를 상속 받는 클래스는 전부 메소드를 구현해야만 합니다.
  - 그렇기에 default method를 인터페이스에 정의해두면
  - 공통된 메소드를 사용하는 클래스를 defulat method로 선언하여 코드 중복을 방지합니다.
  - static method는 인스턴스를 생성하지 않고 Interface 자체를 불러와서 사용해야 합니다.

Calculator.interface

```java
public interface Calculator {
    public int plus(int x, int y);
    public int mul(int x, int y);
    default int exec(int x, int y){
        return x + y;
    };

    public static int exec2(int x,int y){
        return x * y;
    }
}
```

MyCal.class

```java
public class MyCal implements Calculator{

    @Override
    public int plus(int x, int y) {
        return x + y;
    }
    @Override
    public int mul(int x, int y) {
        return x * y;
    }

}
```

MyCalTest.class

```java
public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3,4);
        cal.mul(3,4);
        int i = cal.exec(3,4);
        System.out.println(i);
        Calculator.exec2(3,4); // static method
    }
}
```
