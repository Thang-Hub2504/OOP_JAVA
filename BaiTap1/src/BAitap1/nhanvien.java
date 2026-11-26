package BAitap1;

public class nhanvien {
	private String ho;
	private String ten;
	private date ngaysinh;
	private date ngaylam;
	public nhanvien() {}
	public nhanvien(String ho, String ten, date ngaysinh, date ngaylam) {
		this.ho = ho;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.ngaylam = ngaylam;
	}
	public String getho() {
		return ho;
	}
	public String getten() {
		return ten;
	}
	public date getngaysinh() {
		return ngaysinh;
	}
	public date getngaylam() {
		return ngaylam;
	}
	public void setho(String ho) {
		this.ho = ho;
	}
	public void setten(String ten) {
		this.ten = ten;
	}
	public void setngaysinh(date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public void setngaylam(date ngaylam) {
		this.ngaylam = ngaylam;
	}
	public void xuat() {
		System.out.print(" Ho: " + ho
						+ " Ten: " + ten
						+ ", "
						+ " ngay sinh: " + ngaysinh + ","
						+ " ngay vao lam: " + ngaylam );
	}
}
