import java.util.Scanner;

public class Calc_12 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� >> ");
		
		float a = scanner.nextFloat();
		String token = scanner.next();
		float b = scanner.nextFloat();
		
		//��ū ������ ���� int
		int Ttype = 0;
		
		//��ū ��ȯ
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
			System.out.print(a + token + b + "�� ��� �����");
			System.out.println(a+b);
		}
		else if(Ttype == 2) {
			System.out.print(a + token + b + "�� ��� �����");
			System.out.println(a-b);
		}
		else if(Ttype == 3) {
			System.out.print(a + token + b + "�� ��� �����");
			System.out.println(a*b);
		}
		else if(Ttype == 4) {
			if(b == 0) {
				System.out.println("0���� ���� �� �����ϴ�!");
			}
			else {
				System.out.print(a + token + b + "�� ��� �����");
				System.out.println(a/b);
			}
		}

		//2
		switch(Ttype) {
		case 1:
			System.out.print(a + token + b + "�� ��� �����");
			System.out.println(a+b);
			break;
		case 2:
			System.out.print(a + token + b + "�� ��� �����");
			System.out.println(a-b);
			break;
		case 3:
			System.out.print(a + token + b + "�� ��� �����");
			System.out.println(a*b);
			break;
		case 4:
			if(b == 0) {
				System.out.print("0���� ���� �� �����ϴ�!");
			}
			else {
				System.out.print(a + token + b + "�� ��� �����");
				System.out.println(a/b);
			}
			break;
		}
		
		//�Ҽ����� 0�� �� ������ ����ϴ� ���?
		
		
		
		scanner.close();

	}

}
