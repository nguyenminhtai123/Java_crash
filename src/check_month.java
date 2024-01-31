import java.util.Scanner;

public class check_month {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap mot thang bat ki tu 1 den 12: ");
        Scanner month_sc = new Scanner(System.in);
        int month = month_sc.nextInt();

        switch (month ) {
            case 1: {
                System.out.println("Thang"+month+" co 31 ngay");
            }
            break;
            case 3: {
                System.out.println("Thang"+month+" co 31 ngay");
            }
            break;
            case 5: {
                System.out.println("Thang"+month+" co 31 ngay");
            }
            break;
            case 7: {
                System.out.println("Thang"+month+" co 31 ngay");
            }
            break;
            case 8: {
                System.out.println("Thang"+month+" co 31 ngay");
            }
            break;
            case 10: {
                System.out.println("Thang"+month+" co 31 ngay");
            }
            break;
            case 4: {
                System.out.println("Thang"+month+" co 30 ngay");
            }
            break;
            case 6: {
                System.out.println("Thang"+month+" co 30 ngay");
            }
            break;
            case 9: {
                System.out.println("Thang"+month+" co 30 ngay");
            }
            break;
            case 11: {
                System.out.println("Thang"+month+" co 30 ngay");
            }
            break;
            case 2: {
                System.out.println("Xin moi nhap nam hien tai: ");
                Scanner year_sc = new Scanner(System.in);
                int year = year_sc.nextInt();
                if((year % 4 ==0 && year %100 !=0) || (year %400 ==0)){
                    System.out.println("Thang"+month+" co 29 ngay");
                }
                else {
                    System.out.println("Thang"+month+" co 28 ngay");
                }
             }
            break;
            default:
                System.out.println("Thang ban nhap vao khong hop le");
        }
    }
}
