# 클래스와 객체

<br>

## class

---

- 필요한 경우에 다른 클래스에서 사용 가능하다.
- 웹 서버로 예를 들면 서블릿 등 리퀘스트가 들어오면 필요한 클래스 쪽으로 리퀘스트에 대한 처리를 한다.

<br>

_package: 소스의 묶음이다._

<br>

```java
package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfor() { // 학생이름과 주소를 받고 그 사이에 "," 를 찍어주는 메소드.
		System.out.println(studentName + " , " + address);
	}

}
```

```java
package classpart;

public class StudentTest {

	public static void main(String[] args) { // 클래스 사용을 위한 메인 선언.
		Student studentLee = new Student(); // Student 클래스 호출.
		studentLee.studentName = "김김김";
		studentLee.address = "어쩌시 어쩌구 어쩌동";

		studentLee.showStudentInfor(); // Student 클래스에 선언한 메소드 실행.
	}
}

```
