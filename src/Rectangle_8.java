import java.util.Scanner;

public class Rectangle_8 {
	
	public static boolean inRect(int x, int y) {
		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.print("�� ���� �Է��ϼ��� (x1 y1 x2 y2)");
		Scanner scanner = new Scanner(System.in);
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		boolean crash = true;
		
		//x�� �������� ����
		if(x1 > x2) {
			int temp = x1;
			x1 = x2;
			x2 = temp;
			temp = y1;
			y1 = y2;
			y2 = temp;
		}
		
		//�浹 ����
		if(!(inRect(x1,y1) || inRect(x2,y2))) {
			
			crash = false;		
			
			//���� ���簢���� �������� ���� ����
			if(x1 < 100 && x2 > 200) {
				if(y1 > 200 && y2 < 100) {
					crash = true;
				}
				if(y1 < 100 && y2 > 200) {
					crash = true;
				}
			}
		}
		
		if(crash) {
			System.out.println("�浹�մϴ�!");
		}
		else {
			System.out.println("�浹���� �ʽ��ϴ�!");
		}
		
		
		
		scanner.close();

	}

}
