package Lab1;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double dai, rong, chuvi, dientich,canhnhonhat;
		System.out.print("Nhập chiều dài: ");
		dai = sc.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		rong = sc.nextDouble();
		//
		chuvi = (dai + rong) * 2;
		dientich = dai * rong;
		canhnhonhat = Math.min(dai, rong);
		//
		System.out.printf("Chu vi hình chữ nhật: %.2f \n",chuvi);
		System.out.printf("Diện tích hình chữ nhật: %.2f \n",dientich);
		System.out.printf("Cạnh nhỏ nhất: %.2f", canhnhonhat);
	}

}
