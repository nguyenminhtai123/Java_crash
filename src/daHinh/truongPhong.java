package daHinh;

public class truongPhong extends nhanSu{
    public truongPhong(String ten, String cccd, String que){
        super(ten, cccd, que);
    }

    public truongPhong(String ten, String cccd){
        super(ten, cccd);
    }
    @Override
    public double tinhLuong(int ngayCong) {
        return ngayCong * 50;
    }
}
