import java.util.Scanner;


public class Coin_3 {

	public static void main(String[] args) {
		
		System.out.println("�ݾ��� �Է��Ͻÿ� >>> ");
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
		
		System.out.println("�������� " + Oman + "��");
		System.out.println("������ " + Man + "��");
		System.out.println("õ���� " + Cheon + "��");		
		System.out.println("��� " + Bak + "��");
		System.out.println("���ʿ� " + Osib + "��");
		System.out.println("�ʿ� " + Sib + "��");
		System.out.println("�Ͽ� " + won + "��");
		
		scanner.close();
	}
	
}
