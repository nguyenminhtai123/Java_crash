import java.util.Scanner;

public class java_16 {

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen n: ");
        int n = new Scanner(System.in).nextInt();

        for(int i = 1; i <= n; i++) {
            int tong = 0;
            for(int j = 1; j < i; j++) {
                if(i % j  ==  0) {
                    tong += j;
                }
            }
            if(tong == i ) {
                System.out.println("Cac so hoan hao trong khoang tu 1 - "+n +" la: "+i);
            }
        }
    }
}
