# 클래스 형변환

<br>

- 클래스 객체 형변환은 가능하다. <br>
- 물론 자식 클래스가 부모클래스를 상속 받고 있는 한에서 가능하다. <br>
- 아래와 같다.

```java
class CastClass{
    public static void main(String[] args){
        Snack snack = new Choco();
    }
}

class Snack{

}

class Choco Extends Snack{
    public void flavor(){
        System.out.println("달콤 쌉싸름");
    }
}
```

<br>

## 2. 클래스 형변환 이후 자식 클래스의 메소드 사용이 가능한가?

- 불가능하다.

```java
class CastClass{
    public static void main(String[] args){
        Snack snack = new Choco();
                snack.flavor(); // 사용 불가능
    }
}

class Snack{

}

class Choco Extends Snack{
    public void flavor(){
        System.out.println("달콤 쌉싸름");
    }
}
```

<br>

## 3. 자식 클래스의 메소드를 호출하는 방법은?

- 오버라이딩을 통해 가능하다.

```java
class CastClass{
    public static void main(String[] args){
        Snack snack = new Choco();
                snack.flavor(); // 오버라이딩
    }
}

class Snack{
    public void flavor(){ // 오버라이딩

    }
}

class Choco Extends Snack{
    public void flavor(){ // 오버라이딩
        System.out.println("달콤 쌉싸름");
    }
}
```

- 또는 부모클래스를 자식클래스로 형변환 하면 가능하다.
- 하지만 snack의 인스턴스를 Choco가 아닌 Snack으로 초기화 시 형변환은 안된다.

```java
class CastClass{
    public static void main(String[] args){
        Snack snack = new Choco();
        Choco choco = (Choco) snack;
                choco.flavor();
    }
}

class Snack{

}

class Choco Extends Snack{
    public void flavor(){
        System.out.println("달콤 쌉싸름");
    }
}
```
