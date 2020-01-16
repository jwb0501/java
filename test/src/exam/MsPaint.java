package exam;

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
/*[洹몃┝�뙋 留뚮뱾湲�] 
 * JRadioButton�쓽 default�뒗 �궗媛곹삎 
 * Canvas�쓽 湲곕낯�깋�� �뿰蹂대씪�깋
 * x1T, y1T, x2T, y2T, z1T, z2T 醫뚰몴瑜� �엯�젰�븯怨� 洹몃━湲� 踰꾪듉�쓣 �늻瑜대㈃ �썝�븯�뒗 �룄�삎�쑝濡� Canvas�뿉 洹몃젮吏�
 * �깋源붿� JComboBox�뿉�꽌 �꽑�깮
 * �뫁洹쇱궗媛곹삎�쓽 援щ��윭吏��뒗 媛곸� 50,50�쑝濡�
 * �룄�삎 �늻�쟻 - ArrayList濡� ���옣�빐�넃怨� list瑜� 肉뚮젮以섏빞 �븿
 * �룄�삎 1媛쒖뿉 ���븳 �젙蹂� : 醫뚰몴6媛�, 梨꾩슦湲�, �룄�삎 紐⑥뼇, �깋 => ShapeDTO
 */

//JFrame - BorderLayout(�룞�꽌�궓遺�)
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
		
		fill = new JCheckBox("梨꾩슦湲�");

		line = new JRadioButton("�꽑");
		circle = new JRadioButton("�썝");
		rect = new JRadioButton("�궗媛곹삎", true);
		roundRect = new JRadioButton("�뫁洹쇱궗媛곹삎");
		pen = new JRadioButton("�렂");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);
		
		String rainbow[] = { "鍮④컯�깋", "二쇳솴�깋", "�끂�옉�깋", "珥덈줉�깋", "�뙆�옉�깋", "�궓�깋", "蹂대씪�깋" };
		combo = new JComboBox<String>(rainbow);
		draw = new JButton("洹몃━湲�");
		
		can = new DrCanvas(this); //1) DrCanvas()�깮�꽦�븷�븣 �깮�꽦�옄濡� this(�굹, MsPaint媛앹껜)瑜� �꽆寃⑥＜寃좊떎
		
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
		setVisible(true); //-->�젣�씪泥섏쓬 paint() �샇異�, if>getX1T()�뿉 媛믪씠 �뾾�뒗�뜲 parseInt�빐�꽌 �뿉�윭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				can.repaint(); 
			}
		});
		
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
			}
			
			@Override //留덉슦�뒪�뿉�꽌 �넀�쓣 �뿉�쓣�븣	=> �룄�삎�씠 留뚮뱾�뼱吏�怨� �룄�삎�뿉 ���븳 紐⑤뱺�젙蹂대�� ShapeDTO�뿉 蹂닿��빐�빞 �븿
			public void mouseReleased(MouseEvent e) {
				//getX()媛믪쓣 x2T�뿉寃� 以섎씪
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				if(x1T.getText().equals(x2T.getText()) && y1T.getText().equals(y2T.getText()))
					return;
				
/// DTO�븞�뿉 �룄�삎�젙蹂닿� ���옣�맖				
				ShapeDTO dto = new ShapeDTO();
				//醫뚰몴
				dto.setX1(Integer.parseInt(x1T.getText().trim())); //trim(): �뼇�걹�쓽 怨듬갚�쓣 �젣嫄�
				dto.setY1(Integer.parseInt(y1T.getText().trim()));
				dto.setX2(Integer.parseInt(x2T.getText().trim()));
				dto.setY2(Integer.parseInt(y2T.getText().trim()));
				dto.setZ1(Integer.parseInt(z1T.getText().trim()));
				dto.setZ2(Integer.parseInt(z2T.getText().trim()));
				
				//梨꾩슦湲�
				dto.setFill(fill.isSelected());
				
				//�룄�삎
				if(line.isSelected()) dto.setShape(Figure.LINE);
				else if(circle.isSelected()) dto.setShape(Figure.CIRCLE);
				else if(rect.isSelected()) dto.setShape(Figure.RECT);
				else if(roundRect.isSelected()) dto.setShape(Figure.ROUNDRECT);
				else if(pen.isSelected()) dto.setShape(Figure.PEN);
				
				//�룄�삎
				dto.setColor(combo.getSelectedIndex());
///				
				list.add(dto);
				//System.out.println("list�쓽 �겕湲�= = "+list.size());
			}
		});
		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				
				can.repaint(); //paint�맂嫄� List濡� ���옣�빐以섏빞 �븿
				
				//�뿰�븘
				if(pen.isSelected()) {
					ShapeDTO dto = new ShapeDTO();
					
					//醫뚰몴
					dto.setX1(Integer.parseInt(x1T.getText().trim()));
					dto.setY1(Integer.parseInt(y1T.getText().trim()));
					dto.setX2(Integer.parseInt(x2T.getText().trim()));
					dto.setY2(Integer.parseInt(y2T.getText().trim()));
					dto.setZ1(Integer.parseInt(z1T.getText().trim()));
					dto.setZ2(Integer.parseInt(z2T.getText().trim()));
					
					//梨꾩슦湲�
					dto.setFill(fill.isSelected());
					
					//�룄�삎
					dto.setShape(Figure.PEN);
					
					//梨�
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
		new MsPaint("占쏙옙占쏙옙 占쌓몌옙占쏙옙");
	}

}













