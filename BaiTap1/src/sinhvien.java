public class sinhvien {
    private String MaSV;
    private String HoTen;
    private double DiemTb;


        public sinhvien(String MaSV, String HoTen, double DiemTb){
            this.MaSV = MaSV;
            this.HoTen = HoTen;
            this.DiemTb = DiemTb;
        }
        public String getHoTen(){
            return HoTen;
        }
        public void setHoTen(String HoTen){
            this.HoTen = HoTen;
        }
        public void Xuat(){
            System.out.println(MaSV + " - " + HoTen + " - " + DiemTb);
        }
    }

