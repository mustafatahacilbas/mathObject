package mathObject;

public class Math {

	private static final String C = null;

	public int sum(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	public int sub(int n1, int n2) {
		int result;
		result = n1 - n2;
		return result;
	}

	public int mult(int n1, int n2) {
		int result;
		result = n1 * n2;
		return result;
	}

	public double divide(int n1, int n2) {
		double result;
		result = n1 / n2;
		return result;
	}

	private double pi;

	public Math() {
		this.pi = 3.14785;
	}

	public double getPi() {
		return pi;
	}

	public double areaOFCircle(double r) {
		return this.getPi() * r * r;
	}

	public double volumeOFSphere(double r) {
		return this.getPi() * r * r * r * 4 / 3;
	}

	public double areaOfRectangularPrism(double a, double b, double c) {
		return a * b / 2;
	}

	public int areaOfRectangularPrism1(double a, double b,double  c2) {
		return 0;
	}

	public int areaOfRectangularPrism2(double i, double j,double k) {
		return 0;
	}

	}
}
{