import java.util.Scanner;

public class Middle_4 {
	
	public static void main(String[] args) {
		System.out.println("���� 3�� �Է� >>> ");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		// ���� ���ϰ� Ǯ�� ����
		if(a < b && a > c) {
			System.out.println("�߰� ���� " + a);
		}
		else if (a > b && a < c) {
			System.out.println("�߰� ���� " + a);
		}
		else if (b > a && b < c) {
			System.out.println("�߰� ���� " + b);
		}
		else if (b < a && b > c) {
			System.out.println("�߰� ���� " + b);
		}
		else if (c > a && c < b) {
			System.out.println("�߰� ���� " + c);
		}
		else if (c < a && c > b) {
			System.out.println("�߰� ���� " + c);
		}
		
		scanner.close();
	}
}
