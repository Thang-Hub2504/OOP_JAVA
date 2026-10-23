public class Sach {
    private String MaSach;
    private String TenSach;
    private TacGia Tacgia;
    private double DonGia;
    private int SoLuong;

    public Sach(){}
    public Sach(String MaSach, String TenSach,TacGia tacgia,double DonGia,int SoLuong){
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Tacgia = tacgia;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }

    public String getMaSach(){
        return MaSach;
    }
    public String getTenSach(){
        return TenSach;
    }
    public TacGia getTacgia(){
        return Tacgia;
    }
    public double getDonGia(){
        return DonGia;
    }
    public int getSoLuong(){
        return SoLuong;
    }

    public void setMaSach(String MaSach){
        this.MaSach = MaSach;
    }
    public void setTenSach(String TenSach){
        this.TenSach = TenSach;
    }
    public void settacgia(TacGia Tacgia){
        this.Tacgia = Tacgia;
    }
    public void setDonGia(double DonGia){
        this.DonGia = DonGia;
    }
    public void setSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public double tinhThanhTien() {
        return DonGia * SoLuong;
    }
    public boolean rePhanHon(Sach other) {
        return this.DonGia < other.DonGia;
    }
    public void Xuat(){
        System.out.println( MaSach + " _ " + TenSach + " _ " + Tacgia + " _ " + DonGia + " _ " + SoLuong + " _ " + tinhThanhTien());
    }
}
