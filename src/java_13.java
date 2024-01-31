import java.util.Scanner;

public class java_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so nguyen a: ");
        int a = sc.nextInt();
        int tong = 0;
        if(a %2 == 0) {
            for(int i=0; i <=a; i++) {
                tong += i;
            }
            System.out.println("tong la: "+tong);
        }
        else {
            System.out.println("toi 0 tinh tong so le, bye bye");
        }
    }
}
