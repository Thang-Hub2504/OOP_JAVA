package BAitap1;

public class main {
	public static void main(String[] args) {
		date ns = new date(25, 10, 2004);
		date nl = new date(30, 8, 2026);
		nhanvien nv = new nhanvien("Nguyen", "Thang", ns, nl);
		nv.xuat();
	}
}