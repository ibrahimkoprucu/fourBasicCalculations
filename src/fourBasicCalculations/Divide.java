package fourBasicCalculations;

public class Divide implements Operation {

	@Override
	public double calc(double x, double y) throws Exception {
		
		if(!this.isValid(x, y)) {
			throw new Exception("Sýfýra bölme yapýlamaz.");
		}
		
		return x / y;
	}

	@Override
	public boolean isValid(double x, double y) {
		return y != 0;
	}

}
