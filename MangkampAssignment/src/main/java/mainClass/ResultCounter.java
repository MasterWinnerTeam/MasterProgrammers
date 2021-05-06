package mainClass;

public class ResultCounter {

	private int result;

	double A;
	double B;
	double C;
	double resultEvent;

	public void oneHundredMD(double resultEvent) { // 100m D
		eventTrack(A=25.4347, B=18, C=1.81, resultEvent);
	}

	public void fourHundredMD(double resultEvent) { // 400m D
		eventTrack(A=1.53775, B=82, C=1.81, resultEvent);
	}

	public void oneThousandFiveHundredMD(double resultEvent) { // 1500m D
		eventTrack(A=0.03768, B=480, C=1.85, resultEvent);

	}

	public void hurdlesOnehundredTenMD(double resultEvent) { // 110m häck D
		eventTrack(A=5.74352, B=28.5, C=1.92, resultEvent);

	}

	public void twoHundredMH(double resultEvent) { // 200m H
		eventTrack(A=4.99087, B=42.5, C=1.81, resultEvent);
	}

	public void eightHundredMH(double resultEvent) { // 800 m H
		eventTrack(A=0.11193, B=254, C=1.88, resultEvent);
	}

	public void hurdlesHundredMH(double resultEvent) { // 100m häck H
		eventTrack(A=9.23076, B=26.7, C=1.835, resultEvent);
	}

	private void eventTrack(double A, double B, double C, double resultEvent) {
		double X = B - resultEvent;
		double Y = Math.pow(X, C);
		double resultekv = Y * A;
		result = (int) resultekv;
	}

	public void longJumpD(double resultEvent) { // langdhopp
		eventField(A=0.14354, B=220, C=1.4, resultEvent);
	}

	public void shotPutD(double resultEvent) { //
		eventField(A=51.39, B=1.5, C=1.05, resultEvent);
	}

	public void highJumpD(double resultEvent) { //
		eventField(A=0.8465, B=75, C=1.42, resultEvent);
	}

	public void discusThrowD(double resultEvent) { //
		eventField(A=12.91, B=4, C=1.1, resultEvent);
	}

	public void poleVaultD(double resultEvent) { //
		eventField(A=0.2797, B=100, C=1.35, resultEvent);
	}

	public void javelinThrowD(double resultEvent) { //
		eventField(A=10.14, B=7, C=1.08, resultEvent);
	}

	public void highJumpH(double resultEvent) { //
		eventField(A=1.84523, B=75, C=1.348, resultEvent);
	}

	public void longJumpH(double resultEvent) { // 
		eventField(A=0.188807, B=210, C=1.41, resultEvent);
	}

	public void shotPutH(double resultEvent) { 
		eventField(A=56.0211, B=1.5, C=1.05, resultEvent);
	}

	public void javelinThrowH(double resultEvent) { // 
		eventField(A=15.9803, B=3.8, C=1.04, resultEvent);
	}
	
	public void eventField(double A, double B, double C, double resultEvent) {
		double X = resultEvent - B;
		double Y = Math.pow(X, C);
		double resultekv = Y * A;
		result = (int) resultekv;
	}

	public int getResult() {
		return result;
	}
}
