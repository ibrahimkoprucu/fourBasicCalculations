package fourBasicCalculations;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	
	Map<String, Operation> map = new HashMap<String, Operation>();
	public Calculator() {
		map.put("+", new Sum());
		map.put("-", new Substract());
		map.put("*", new Multiply());
		map.put("/", new Divide());
	}	
	
	public double calculate(String operation, double s1, double s2 ) throws Exception {
		return map.get(operation).calc(s1, s2);
	}	
}
