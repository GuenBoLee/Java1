package NewJava_semester;
import java.util.Scanner;
public class sec5 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);

		System.out.print("���ǹ����� �� �Է�:");
		String strR = scanner.nextLine();
		int r = Integer.parseInt(strR);
		double Pi=3.14;
		int Circle;
		Circle= (int) (2*Pi*r);
		int Circle2;
		Circle2 = (int) (Pi*(r^2));
		int Circle3;
		Circle3 = (int) (Pi*(r^2));
		System.out.println("���� �ѷ�:"+Circle);
		System.out.println();
		System.out.println("���� ����:"+Circle2);
		System.out.println();
		System.out.println("���� ����:"+Circle3);
		System.out.println();
	}

}
