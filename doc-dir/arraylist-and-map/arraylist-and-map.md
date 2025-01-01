# ArrayList and Map

- 배열의 단점은 배열의 길이의 고정 및 같은 타입의 값만 대입된다.
- 단점을 해결하기 위해 arrayList를 사용하며 선언부 <> 에는 객체(참조) 타입을 받는다.
- arrayList는 Wrapper 클래스로 선언해야 한다. ex) Integer, Character

```java
import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점 -> 배열 길이의 고정, 같은 타입만 받음
        int[] arr = new int[3];

        // 단점 해결 -> ArrayList

        // <> 안에는 무조건 객체(참조) 타입을 받는다.
        ArrayList<Integer> list = new ArrayList<>();

        // Wrapper 클래스
        // int -> Integer
        // char -> Character

        //문제1

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        ArrayList<Person> nameList = new ArrayList<>();

        nameList.add(p1);
        nameList.add(p2);
        nameList.add(p3);
        nameList.add(p4);

        for(int i = 0; i < nameList.size(); i++){
            if(nameList.get(i).age >= 30 && nameList.get(i).age < 40){
                nameList.get(i).intro();
            }
        }
    }
}

class Person{
    String name;
    int age;

    public void intro(){
        System.out.println(name+age);
    }
}


```
