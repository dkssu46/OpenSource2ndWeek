import java.util.Scanner;

public class Exchange_1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("원화를 입력하세요 (단위 원) >>> ");
		Scanner scanner = new Scanner(System.in);
		
		float won = scanner.nextFloat();
		float doller = won/1100;
		
		System.out.println(won + "원은 $" + doller + "입니다.");
		
		scanner.close();
	}
}
