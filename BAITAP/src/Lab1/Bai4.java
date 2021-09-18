package Lab1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập các hệ số của phương trình bậc 2.");
		System.out.print("Nhập a (a khác 0): ");
		double a = sc.nextDouble();
		System.out.print("Nhập b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập c: ");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - 4*a*c;
		if (delta <0) {
			System.out.println("Không tính được căn delta vì delta có giá trị âm.");
		} else {
			System.out.printf("Căn delta = %.2f", Math.sqrt(delta));
		}

	}
}
