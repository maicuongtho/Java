package NGUYENNHATTRUONG;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Cuasochinh extends Frame {
	TextField txtA, txtB, txtKQ;
	Label lbA, lbB, lbKQ;
	Button btnCong;
	//Hàm tạo
	public Cuasochinh() {
		setLayout(null);
		setBounds(0,0,325,250);
		setTitle("Tính tổng 2 số");
		setVisible(true);
		//đưa các điều khiển vào frame
		lbA = new Label("A = ");
		lbB = new Label("B = ");
		lbKQ = new Label("Kết quả: ");
		txtA = new TextField();	
		txtB = new TextField();
		txtKQ = new TextField();
		btnCong = new Button("Cộng");
		
		//add
		add(lbA);	add(txtA);
		add(lbB);	add(txtB);
		add(btnCong);
		add(lbKQ);	add(txtKQ);
		
		//Chỉnh vị trí
		lbA.setBounds(30,30,20,50);
		txtA.setBounds(55,45,80,20);
		lbB.setBounds(170,30,20,50);
		txtB.setBounds(195,45,80,20);
		btnCong.setBounds(105,80,100,35);
		lbKQ.setBounds(30,132,50,50);
		txtKQ.setBounds(80,145,190,25);
		
		//xử lí nút tính tổng
		btnCong.addActionListener(new bolangnghe_XL_Cong());
		// xử lí đóng giao diện
		addWindowListener(new bolangnghe_XL_cuaso());
	}
	//Sự kiện cộng 2 số
	class bolangnghe_XL_Cong implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String strA = txtA.getText();
			String strB = txtB.getText();
			//đổi sang double
			int A = Integer.parseInt(strA);
			int B = Integer.parseInt(strB);
			//tính tổng
			int C = A + B;
			//in kết quả
			txtKQ.setText(String.valueOf(C));
		}
	}
	//Thiết lập đóng giao diện
	class bolangnghe_XL_cuaso implements WindowListener{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub	
		}
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub	
		}
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub	
		}
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub	
		}
	}

}
