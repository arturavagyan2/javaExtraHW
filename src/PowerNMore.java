
public class PowerNMore {
	private double a;
	private double b;
	
	public PowerNMore(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getPower() {
		return Math.pow(a, b);
	}
	
	public double getFloor(boolean isA) {
		if (isA) {
			return Math.floor(a);
		}
		
		return Math.floor(b);
	}
	
	public double getCeil(boolean isA) {
		if (isA) {
			return Math.ceil(a);
		}
		
		return Math.ceil(b);
	}
	
	public double getMin() {
		return Math.min(a, b);
	}
	
	public double getMax() {
		return Math.max(a, b);
	}
}
