import java.util.Scanner;
public class Problem64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The number of elements in array:");
        int n = input.nextInt();
        Integer ar[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("The elements:");
            ar[i] = input.nextInt();       
        }
        int sum=0;
	    for (int i=0;i<n;i++) {
	    sum=sum+ar[i];
	    }
	    System.out.println("sum: "+(sum));
	    System.out.println("average: "+(sum/n));
        for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println("Sorted:");
        for (int i = 0; i < n ; i++) {
            System.out.print(ar[i] + " ");
        }    
    }
}