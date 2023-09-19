package NewJava_semester;
import java.util.Scanner;
public class sec7 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.print("월급 입력:");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		System.out.print("기간 입력:");
		String strB = scanner.nextLine();
		int b = Integer.parseInt(strB);
		System.out.print("이자율 입력:");
		String strC = scanner.nextLine();
		int c = Integer.parseInt(strC);
		double FV1,FV2;
		FV1 = a * (1+(c*b));
		FV2 = a * (1+c)^b;
		
		System.out.printf("단리의 이자 :%.2f원%n", FV1);
		System.out.println();
		System.out.printf("복리의 이자 :%.2f원%n", FV2);
		System.out.println();
	}

}
