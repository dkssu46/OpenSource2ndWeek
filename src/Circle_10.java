import java.util.Scanner;

public class Circle_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력 (x y r) >>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력 (x y r) >>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		
		//한 점에서 만나는 것은 겹치지 않는 것으로 한다.
		if(r1+r2 > distance) {
			System.out.println("두 원은 서로 겹친다");
		}
		else {
			System.out.println("두 원은 겹치지 않는다");
		}

		
		
		
		
		
		
		
		scanner.close();
	}

}
