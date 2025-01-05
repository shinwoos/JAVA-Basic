# Interface

- 인터페이스는 다른 클래스를 작성할 때 기본이 되는 틀을 제공한다.
- 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스다.
- abstract인 추상클래스는 내부에서 메소드를 정의하여 기능을 작성할 수 있지만 인터페이스는 불가능하다.
- 그렇기에 구현체에서 전부 메소드를 정의하여 기능을 작성해야 한다.
- 인터페이스는 구현체 클래스가 하나 이상 있을 때, 구현체 클래스가 똑같은 메소드를 갖고 있지만 기능은 서로 다를 때 인터페이스를 활용한다.
- 인터페이스의 변수는 전부 상수이다.

TV.interface

```java
public interface TV {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void chnageChannel(int channel);
}
```

```java
public class LedTV implements TV{
    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨조절");
    }

    @Override
    public void chnageChannel(int channel) {
        System.out.println("채널변경");
    }
}
```

```java
public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();

        tv.turnOn();
        tv.chnageChannel(7);
        tv.changeVolume(12);
        tv.turnOff();
    }
}

```
