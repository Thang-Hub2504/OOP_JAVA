public class Main{
    public static void main(String[] args){
        TacGia tg1 = new TacGia("Nguyen Nhat Anh", 1991);
        TacGia tg2 = new TacGia("Ly Thuong Kiet", 1999);

        Sach hh1 = new Sach("S01", "Mat Biec", tg1, 80000, 80);
        Sach hh2 = new Sach("S02", "Nam Quoc Son Ha", tg2, 90000, 89);
        Sach[] ds = {
                new Sach("S01", "Mat Biec", tg1, 80000, 3),
                new Sach("S02", "Cho Toi Xin Mot Ve Di Tuoi Tho", tg1, 95000, 2),
                new Sach("S03", "De Men Phieu Luu Ky", tg2, 70000, 5)
        };

        double tong = 0;
        Sach max = ds[0];
        ds[0].Xuat();
        tong += ds[0].tinhThanhTien();
        if (ds[0].getDonGia() > max.getDonGia()) {
            max = ds[0];
        }
        ds[1].Xuat();
        tong += ds[1].tinhThanhTien();
        if (ds[1].getDonGia() > max.getDonGia()) {
            max = ds[1];
        }
        ds[2].Xuat();
        tong += ds[2].tinhThanhTien();
        if (ds[2].getDonGia() > max.getDonGia()) {
            max = ds[2];
        }
        System.out.println("Tong thanh tien: " + tong);
        System.out.println("Sach co don gia cao nhat: " + max.getTenSach());

        if (ds[0].rePhanHon(ds[1])) {
            System.out.println("Sach 1 re hon sach 2");
        } else {
            System.out.println("Sach 1 khong re hon sach 2");
        }

        tg1.setNamSinh(1956);   // 2 cuon cung tro toi tg1 nen deu doi
        ds[0].Xuat();
        ds[1].Xuat();    }

}
