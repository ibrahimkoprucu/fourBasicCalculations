package fourBasicCalculations;

public class Sum implements Operation {

	@Override
	public double calc(double x, double y) throws Exception {

		if (!this.isValid(x, y)) {
			throw new Exception("Parametreler uygun deðil");
		}
		
		return x+y;
	}

	@Override
	public boolean isValid(double x, double y) {		
		return true;
	}

}
