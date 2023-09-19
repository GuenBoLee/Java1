package NewJava_semester;
import java.util.Scanner;
public class sec6 {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형 밑변의 길이:");
		String strx= scanner.nextLine();
		int X = Integer.parseInt(strx);
		System.out.print("삼각형 높이:");
		String stry= scanner.nextLine();
		int Y = Integer.parseInt(stry);
		System.out.print("사각형 밑변의 길이:");
		String stra= scanner.nextLine();
		int A = Integer.parseInt(stra);
		System.out.print("사각형 높이:");
		String strb= scanner.nextLine();
		int B = Integer.parseInt(strb);
		
		System.out.println("삼각형 넓이:"+ X*Y/2);
		System.out.println();
		System.out.println("사각형 넓이:"+A*B);
		System.out.println();
	}

}
