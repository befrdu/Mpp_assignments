package problem_2;

public interface Polygon extends ClosedCurve {
	public double[] getSides();
	
	default double computePerimeter() {
		double[] lengths = getSides();
		double sum = 0.0;
		for(double len : lengths) {
			sum += len;
		}
		return sum;
	}
}
