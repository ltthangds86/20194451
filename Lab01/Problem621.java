import javax.swing.JOptionPane;
class Problem621 {
    public static void main(String[] args) {
        String strn;
        strn=JOptionPane.showInputDialog(null,
	      "Please input the number of rows: ","Input the number of rows",
	      JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(strn);
        for (int i = 1; i <= n; i++) {
            for (int j = -n; j <= -i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}