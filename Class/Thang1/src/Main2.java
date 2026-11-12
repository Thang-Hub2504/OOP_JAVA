import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu can nhap ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap so nguyen thu " + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
		sc.close();
		int Tong = 0;
		for(int i = 0; i<n; i++) {
			Tong = arr[i] + Tong;
		}
		System.out.print("Tong tu 1 -> n la: " + Tong );
	}
}
