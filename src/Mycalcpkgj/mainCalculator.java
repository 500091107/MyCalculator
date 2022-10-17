package Mycalcpkgj;

public class mainCalculator {

	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		int sum=obj.addition(12,3);
		int sub=obj.substraction(4,1);
		System.out.print("Subtraction is"+sub);
		System.out.print("addition is "+sum);

	}

}
