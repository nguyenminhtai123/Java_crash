import java.util.Scanner;

public class java_18 {
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen n: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = n; j>=1; j--) {
                if( j == 1 || i ==j || i == n) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }
    }
}
