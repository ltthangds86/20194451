package hust.soict.dsai.lab01;
import java.util.Scanner;
public class Problem225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		double diff = num1 - num2;
		double product = num1*num2;
		System.out.println("sum: "+sum);
		System.out.println("difference: "+diff);
		System.out.println("product: "+product);
		if (num2==0) System.out.println("Cannot be divided by zero");
		else {
			double quotient = num1/num2;
			System.out.println("quotient: "+quotient);
		}
	}
}
