# 생성자

- 메인 함수에서 Snack 인스턴스를 생성할 때 new Snack()은 인스턴스를 생성 동시에 생성자를 호출한다.

- Snack 클래스의 생성자 Snack()은 리턴타입이 없고 클래스명과 동일해야만 한다.

- setData에서 name은 지역변수를 this.name은 인스턴스 변수다.

- setData에서 변수명이 동일하다면 지역변수의 우선순위가 높다.

<br>

```java

public class Constructor {
public static void main(String[] args) {

        // 객체가 올바르게 작동하는 규칙
        Snack snack = new Snack();
        snack.setData("킨더조이","달콤한 맛");

    }

}

class Snack {
String name;
String flavor;

    // 생성자 -> 리턴타입 X, 클래스 명과 동일해야함.
    public Snack(){
        System.out.println("생성자 실행");
    }
    public void setData(String name, String flavor){
        // 지역변수, 인스턴스 변수 이름이 같다면 지역변수가 우선순위
        this.name = name;
        this.flavor = flavor;
    }
    // 함수가 지역변수/인스턴스변수 를 사용해서 기능 수행
    // 변수가 올바라야 함수가 잘 작동
    public void  showInfo(){
        System.out.println("이름:"+ name+" 맛:"+flavor);
    }

}

```
