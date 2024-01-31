import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("Moi ban nhap vao ban kinh r: ");
        double r = new Scanner(System.in).nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi duong tron: "+cv);
        System.out.println("Dien tich duong tron: "+dt);

        System.out.println("Moi ban nhap vao chieu dai a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Moi ban nhap vao chieu rong b: ");
        double b = new Scanner(System.in).nextDouble();
        double cv1 = (a+b)*2;
        double dt1 = a*b;
        System.out.println("Chu vi hinh chu nhat: "+cv1);
        System.out.println("Dien tich hinh chu nhat: "+dt1);

    }
}
