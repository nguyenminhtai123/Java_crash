import java.util.Scanner;

public class java_15 {
    static int giaithua(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans  *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Xin moi nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        for(int i = 1; i <= n; i++) {
            tong += giaithua(i);
        }
        System.out.println("Tong S="+tong);
    }
}
