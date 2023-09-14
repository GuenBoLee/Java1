package sec01;

public class hw3 {

	public static void main(String[] args) {
		double PV= 10000;
		double r = 0.2;
		double n = 6;
		double FV =PV*(1+(r*n));
		double F2V = PV*Math.pow(1+r,n);
		System.out.println("단리는"+FV);
		System.out.println("복리는"+F2V);

	}

}
