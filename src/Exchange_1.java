import java.util.Scanner;

public class Exchange_1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("��ȭ�� �Է��ϼ��� (���� ��) >>> ");
		Scanner scanner = new Scanner(System.in);
		
		float won = scanner.nextFloat();
		float doller = won/1100;
		
		System.out.println(won + "���� $" + doller + "�Դϴ�.");
		
		scanner.close();
	}
}
