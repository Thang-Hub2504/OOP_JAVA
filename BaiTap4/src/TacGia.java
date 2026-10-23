public class TacGia {
    private String TenTG;
    private int NamSinh;

    public TacGia(){}

    public TacGia(String TenTG, int NamSinh){
        this.TenTG = TenTG;
        this.NamSinh = NamSinh;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String TenTG){
        this.TenTG = TenTG;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh){
        this.NamSinh = NamSinh;
    }

    public String toString(){
        return TenTG + " (" + NamSinh + ")";
    }
}