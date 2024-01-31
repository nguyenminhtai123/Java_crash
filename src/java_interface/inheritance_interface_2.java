package java_interface;

public class inheritance_interface_2 implements example, example_2{
    @Override
    public void setThuong(int cccd, double doanhThu) {
        System.out.println(cccd + " " + doanhThu);
    }
    @Override
    public void information(String name, String phone, int year) {
        System.out.println(name + " " + phone + " " + year);
    }
    @Override
    public double tinhLuong(double luongNgay, int soLuongNgay) {
        return luongNgay * soLuongNgay;
    }
}
