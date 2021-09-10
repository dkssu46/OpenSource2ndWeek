import java.util.Scanner;


public class Coin_3 {

	public static void main(String[] args) {
		
		System.out.println("금액을 입력하시오 >>> ");
		Scanner scanner = new Scanner(System.in);
		
		int won = scanner.nextInt();
		
		int Oman = won/50000;
		won = won%50000;
		
		int Man = won/10000;
		won = won%10000;
		
		int Cheon = won/1000;
		won = won%1000;
		
		int Bak = won/100;
		won = won%100;
		
		int Osib = won/50;
		won = won%50;
		
		int Sib = won/10;
		won = won % 10;
		
		System.out.println("오만원권 " + Oman + "매");
		System.out.println("만원권 " + Man + "매");
		System.out.println("천원권 " + Cheon + "매");		
		System.out.println("백원 " + Bak + "개");
		System.out.println("오십원 " + Osib + "개");
		System.out.println("십원 " + Sib + "개");
		System.out.println("일원 " + won + "개");
		
		scanner.close();
	}
	
}
