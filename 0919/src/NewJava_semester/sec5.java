package NewJava_semester;
import java.util.Scanner;
public class sec5 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);

		System.out.print("원의반지름 값 입력:");
		String strR = scanner.nextLine();
		int r = Integer.parseInt(strR);
		double Pi=3.14;
		int Circle;
		Circle= (int) (2*Pi*r);
		int Circle2;
		Circle2 = (int) (Pi*(r^2));
		int Circle3;
		Circle3 = (int) (Pi*(r^2));
		System.out.println("원의 둘레:"+Circle);
		System.out.println();
		System.out.println("원의 넓이:"+Circle2);
		System.out.println();
		System.out.println("원의 부피:"+Circle3);
		System.out.println();
	}

}
