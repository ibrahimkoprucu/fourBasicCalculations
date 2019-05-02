package fourBasicCalculations;

public class Divide implements Operation {

	@Override
	public double calc(double x, double y) throws Exception {
		
		if(!this.isValid(x, y)) {
			throw new Exception("S�f�ra b�lme yap�lamaz.");
		}
		
		return x / y;
	}

	@Override
	public boolean isValid(double x, double y) {
		return y != 0;
	}

}
