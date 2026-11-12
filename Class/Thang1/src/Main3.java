import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Nhap canh 1: ");
			float c1 = sc.nextFloat();
			System.out.println("Nhap canh 2: ");
			float c2 = sc.nextFloat();
			System.out.println("Nhap canh 3: ");
			float c3 = sc.nextFloat();
			sc.close();
			
			if(c1 == c2 && c2 == c3) {
				System.out.println("Day la tam giac deu");
			}else if(c1 == c2 && c1*c1 + c2*c2 == c3*c3 || c1 == c3 && c1*c1 + c3*c3 == c2*c2 || c3 == c3 && c3*c3 + c2*c2 == c1*c1) {
				System.out.print("Day la tam gia vuong can");
			}else if( c1 == c2 || c1 == c3 || c2 == c3) {
				System.out.println("Day la tam giac can");
			}else if( c1*c1 + c2*c2 == c3*c3 || c1*c1 + c3*c3 == c2*c2 || c2*c2 + c3*c3 == c1*c1) {
				System.out.println("Day la tam giac vuong");	
			}else {
				System.out.println("Day la tam giac thuong");
			}
			
	}
}
