package report_0113;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/*[그림판 만들기] 
 * JRadioButton의 default는 사각형 
 * Canvas의 기본색은 연보라색
 * x1T, y1T, x2T, y2T, z1T, z2T 좌표를 입력하고 그리기 버튼을 누르면 원하는 도형으로 Canvas에 그려짐
 * 색깔은 JComboBox에서 선택
 * 둥근사각형의 구부러지는 각은 50,50으로
 * 도형 누적 - ArrayList로 저장해놓고 list를 뿌려줘야 함
 * 도형 1개에 대한 정보 : 좌표6개, 채우기, 도형 모양, 색 => ShapeDTO
 */

//JFrame - BorderLayout(동서남북)
public class MsPaint extends JFrame {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	private List<ShapeDTO> list;
	
	public MsPaint(String title) {
		x1L = new JLabel("x1");
		y1L = new JLabel("y1");
		x2L = new JLabel("x2");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1");
		z2L = new JLabel("z2");
		
		x1T = new JTextField("0",4);
		y1T = new JTextField("0",4);
		x2T = new JTextField("0",4);
		y2T = new JTextField("0",4);
		z1T = new JTextField("50",4);
		z2T = new JTextField("50",4);
		
		fill = new JCheckBox("채우기");

		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형", true);
		roundRect = new JRadioButton("둥근사각형");
		pen = new JRadioButton("펜");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);
		
		String rainbow[] = { "빨강색", "주황색", "노랑색", "초록색", "파랑색", "남색", "보라색" };
		combo = new JComboBox<String>(rainbow);
		draw = new JButton("그리기");
		
		can = new DrCanvas(this); //1) DrCanvas()생성할때 생성자로 this(나, MsPaint객체)를 넘겨주겠다
		
		list = new ArrayList<ShapeDTO>(); 
		
		JPanel northP = new JPanel();//FlowLayout
		northP.add(x1L); northP.add(x1T);
		northP.add(y1L); northP.add(y1T);
		northP.add(x2L); northP.add(x2T);
		northP.add(y2L); northP.add(y2T);
		northP.add(z1L); northP.add(z1T);
		northP.add(z2L); northP.add(z2T);
		northP.add(fill);
		
		JPanel southP = new JPanel();
		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		southP.add(combo);
		southP.add(draw);
		
		Container c = this.getContentPane();
		c.add("North", northP);
		c.add("South", southP);
		c.add("Center", can);
		
		setTitle(title);
		setBounds(900,100,700,500);
		setVisible(true); //-->제일처음 paint() 호출, if>getX1T()에 값이 없는데 parseInt해서 에러
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//이벤트, 익명이너클래스 사용하자(버튼누를때 한번만 사용하니)
		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//this.repaint(); -ERROR. this는 MsPaint가 아니라 익명이너클래스를 가르킴
				can.repaint(); 
			}
		});
		
//익명이너클래스, can에서 이벤트가 발생 주의		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//x1T, y1T 찍히게
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
			}
			
			@Override //마우스에서 손을 뗐을때	=> 도형이 만들어지고 도형에 대한 모든정보를 ShapeDTO에 보관해야 함
			public void mouseReleased(MouseEvent e) {
				//getX()값을 x2T에게 줘라
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				if(x1T.getText().equals(x2T.getText()) && y1T.getText().equals(y2T.getText()))
					return;
				
/// DTO안에 도형정보가 저장됨				
				ShapeDTO dto = new ShapeDTO();
				//좌표
				dto.setX1(Integer.parseInt(x1T.getText().trim())); //trim(): 양끝의 공백을 제거
				dto.setY1(Integer.parseInt(y1T.getText().trim()));
				dto.setX2(Integer.parseInt(x2T.getText().trim()));
				dto.setY2(Integer.parseInt(y2T.getText().trim()));
				dto.setZ1(Integer.parseInt(z1T.getText().trim()));
				dto.setZ2(Integer.parseInt(z2T.getText().trim()));
				
				//채우기
				dto.setFill(fill.isSelected());
				
				//도형
				if(line.isSelected()) dto.setShape(Figure.LINE);
				else if(circle.isSelected()) dto.setShape(Figure.CIRCLE);
				else if(rect.isSelected()) dto.setShape(Figure.RECT);
				else if(roundRect.isSelected()) dto.setShape(Figure.ROUNDRECT);
				else if(pen.isSelected()) dto.setShape(Figure.PEN);
				
				//도형
				dto.setColor(combo.getSelectedIndex());
///				
				list.add(dto);
				//System.out.println("list의 크기= = "+list.size());
			}
		});
		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				
				can.repaint(); //paint된걸 List로 저장해줘야 함
				
				//연필
				if(pen.isSelected()) {
					ShapeDTO dto = new ShapeDTO();
					
					//좌표
					dto.setX1(Integer.parseInt(x1T.getText().trim()));
					dto.setY1(Integer.parseInt(y1T.getText().trim()));
					dto.setX2(Integer.parseInt(x2T.getText().trim()));
					dto.setY2(Integer.parseInt(y2T.getText().trim()));
					dto.setZ1(Integer.parseInt(z1T.getText().trim()));
					dto.setZ2(Integer.parseInt(z2T.getText().trim()));
					
					//채우기
					dto.setFill(fill.isSelected());
					
					//도형
					dto.setShape(Figure.PEN);
					
					//책
					dto.setColor(combo.getSelectedIndex());
					
					list.add(dto);
					
					x1T.setText(x2T.getText());
					y1T.setText(y2T.getText());
				}
			}
		});
	}
	
	public JTextField getX1T(){
		return x1T;
	}

	public JTextField getY1T() {
		return y1T;
	}

	public JTextField getX2T() {
		return x2T;
	}

	public JTextField getY2T() {
		return y2T;
	}

	public JTextField getZ1T() {
		return z1T;
	}

	public JTextField getZ2T() {
		return z2T;
	}
	
	public JComboBox<String> getCombo(){
		return combo;
	}
	
	public JCheckBox getFill(){
		return fill;
	}
	
	public JRadioButton getLine(){
		return line;
	}
	
	public JRadioButton getCircle(){
		return circle;
	}
	
	public JRadioButton getRect(){
		return rect;
	}
	
	public JRadioButton getRoundRect(){
		return roundRect;
	}
	
	public JRadioButton getPen() {
		return pen;
	}
	
	public List<ShapeDTO> getList(){
		return list;
	}

	public static void main(String[] args) {
		new MsPaint("���� �׸���");
	}

}













