package NewJava_semester;
import java.util.Scanner;
public class sec7 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�:");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		System.out.print("�Ⱓ �Է�:");
		String strB = scanner.nextLine();
		int b = Integer.parseInt(strB);
		System.out.print("������ �Է�:");
		String strC = scanner.nextLine();
		int c = Integer.parseInt(strC);
		double FV1,FV2;
		FV1 = a * (1+(c*b));
		FV2 = a * (1+c)^b;
		
		System.out.printf("�ܸ��� ���� :%.2f��%n", FV1);
		System.out.println();
		System.out.printf("������ ���� :%.2f��%n", FV2);
		System.out.println();
	}

}
