# @Override

- 클래스를 작성할 때 파생 클래스에 특화시키기 위해 부모 클래스의 메소드를 override 하는 경우가 있다.

- create 메소드에 @Override를 명시해주면 자식 클래스와 부모 클래스의 메소드 이름을 동일하게 명시해야 된다. 그렇지 않다면 override 어노테이션이 에러를 발생함.

- 또한 슈퍼클래스의 필드나 메소드 재정의를 위해 만든다.

```java
public class Barrack {

    public void create(){
        System.out.println("create soldier");
    }
}
```

<br>

Hawk.class

```java
public class Army extends Barrack{

    @Override
    public void create(){
        super.create();
        System.out.println("army");
    }
}
```
