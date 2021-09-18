package Lab1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập cạnh của hình lập phương: ");
		double canh = sc.nextDouble();
		double thetich = Math.pow(canh,3);
		System.out.printf("Thể tích của hình lập phương là: %.2f", thetich);
	}
}
