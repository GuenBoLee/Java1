package NewJava_semester;

public class sec2 {

	public static void main(String[] args) {
		int money = 1000;
		int date = 10;
		int sec = 10;
		double FV1;
		double FV2;
		FV1 = money * (1+(sec*date));
		FV2 = money * (1+sec)^date;
		System.out.printf("�ܸ��� ���� :%.2f��%n", FV1);
		System.out.printf("������ ���� :%.2f��%n", FV2);
	}

}
