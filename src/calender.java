import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap ngay sinh cua ban: ");
        int day = new Scanner(System.in).nextInt();
        System.out.println("Xin moi nhap thang sinh cua ban: ");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Xin moi nhap nam sinh cua ban: ");
        int year = new Scanner(System.in).nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month - 1, day);
        Date birthdayDate = birthday.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngay thang nam sinh: "+dateFormat.format(birthdayDate));

//        tinh tuoi

        Calendar today = Calendar.getInstance();
        int thisYear = today.get(Calendar.YEAR);

        int yearsOld = thisYear - year;
        System.out.println("Tuoi cua ban la: "+ yearsOld);
    }
}
