package Mycalcpkgj;

public class mainCalculator {

	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		int sum=obj.addition(12,3);
		int sub=obj.substraction(4,1);
		int mult=obj.Multiply(2,3);
		int div=obj.divide(4,2);
		System.out.println("Divide is "+div);
		System.out.println("Multiplication is"+mult);
		System.out.println("Subtraction is"+sub);
		System.out.println("addition is "+sum);

	}

}
