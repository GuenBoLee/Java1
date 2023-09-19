package JavaProject;
import java.util.Scanner;
public class sec16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 정수로 넣으세요:");
		String input = scanner.nextLine();
		
		int parsedint = Integer.parseInt(input);
		
		System.out.print("또 다른 정수를 넣으세요:");
		int userInputInt = scanner.nextInt();
		
		System.out.println("문자열 정수:"+parsedint);
		System.out.println("사용자 입력으로부터 정수:"+userInputInt);
	scanner.close();
	}

}
