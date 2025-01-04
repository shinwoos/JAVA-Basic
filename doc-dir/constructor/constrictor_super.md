# super와 부모 생성자

### 부모 생성자

snack.class

```java
public class Snack{
    public Snack(){
        System.out.println("스낵의 기본 생성자.");
    }
}
```

ChocoChip.class

```java
public class ChocoChip extends snack{
    public ShocoChip(){
        System.out.println("초코칩의 기본 생성지.");
    }
}
```

<br>

main.class

- new 를 이용해서 ChocoChip이 인스턴스화 될때 부모인 Snack객체도 메모리에 올라간다.
- 그래서 부모인 Snack 기본 생성자의 출력과 ChocoChip 기본 생성자의 출력이 같이 일어나며
- Snack이 먼저 메모리에 올라가고 그다음 ChocoChip이 올라감

```java
    public static void main(String[] args) {
        ChocoChip chocoChip = new ChocoChip();
    }
```

---

### super

snack.class

```java
public class Snack{
    public void eat(){
        System.out.println("스낵을 먹다.");
    }
}
```

```java
public class ChocoChip{
    public void eat(){
        super.eat();
        System.out.println("초코칩을 먹다.");
    }
}
```

- ChocoChip 클래스의 메소드인 eat을 실행 시키면
- eat 메소드가 오버라이딩 되면서 메소드가 재정의 되고
- 부모를 가리키는 super 키워드를 정의하여 부모의 eat 메소드도 호출할 수 있음.

```java
    public static void main(String[] args) {
        ChocoChip chocoChip = new ChocoChip();
        chocoChip.eat();
    }
```
