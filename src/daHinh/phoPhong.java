package daHinh;

public class phoPhong extends nhanSu{
    public phoPhong(String ten, String cccd, String que){
        super(ten, cccd, que);
    }
    @Override
    public double tinhLuong(int ngayCong) {
        return ngayCong * 40;
    }
}
