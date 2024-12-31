# 생성자2

- Animal 클래스에서 생성자를 명시함과 동시에 상속 받은 자식 클래스는 super() 메소드를 통해 부모 클래스의 메소드를 호출하고 Animal 클래스의 생성자 중 하나와 동일한 매개변수의 갯수를 가져야한다.

<br>

```java
public class Constructor2 {
    public static void main(String[] args) {
        new Human();
        // 아래와 같이 출력되게 해주세요.

        // 동물(String name, int age) 실행됨!
        // 이름 : 홍길동
        // 나이 : 27
    }
}

class Animal {

    //메소드 오버로딩 : 같은 이름으로 메소드를 여러개 만드는 것, 매개변수 개수 or 매개변수 타입이 달라야한다.
 Animal(String name) {
        System.out.println("Animal(String name) 실행됨!");
        System.out.println("이름 : " + name);
    }
 Animal(String name, int age) {
        System.out.println("Animal(String name, int age) 실행됨!");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Human extends Animal {
    Human(){
        super("홍길동", 27);
    }
}


```
