
public class Calculator {
	
	static double powerInt(int num1,int num2) {
		
		return  Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2) {

		return Math.pow( num2, num1);

	}
	
}




public class TestCalculator {

	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(3, 2));
		System.out.println(Calculator.powerDouble(8.5, 2));

	}

}
