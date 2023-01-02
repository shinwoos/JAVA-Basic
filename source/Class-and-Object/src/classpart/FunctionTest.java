package classpart;

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

