package lab4;

public class IntegerMatrix extends GenericMatrix<Integer> {
	protected Integer add(Integer element1, Integer element2) {
		return element1 + element2;
	}
	
	protected Integer multiply(Integer element1, Integer element2) {
		return element1 * element2;
	}
	
	protected Integer zero() {
		return 0;
	}
}
