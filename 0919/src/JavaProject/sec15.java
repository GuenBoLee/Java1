package JavaProject;
import java.util.Scanner;
public class sec15 {

	public static void main(String[] args) {
	java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.print("x �� �Է�:");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
	
		System.out.print("y �� �Է�:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.println("x+y:"+result);
		System.out.println();
		
		while(true) {
		System.out.println("�Է¹��ڿ�:");
		String data = scanner.nextLine();
		if(data.equals("q")) {
		break;	
		}
		
		System.out.println("��� ���ڿ�:" +data);
		System.out.println();
	}
	
	System.out.println("����");
}
}