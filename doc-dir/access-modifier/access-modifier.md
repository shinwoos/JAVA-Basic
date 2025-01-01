# 접근제한자

- 클래스는 필드와 메소드를 가지고있다. 관련된 것만 잘 가지고 있는 것을 캡슐화라고 한다.

---

AccessObj.class

```java
public class AccessObj {
    public int p = 3; // 모든 접근을 허용
    protected int p2 = 4; // 패키지가 같은 경우 접근 허용 다른 패키지라도 상속을 받으면 접근 허용
    int k = 2; // 패키지가 같은 경우만 접근 허용
    private int i = 1; // 자기 자신만 접근 가능
}

```

<br>
<br>
<br>

AccessObjExam.class

```java
import selfs.AccessObj;

public class AccessObjExam extends AccessObj{
    public static void main(String[] args) {
        AccessObjExam obj = new AccessObjExam();
        System.out.println(obj.p);
        System.out.println(obj.p2);
//        System.out.println(obj.k);
//        System.out.println(obj.i);
    }
}

```
