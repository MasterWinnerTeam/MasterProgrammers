package mainClass;

public class ResultCounter {

	private int result;

	double A;
	double B;
	double C;
	double resultEvent;

	public void oneHundredMD(double resultEvent) { // 100m D
		eventTrack(A = 25.4347, B = 18, C = 1.81, resultEvent);
	}

	public void fourHundredMD(double resultEvent) { // 400m D
		eventTrack(A = 1.53775, B = 82, C = 1.81, resultEvent);
	}

	public void oneThousandFiveHundredMD(double resultEvent) { // 1500m D
		eventTrack(A = 0.03768, B = 480, C = 1.85, resultEvent);

	}
	public void hurdlesOnehundredTenMD(double resultEvent) { // 110m häck D
		eventTrack(A=5.74352, B=28.5, C=1.92, resultEvent);

	}
	public void twoHundredMH(double resultEvent) { // 200m  H
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
	public void longJump(double resultEvent) { //langdhopp
		eventField(A=0.14354, B=220, C=1.4, resultEvent);
	}
	public void longJum(double resultEvent) { //langdhopp
		eventField(A=0.14354, B=220, C=1.4, resultEvent);
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
