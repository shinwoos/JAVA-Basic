# 클래스와 객체(2)

<br>

## method

---

함수의 일종, 객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수

<br>
<br>

아래 코드는 method를 만드는 코드이다.

```java

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {

		return studentName;

	}

	public void setStudentName(String name) {
		studentName = name;

	}

}


```

getStudentName() method는 외부 class 파일에서 가져 간다는 의미로 get을 붙여주고,
<br>  
 setStudentName() method는 외부 클래스파일에서 이름을 변경한다는 의미로 set을 붙여줍니다.

<br>
<br>
<br>

## function

---

하나의 기능을 수행하는 일련의 코드, 중복되는 기능은 함수로
구현하여 함수를 호출하여 사용함.

<br>

아래의 코드는 addNum 함수를 생성해서 더하기 연산을 반환하여
main 함수에 있는 sum 변수에 반환하는 코드다.

```java
public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 30;

		int sum = addNum(num1, num2);

		System.out.println(sum);


	}

	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}

//main() -> addNum() main 함수가 addNum 함수를 호출

```
