import java.util.Scanner;
public class Main {
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
			int Max = 0;
			for(int i=0; i<n;i++) {
				if(arr[i] = Max) {
					Max = arr[i];
				}
			}
			System.out.print("So nguyen lon nhat la: " + Max);
	}
}
