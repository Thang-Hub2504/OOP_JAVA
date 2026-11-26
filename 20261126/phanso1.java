import java.util.Scanner;
public class phanso1 {
	private int tuso, mauso;
	public phanso1() {}
	public phanso1(int tuso, int mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	}
	public int gettuso() {
		return tuso;
	}	
	public void settuso(int tuso) {
		this.tuso = tuso;
	}
	public int getmauso() {
		return mauso;
	}	
	public void setmauso(int mauso) {
		this.mauso = mauso;
	}	
	
	public void nhap(Scanner sc) {
		do{
			System.out.println("Nhap mau so: ");
				this.mauso = sc.nextInt();
		}while(this.mauso == 0);
			System.out.println("Nhap tu so: ");
			this.tuso = sc.nextInt();
	}
	
	public void hienthi() {
        System.out.println(this.tuso + "/" + this.mauso);
    }
	
	public phanso1 getTong(phanso1 ps) {
		int tumoi = this.tuso * ps.mauso + ps.tuso * this.mauso;
		int maumoi = this.mauso * ps.mauso;
		return new phanso1(tumoi, maumoi);
	}
	public phanso1 getTru(phanso1 ps) {
		int tumoi = this.tuso * ps.mauso - ps.tuso * this.mauso;
		int maumoi = this.mauso * ps.mauso;
		return new phanso1(tumoi, maumoi);
	}
	public phanso1 getNhan(phanso1 ps) {
		int tumoi = this.tuso * ps.tuso;
		int maumoi = this.mauso * ps.mauso;
		return new phanso1(tumoi, maumoi);
	}
	public phanso1 getChia(phanso1 ps) {
		int tumoi = this.tuso * ps.mauso;
		int maumoi = this.mauso * ps.tuso;
		return new phanso1(tumoi, maumoi);
	}
}

