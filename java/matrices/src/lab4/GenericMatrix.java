package lab4;

public abstract class GenericMatrix<T extends Number> {
	//Abstract method for adding two elements of the matrices
	protected abstract T add(T element1, T element2);
	
	//Abstract method for multiplying the elements of the matrices
	protected abstract T multiply(T element1, T element2);
	
	//For a rational number it returns 0/1 
	protected abstract T zero();
	
	//Add two matrices
	public T[][] addMatrix(T[][] matrix1, T[][]matrix2) {
		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new RuntimeException("The matrices do not have the same size");
		}
		
		T[][] result = (T[][])new Number[matrix1.length][matrix1[0].length];
		//Perform Addition
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				result[i][j] = add(matrix1[i][j], matrix2[i][j]);
			}
		}
		
		return result;
	}
	
	//Multiply two matrices
	public T[][] multiplyMatrix(T[][] matrix1, T[][]matrix2) {
		if(matrix1[0].length != matrix2.length) {
			throw new RuntimeException("The matrices do not have compatible size");
		}
		
		T[][] result = (T[][])new Number[matrix1.length][matrix1[0].length];
		//Perform Multiplication
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				result[i][j] = zero();
				for(int k = 0; k < matrix1[0].length; k++) {
					T value = multiply(matrix1[j][k], matrix2[k][j]);
					result[i][j] = add(result[i][j], value);
				}
			}
		}
		
		return result;
	}
	
	public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
		System.out.println("Matrix1 is ");
		printMatrix(m1);
		System.out.println("Matrix2 is ");
		printMatrix(m2);
		System.out.println("Matrix1 is " + op + " Matrix2 is");
		printMatrix(m3);
	}

	private static void printMatrix(Number[][] m1) {
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[0].length; j++) {
				System.out.print(" " + m1[i][j]);
			}
			System.out.println("");
		}
	}
}