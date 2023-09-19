package JavaProject;

public class sec12 {

	public static void main(String[] args) {
		int a = 3;
		char b = 'A';
		String c = "Code";
		int num1 = 1;
		double num2 = 12.3456789;
		System.out.printf("a = %d %n",a);
		System.out.printf("b = %c %n",b);
		System.out.printf("c = %s %n",c);
		System.out.printf("자리수 미지정 : %d%n%n",1000);
		System.out.printf("자리수 지정 : %4d%n%n",1000);
		System.out.printf("자리수 지정 : %07d%n%n",-1000);
		System.out.printf("num1 :%d%n",num1);
		System.out.printf("num2 : %f%n",num2);
		System.out.printf("num2(소수점 첫째자리) : %10.1f%n",num2);
		System.out.printf("num2(소숫점 셋째자리) : %10.3f%n",num2);
	}

}
