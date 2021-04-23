package stepDefinitions;

public class TestEkva {

	public static void main(String[] args) {
		int int1 = 10;
		
		double A = 25.4347;
		double B = 18;
		double C = 1.81;
		double x = B-int1;
		double i = Math.pow(x, C);
		double resultekv = i*A;
		int result = (int)resultekv;
		System.out.println(result);

	}

}
