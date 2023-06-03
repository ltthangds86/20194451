package hust.soict.dsai.lab01.Problem66.src;
import java.util.Scanner;
class Matrix {
	Scanner sc = new Scanner(System.in);
	private int columns;
	private int rows;
	double [][] arr;
	
	public void setSize(int rows, int columns) {
		this.columns = columns;
		this.rows = rows;
		arr = new double[rows][columns];
	}
	public void enterElement() {
		for (int i =0;i<rows;i++) {
			for (int j = 0;j<columns;j++) {
				System.out.print("enter arr"+(i+1)+""+(j+1)+": ");
				this.arr[i][j] = sc.nextDouble();
			}
		}
	}
	public void display() {
		for (int i = 0;i<rows;i++) {
			for (int j=0;j<columns;j++ ) {
				System.out.print(this.arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
public class Problem66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix m = new Matrix();
		Matrix n = new Matrix();
		Matrix sum = new Matrix();
		System.out.print("enter number of rows: ");
		int r = sc.nextInt();
		System.out.print("enter number of columns: ");
		int c = sc.nextInt();
		m.setSize(r,c);
		n.setSize(r,c);
		sum.setSize(r, c);
		System.out.println("enter elements for matrix 1");
		m.enterElement();
		m.display();
		System.out.println("-------------------");
		
		System.out.println("enter elements for matrix 2");
		n.enterElement();
		n.display();
		System.out.println("-------------------");
		
		for (int i =0;i<r;i++) {
			for (int j = 0;j<c;j++) {
				 sum.arr[i][j]=m.arr[i][j]+n.arr[i][j];
			}
		}
		System.out.println("Result: ");
		sum.display();
	}
}
