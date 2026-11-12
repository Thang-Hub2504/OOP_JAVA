import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap so nguyen thu " + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		 int demAm = 0, demKhong = 0, demDuong = 0;

	        for (int i = 0; i < n; i++) {
	            if (arr[i] == 0) {
	                demKhong++;
	            } else if (arr[i] < 0) {
	                demAm++;
	            } else {
	                demDuong++;
	            }
	        }
	        System.out.println("Co " + demKhong + " phan tu trong mang = 0");
	        System.out.println("Co " + demAm + " phan tu trong mang < 0");
	        System.out.println("Co " + demDuong + " phan tu trong mang > 0");
	}
}
