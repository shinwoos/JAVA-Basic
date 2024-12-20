# 추상 클래스

- abstract를 붙임으로서 부모 클래스를 추상화 시킬 수 있다.
- 추상화 된 부모 클래스를 상속 받은 자식 클래스는 동일한 메소드를 갖고 있어야한다.
- 그럼으로 부모 클래스로 형변환 된 자식 클래스는 자식 클래스의 메소드 사용이 가능하다.

```java

public class Abstract {
    public static void main(String[] args) {
        Snack snack = new Choco();
        snack.flavor();
        // 출력: 달콤 쌉싸름

        Snack snack = new Candy();
        snack.flavor();
        // 출력: 달콤

    }
}

abstract class Snack{
    public abstract void flavor();
}

class Choco extends Snack{
    public void flavor(){
        System.out.println("달콤 쌉싸름");
    }
}

class Candy extends Snack{
    public void flavor(){
        System.out.println("달콤");
    }
}

```
