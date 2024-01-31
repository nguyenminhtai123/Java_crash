import java.util.Scanner;

public class syntax_basic {
    public static void main(String[] args) {
        System.out.println("Nhap vao so a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap vao so b: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Nhap vao so c: ");
        double c = new Scanner(System.in).nextDouble();
        double denta = Math.pow(b, 2) - 4*a*c;
        if(denta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (denta == 0) {
            System.out.println("Phuong trinh da cho co nghiem kep x1 = x2 = " +(-(b/2*a)));
        } else {
            System.out.println("Phuong trinh da cho co 2 nghiem phan biet: ");
            System.out.print("x1 = " +((-b + Math.sqrt(denta))/2*a));
            System.out.print(" va ");
            System.out.print("x2 = " +((-b - Math.sqrt(denta))/2*a));
        }
    }
}
