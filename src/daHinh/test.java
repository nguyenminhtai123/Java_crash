package daHinh;

public class test {
    public static void main(String[] args) {
        nhanSu ns1 = new phoPhong("phong", "1234", "Ha Noi");

        System.out.println(ns1.tinhLuong(21));
        System.out.println("ns1 dang lam pp");
        System.out.println(ns1.getTen()+ " " + ns1.getCccd());

        ns1 = new truongPhong(ns1.getTen(), ns1.getCccd());

        System.out.println("ns1 dang lam tp");
        System.out.println(ns1.getTen()+ " " + ns1.getCccd());
        System.out.println(ns1.tinhLuong(21));

    }
}
