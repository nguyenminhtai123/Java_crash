package java_interface;

public class inheritance_interface implements example{

    @Override
    public void information(String ten, String cccd, int namSinh) {
        System.out.println(ten + " " + cccd + " " + namSinh);
    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayLuong) {
        return luongNgay * soNgayLuong;
    }
}
