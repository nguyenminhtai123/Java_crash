import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("Xin moi ban nhap vao lua chon");
        System.out.println("1. tim theo ten");
        System.out.println("2. tim theo tac gia");
        System.out.println("3. tim theo nha xuat ban");
        System.out.println("4. tim theo tieu de");
        System.out.println("Thoat neu bam phim khong hop le");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1: {
                System.out.println("1. tim theo ten");
            }
            break;
            case 2: {
                System.out.println("2. tim theo tac gia");
            }
            break;
            case 3: {
                System.out.println("3. tim theo nha xuat ban");
            }
            break;
            case 4: {

                System.out.println("4. tim theo tieu de");
            }
            break;
            default: {
                System.out.println("Phim bam khong hop le");
                break;
            }

        }

    }
}
