import java.util.Scanner;

public class toan_tu_3_ngoi {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap vao diem trung binh cua ban: ");
        Scanner sc = new Scanner(System.in);
        double point = sc.nextDouble();
        String traloi = (point >= 8 && point <=10)
                ? ("Ban xep loai Gioi")
                : ((point >=6.5 && point < 8)
                    ? ("Ban xep loai Kha")
                    : ((point >= 5.0 && point <6.5)
                        ? "Ban xep loai Trung binh"
                        : (point <5 && point >=0) ? ("Ban xep loai yeu") : ("Diem khong hop le")));
        System.out.println(traloi);
    }
}
