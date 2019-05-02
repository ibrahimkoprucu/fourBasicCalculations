package fourBasicCalculations;

public interface Operation {	
	boolean isValid(double x, double y);
	double calc(double x, double y) throws Exception;	
}
