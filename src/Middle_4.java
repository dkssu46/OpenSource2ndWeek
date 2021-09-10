import java.util.Scanner;

public class Middle_4 {
	
	public static void main(String[] args) {
		System.out.println("정수 3개 입력 >>> ");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		// 정렬 안하고 풀기 위함
		if(a < b && a > c) {
			System.out.println("중간 값은 " + a);
		}
		else if (a > b && a < c) {
			System.out.println("중간 값은 " + a);
		}
		else if (b > a && b < c) {
			System.out.println("중간 값은 " + b);
		}
		else if (b < a && b > c) {
			System.out.println("중간 값은 " + b);
		}
		else if (c > a && c < b) {
			System.out.println("중간 값은 " + c);
		}
		else if (c < a && c > b) {
			System.out.println("중간 값은 " + c);
		}
		
		scanner.close();
	}
}
