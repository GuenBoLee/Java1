package NewJava_semester;
import java.util.Scanner;
public class sec4 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력:");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
	
		System.out.print("y 값 입력:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int sum = x+y;
		System.out.println("x+y:"+sum);
		System.out.println();
		int min = x-y;
		System.out.println("x-y:"+min);
		System.out.println();
		int multi = x*y;
		System.out.println("x-y:"+multi);
		System.out.println();
		int div = x/y;
		System.out.println("x/y:"+div);
		System.out.println();	

	}

}
