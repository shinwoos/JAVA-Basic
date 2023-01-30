# 클래스와 객체2(1)

<br>


this가 가르키는 주소에 대한 내용

---

```java

class Birthday{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year; //this 를 붙이지 않으면 setYear의 지역 변수인 year에
                          //값이 들어가게 됨. this를 붙이면 Birthday class의
        //멤버변수인 int year에 값이 저장됨
    }

    public void printThis(){
        System.out.println(this);
    }
}

public class thisExample {

    public static void main(String[] args) {

        Birthday day1 = new Birthday();
        Birthday day2 = new Birthday();

        day1.printThis();
        day2.printThis();

       /* 같은 코드를 가지고 있지만 매번 가르치는 그때의 인스턴스의 주소값이다.
        ==== console ====
        test.Birthday@1540e19d
        test.Birthday@677327b6*/



    }
}



```

---

<br>

**생성자 오버로드와 생성자에서 생성자를 호출할 때**

---

```java
package test;

class Person{
    String name;
    int age;
    int a;

    public Person(){
        this("이름없음", 1); //호출할 때 데이터 타입이 맞으면 맞는 생성자 호출
        // 생성자가 여러개여도 매개변수와 타입이 맞으면 알아서 매핑됨.
        // 생성자에서 다른 생성자를 호출할땐 this 가 가장 앞에 있어야하는 statement이다.
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age; //생성자 오버로딩
    }
}

public class CallAnotherConst {

    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.name);
    }
}


```
