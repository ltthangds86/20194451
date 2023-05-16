import java.util.Scanner;
public class Problem65 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("The number of rows:");
      int r = input.nextInt();
      System.out.println("The number of columns:");
      int c  = input.nextInt();
      int ar1[][] = new int[r][c];
      int ar2[][] = new int[r][c];
      int sum[][] = new int[r][c]; 
      System.out.println("The elements of first matrix:"); 
      int i,j;
      for (i = 0 ; i < r ; i++ )
         for (j = 0 ; j < c ; j++ )
            ar1[i][j] = input.nextInt();
      System.out.println("The elements of second matrix:"); 
      for (i = 0 ; i < r ; i++ )
         for (j = 0 ; j < c ; j++ )
            ar2[i][j] = input.nextInt();
      for (i = 0 ; i < r ; i++ )
         for (j = 0 ; j < c ; j++ )
             sum[i][j] = ar1[i][j] + ar2[i][j];  
      System.out.println("The sum is:"); 
      for (i = 0 ; i < r ; i++ ) {
         for (j = 0 ; j < c ; j++ )
            System.out.print(sum[i][j]+"   ");
         System.out.println();
      }
   }
}