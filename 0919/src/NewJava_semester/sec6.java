package NewJava_semester;
import java.util.Scanner;
public class sec6 {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ﰢ�� �غ��� ����:");
		String strx= scanner.nextLine();
		int X = Integer.parseInt(strx);
		System.out.print("�ﰢ�� ����:");
		String stry= scanner.nextLine();
		int Y = Integer.parseInt(stry);
		System.out.print("�簢�� �غ��� ����:");
		String stra= scanner.nextLine();
		int A = Integer.parseInt(stra);
		System.out.print("�簢�� ����:");
		String strb= scanner.nextLine();
		int B = Integer.parseInt(strb);
		
		System.out.println("�ﰢ�� ����:"+ X*Y/2);
		System.out.println();
		System.out.println("�簢�� ����:"+A*B);
		System.out.println();
	}

}
