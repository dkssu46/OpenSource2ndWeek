import java.util.Scanner;

public class Circle_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� (x y r) >>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� (x y r) >>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		
		//�� ������ ������ ���� ��ġ�� �ʴ� ������ �Ѵ�.
		if(r1+r2 > distance) {
			System.out.println("�� ���� ���� ��ģ��");
		}
		else {
			System.out.println("�� ���� ��ġ�� �ʴ´�");
		}

		
		
		
		
		
		
		
		scanner.close();
	}

}
