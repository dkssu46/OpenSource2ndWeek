import java.util.Scanner;

public class Game369_6 {
public static void main(String[] args) {
		
		System.out.print("1~99 ������ ������ �Է��ϼ��� >>> ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int Il = num%10;
		int Sib = num/10;
		int count = 0;
		
		if(Il != 0) {
			if(Il%3 == 0) {
				count++;
			}
		}
		
		if(Sib != 0) {
			if(Sib%3 == 0) {
				count++;
			}
		}
		
		
		if(count > 0) {
			System.out.print("�ڼ�");
			for(int i = 0;i < count;i++) {
				System.out.print("¦");
			}
		}
		
		
		scanner.close();
	}
}
