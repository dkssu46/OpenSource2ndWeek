import java.util.Scanner;


public class Same_2 {
	
	public static void main(String[] args) {
		
		System.out.println("2�ڸ��� ���� �Է�(10~99) >>> ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int a = num/10;
		int b = num%10;
		
		if(a == b) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
						
		
		scanner.close();
	}

}
