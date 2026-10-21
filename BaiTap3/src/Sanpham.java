public class Sanpham {
    private String MaSP;
    private String TenSP;
    private double Dongia;
    private int soluong;

    public Sanpham(){}
    public Sanpham(String MaSP, String TenSP, double Dongia,int soluong){
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Dongia = Dongia;
        this.soluong = soluong;
    }

    public String getMaSP(){
        return MaSP;
    }

    public void getMaSP(String MaSP){
        this.MaSP = MaSP;
    }

    public String getTenSP(){
        return TenSP;
    }

    public void getTenSP(String TenSP){
        this.TenSP = TenSP;
    }

    public double getDongia(){
        return Dongia;
    }

    public void setDongia(double Dongia){
        this.Dongia = Dongia;
    }

    public int getsoluong(){
        return soluong;
    }

    public void setsoluong(int soluong){
        this.soluong = soluong;
    }

    public void Xuat(){
        System.out.println("Ten san pham la : " + TenSP + " Ma san pham la: " + MaSP + " Don gia: " + Dongia + " So luong sp: " + soluong );
    }
}
