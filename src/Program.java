import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input a number to calculate its factorial or -1 to exit");
		
		int number = scanner.nextInt();
		
		while (number != -1) {
			
			if (number < 1) {
				System.out.println("Invalid Input");
				break;
			} 
			
			System.out.println("Factorial of: " + number + " is: " + calcFact(number));
			number = scanner.nextInt();
		}
		
		SimpleCalculations simpleCalc = new SimpleCalculations(2, 4);
		System.out.println("Addition: " + simpleCalc.add());
		System.out.println("Subtraction: " + simpleCalc.subtract(true));
		System.out.println("Multiplication: " + simpleCalc.multiply());
		System.out.println("Division: " + simpleCalc.divide(true) + "\n");
		
		PowerNMore more = new PowerNMore(2.4, 3.1);
		System.out.println("Power: " + more.getPower());
		System.out.println("Floor: " + more.getFloor(false));
		System.out.println("Ceiling: " + more.getCeil(true));
		System.out.println("Min: " + more.getMin());
		System.out.println("Max: " + more.getMax() + "\n");
		
		int[] array = new int[] { 2, 4, 6 };
		TheList listClass = new TheList(3, array);
		int[] multiplied = listClass.multiplyAll(2);
		
		for (int i = 0; i < multiplied.length; i++) {
			System.out.println(multiplied[i]);
		}
		
		System.out.println();
		
		int[] listAdded = listClass.addToList(8);
		for (int i = 0; i < listAdded.length; i++) {
			System.out.println(listAdded[i]);
		}
	}
	
	public static long calcFact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * calcFact(n - 1); 
		}
	}
	
}
