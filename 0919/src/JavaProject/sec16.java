package JavaProject;
import java.util.Scanner;
public class sec16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ��� ������ ��������:");
		String input = scanner.nextLine();
		
		int parsedint = Integer.parseInt(input);
		
		System.out.print("�� �ٸ� ������ ��������:");
		int userInputInt = scanner.nextInt();
		
		System.out.println("���ڿ� ����:"+parsedint);
		System.out.println("����� �Է����κ��� ����:"+userInputInt);
	scanner.close();
	}

}
