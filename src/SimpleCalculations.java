
public class SimpleCalculations {
	private int a;
	private int b;
	
	public SimpleCalculations(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return a + b;
	}
	
	public int subtract(boolean opposite) {
		
		if (opposite) {
			return b - a;
		}
		
		return a - b;
	}
	
	public int multiply() {
		return a * b;
	}
	
	public double divide(boolean opposite) {
		
		if (opposite) {
			if (a == 0) {
				System.out.println("a cannot be 0");
			}
			
			return b / a;
		}
			
		if (b == 0) {
			System.out.println("b cannot be 0");
		}
		
		return a / b;
	}
}
