public class Hinhchunhat {
    private double ChieuDai;
    private double ChieuRong;

    public Hinhchunhat(){}
    public Hinhchunhat(double ChieuDai, double ChieuRong){
        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }

    public double getChieuDai(){
        return ChieuDai;
    }

    public void setChieuDai(double ChieuDai){
        this.ChieuDai = ChieuDai;
    }

    public double getChieuRong(){
        return ChieuRong;
    }

    public void setChieuRong(double ChieuRong){
        this.ChieuRong =  ChieuRong;
    }

    public double getChuviHCN(){
        return (ChieuDai + ChieuRong)*2;
    }

    public double getDientichHCN(){
        return (ChieuDai * ChieuRong);
    }

    public double getCanhhuyenHCN(){
        return Math.sqrt((ChieuDai*ChieuDai + ChieuRong*ChieuRong));
    }

    public void Xuat(){
        System.out.println("Chieu Dai cua HCN la: " + ChieuDai + " _ " + "Chieu Rong cua HCN la: " + ChieuRong );
        System.out.println("Chu vi cua HCN la: " + getChuviHCN() + " _ " + "Dien tich cua HCN la: " + getDientichHCN());
        System.out.println("Canh huyen cua HCN la: " + getCanhhuyenHCN());
    }

}
