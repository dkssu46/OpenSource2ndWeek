import java.util.Scanner;

public class Calc_12 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >> ");
		
		float a = scanner.nextFloat();
		String token = scanner.next();
		float b = scanner.nextFloat();
		
		//토큰 구분을 위한 int
		int Ttype = 0;
		
		//토큰 변환
		if(token.equals("+")) {
			Ttype = 1;
		}
		else if(token.equals("-")) {
			Ttype = 2;
		}
		else if(token.equals("*")) {
			Ttype = 3;
		}
		else if(token.equals("/")) {
			Ttype = 4;
		}

		
		//1		
		if(Ttype == 1) {
			System.out.print(a + token + b + "의 계산 결과는");
			System.out.println(a+b);
		}
		else if(Ttype == 2) {
			System.out.print(a + token + b + "의 계산 결과는");
			System.out.println(a-b);
		}
		else if(Ttype == 3) {
			System.out.print(a + token + b + "의 계산 결과는");
			System.out.println(a*b);
		}
		else if(Ttype == 4) {
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다!");
			}
			else {
				System.out.print(a + token + b + "의 계산 결과는");
				System.out.println(a/b);
			}
		}

		//2
		switch(Ttype) {
		case 1:
			System.out.print(a + token + b + "의 계산 결과는");
			System.out.println(a+b);
			break;
		case 2:
			System.out.print(a + token + b + "의 계산 결과는");
			System.out.println(a-b);
			break;
		case 3:
			System.out.print(a + token + b + "의 계산 결과는");
			System.out.println(a*b);
			break;
		case 4:
			if(b == 0) {
				System.out.print("0으로 나눌 수 없습니다!");
			}
			else {
				System.out.print(a + token + b + "의 계산 결과는");
				System.out.println(a/b);
			}
			break;
		}
		
		//소수점이 0일 때 버리고 출력하는 방법?
		
		
		
		scanner.close();

	}

}
