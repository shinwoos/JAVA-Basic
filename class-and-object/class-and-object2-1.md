
this가 가르키는 주소에 대한 내용

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
