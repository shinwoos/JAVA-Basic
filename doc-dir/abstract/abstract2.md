# 추상 클래스2

- 메소드가 하나라도 추상메소드인 경우 해당 클래스는 추상 클래스다.
- 추상클래스는 일반 메소드도 선언 가능하다.

Bird.class

```java
public abstract class Bird {
    public abstract void sing();
    public void fly(){
        System.out.println("flying");
    }
}
```

<br>

Hawk.class

```java
public class Hawk extends Bird{

    @Override
    public void sing(){
        System.out.println("끼이익");
    }
}
```

HawkExam.class

```java
public class HawkExam {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        hawk.sing();
        hawk.fly();

    }
}
```
