import java.util.Scanner;
class LinearEquation{
	private double a;
	private double b;
	Scanner sc = new Scanner(System.in);
	public LinearEquation() {
		System.out.println("form: ax+b=0");
		System.out.println("input a: ");
		a = sc.nextDouble();
		System.out.println("input b: ");
		b = sc.nextDouble();
	}
	public void solve() {
		if (a==0 && b==0) {
			System.out.println("ifinitely solutions");
		}
		else if (a==0 && b!=0) {
			System.out.println("No solution");
		}
		else {
			double sol = -b/a;
			System.out.println("Solution: "+sol);
		}
	}
}
class LinearSystem{
	private double a11;
	private double a12;
	private double a21;
	private double a22;
	private double b1;
	private double b2;
	Scanner sc = new Scanner(System.in);
	public LinearSystem() {
		System.out.println("form: \n a11*x1+a12*x2=b1 \n a21*x1+a22*x2=b2");
		System.out.println("input a11: ");
		a11 = sc.nextDouble();
		System.out.println("input a12: ");
		a12 = sc.nextDouble();
		System.out.println("input b1: ");
		b1 = sc.nextDouble();
		System.out.println("input a21: ");
		a21 = sc.nextDouble();
		System.out.println("input a22: ");
		a22 = sc.nextDouble();
		System.out.println("input b2: ");
		b2 = sc.nextDouble();
	}
	public void solve() {
		double d = a11*a22 - a12*a21;
		double dx = b1*a22 - b2*a12;
		double dy = b2*a11- b1*a21;
		if (d == 0) {
			if (dx==0 && dy==0) {
				System.out.println("ifinitely solutions");
			}
			else System.out.println("no solution");
		}
		else {
			double x1 = dx/d;
			double x2 = dy/d;
			System.out.println("Solution: x1 = "+x1+", x2 = "+x2);
		}
	}
}
class SecondDegreeEquation{
	private double a;
	private double b;
	private double c;
	Scanner sc = new Scanner(System.in);
	public SecondDegreeEquation() {
		System.out.println("form: ax^2+bx+c=0");
		System.out.println("input a: ");
		a = sc.nextDouble();
		System.out.println("input b: ");
		b = sc.nextDouble();
		System.out.println("input c: ");
		c = sc.nextDouble();
	}
	public void solve() {
		if (a == 0) {
			System.out.println("a must be different from 0");
            return;
        }

        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 =  ((-b + Math.sqrt(delta)) / (2*a));
            x2 =  ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Solution: x1 = " + x1 + "and x2 = " + x2);
        } 
        else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Solution: x1 = x2 = " + x1);
        } 
        else {
            System.out.println("No solution");
        }
    }
}



public class Problem226 {
	public static void main(String[] args) {
		LinearEquation le = new LinearEquation();
		le.solve();
		System.out.println("----------------------------");
		LinearSystem ls = new LinearSystem();
		ls.solve();
		System.out.println("----------------------------");
		SecondDegreeEquation sde = new SecondDegreeEquation();
		sde.solve();
	}

}