import java.util.Scanner;

public class java_12 {
    public static void main(String[] args) {
        System.out.println("moi  nhap vao so nguyen  n:");
        Scanner sc = new Scanner(System.in);
        int giaithua = 1;
        int n = sc.nextInt();
        int i =1;
        while(i<n) {
            ++i;
            giaithua*=i;
        }
        System.out.println("Ket qua " +n +"!=" +giaithua);
    }
}


