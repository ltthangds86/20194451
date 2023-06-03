package hust.soict.dsai.lab01.Problem65.src;
import java.util.Scanner;
public class Problem65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of array:");
		int n = sc.nextInt();
		double[] arr = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("enter arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                double temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    System.out.print("sort: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		double sum=0;
		System.out.print("\nsum: ");
		for (int i = 0; i < n; i++) {
			sum =sum + arr[i];
		}
		System.out.println(sum);
		System.out.println("average: "+(sum/n));
}
}