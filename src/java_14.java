import java.util.Scanner;

public class java_14 {
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen n: ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        for(int i = 1; i <= n; i+=2) {
            if(i==3) continue;
            tong += i;

        }
        System.out.println("tong la: "+tong);
    }
}
