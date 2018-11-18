
public class TheList {
	private int[] theInts;
	private int size;
	
	public TheList(int size, int[] theInts) {
		this.size = size;
		this.theInts = theInts;
	}
	
	public int[] multiplyAll(int number) {
		int[] intsCopy = new int[theInts.length];
		
		for (int i = 0; i < size; i++) {
			intsCopy[i] = theInts[i] * number;
		}
		
		return intsCopy;
	}
	
	public int[] addToList(int number) {
		int[] newInts = new int[size + 1];
		
		for (int i = 0; i < theInts.length; i++) {
			newInts[i] = theInts[i];
		}
		
		newInts[size] = number;
		size++;
		
		return newInts;
	}
}
