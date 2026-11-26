import java.util.Scanner;
public class Main{
	    public static void main(String[] args){
	    	Scanner sc = new Scanner(System.in);
	    	phanso1 ps1 = new phanso1();
	    	phanso1 ps2 = new phanso1();
	    	
	    	System.out.println("Nhap phan so 1");
	    		ps1.nhap(sc);
	    	System.out.println("Nhap phan so 2");
	    		ps2.nhap(sc);
	    	System.out.print("Tong: ");
	    		ps1.getTong(ps2).hienthi();
	    	System.out.print("Hieu: ");
	    		ps1.getTru(ps2).hienthi();
	    	System.out.print("Tich: ");
	    		ps1.getNhan(ps2).hienthi();
	    	System.out.print("Thuong: ");
	    		ps1.getChia(ps2).hienthi();
	    }
	}

