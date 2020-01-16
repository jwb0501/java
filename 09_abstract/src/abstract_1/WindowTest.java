package abstract_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {
	
	public WindowTest() {
		setBounds(700, 200, 500, 1000);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();//생성
		//이미지 불러오기
		Image img = t.getImage("D:\\java_se\\workspace\\09_abstract\\정나연.jpg");
		g.drawImage(img, 20, 100, this);//이미지 그리기
	}
	
	public static void main(String[] args) {
		new WindowTest();

	}

}
