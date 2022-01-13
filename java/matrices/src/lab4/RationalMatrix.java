package lab4;

public class RationalMatrix extends GenericMatrix<Rational> {
	protected Rational add(Rational element1, Rational element2) {
		return element1.add(element2);
	}
	
	protected Rational multiply(Rational element1, Rational element2) {
		return element1.multiply(element2);
	}
	
	protected Rational zero() {
		return new Rational();
	}
}
