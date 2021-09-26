package TinhTong;

import java.awt.*;
import java.awt.event.*;

public class TinhTongGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame fr = new Frame("Tính tổng A và B");
		fr.setBounds(0,0, 330, 250);
		fr.setVisible(true);
		fr.setLayout(null);
		
		//Khai báo thành phần
		Label lbA = new Label("A = ");
		Label lbB = new Label("B = ");
		Label lbKQ = new Label("Kết quả: ");
		
		TextField txtA = new TextField();	
		TextField txtB = new TextField();
		TextField txtKQ = new TextField();
		
		Button btnCong = new Button("Cộng");
		
		// Chỉnh vị trí
		lbA.setBounds(30,30,20,50);
		txtA.setBounds(55,45,80,20);
		
		lbB.setBounds(170,30,20,50);
		txtB.setBounds(195,45,80,20);
		
		btnCong.setBounds(105,80,100,35);
		
		lbKQ.setBounds(30,132,50,50);
		txtKQ.setBounds(80,145,190,25);
		
		//Add
		fr.add(lbA);	fr.add(txtA);
		fr.add(lbB);	fr.add(txtB);
		fr.add(btnCong);
		fr.add(lbKQ);	fr.add(txtKQ);
		
		//Xử lí event btnCong
		ActionListener sukienCong =  new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strA = txtA.getText();
				String strB = txtB.getText();
				//đổi sang double
				double A = Double.parseDouble(strA);
				double B = Double.parseDouble(strB);
				//tính tổng
				double C = A + B;
				//in kết quả
				txtKQ.setText(String.valueOf(C));
			}
		};
		btnCong.addActionListener(sukienCong);
		
		//đóng giao diện
		fr.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0); }
		});
	}

}
