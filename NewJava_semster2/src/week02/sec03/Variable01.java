package week02.sec03;

public class Variable01 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("x:" +x+",y:"+y);
		int temp = x;
		x = y;
		y =temp;
		System.out.println("x:"+x+",y:"+y);

	}

}
