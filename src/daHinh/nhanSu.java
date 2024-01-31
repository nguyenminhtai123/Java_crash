package daHinh;

public abstract class nhanSu {
    private String ten;
    private String cccd;
    private String que;

    public nhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public nhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public nhanSu() {

    }


    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }
}
