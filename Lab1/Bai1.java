package Lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoten;
		double diem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		hoten = sc.nextLine();
		System.out.print("Nhập điểm: ");
		diem = sc.nextDouble();
		System.out.printf("%s %.2f điểm",hoten,diem);
	}	

}
