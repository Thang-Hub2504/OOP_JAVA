package BAitap1;

public class date {
	private int ngay, thang, nam;
	public date() {}
	public date(int ngay, int thang, int nam){
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getngay() { 
		return ngay; 
	}
	public int getthang() { 
		return thang; 
	}
	public int getnam() { 
		return nam; 
	}
	public void setngay(int ngay) {
		this.ngay = ngay;
	}
	public void setthang(int thang) {
		this.thang = thang;
	}
	public void setnam(int nam) {
		this.nam = nam;
	}
	
	public boolean checkDate(int ngay, int thang, int nam) {
	    if (nam <= 1000 || thang < 1 || thang > 12 || ngay < 1) {
	        return false;
	    }
	    int maxNgay;
	    if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
	        maxNgay = 30;
	    } else if (thang == 2) {
	        boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
	        maxNgay = namNhuan ? 29 : 28;
	    } else {
	        maxNgay = 31;
	    }
	    return ngay <= maxNgay;
	}

	public String toString() {
		return String.format("%02d/%02d/%d", ngay, thang, nam);
	}
	
}
