package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * JRadioButton의 기본은 사각형 체크된다
 * 만약 원을 선택하면 자동으로 시각형이 해제된다
 * 
 * 켄버스의 기본낵은 연보라색으로 한다
 * 
 * x1L, y1L, x2L, y2L에 좌표를 입력하고 그리기버튼 누르면 원하는 도형으로 캔버스에 그려진다
 *  
 */

import java.time.temporal.JulianFields;
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

public class MsPaint extends JFrame implements ActionListener, ItemListener {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	private int x1, y1, x2, y2, z1, z2;
	private int shape;
	private int fillColor;
	public List<ShapeDTO> list = new ArrayList<ShapeDTO>();
	private Point firstP, lastP;
	private Image bufferImg;
	private Graphics bufferG;

	public MsPaint(String title) {
		JPanel northP = new JPanel(new GridLayout(1, 13, 2, 0));
		x1L = new JLabel("X1 :", JLabel.RIGHT);
		y1L = new JLabel("Y1 :", JLabel.RIGHT);
		x2L = new JLabel("X2 :", JLabel.RIGHT);
		y2L = new JLabel("Y2 :", JLabel.RIGHT);
		z1L = new JLabel("Z1 :", JLabel.RIGHT);
		z2L = new JLabel("Z2 :", JLabel.RIGHT);

		x1T = new JTextField("0", 4);
		y1T = new JTextField("0", 4);
		x2T = new JTextField("0", 4);
		y2T = new JTextField("0", 4);
		z1T = new JTextField("50", 4);
		z2T = new JTextField("50", 4);
		x1 = Integer.parseInt(x1T.getText());
		y1 = Integer.parseInt(y1T.getText());
		x2 = Integer.parseInt(x2T.getText());
		y2 = Integer.parseInt(y2T.getText());

		fill = new JCheckBox("채우기", false);

		northP.add(x1L);
		northP.add(x1T);
		northP.add(y1L);
		northP.add(y1T);
		northP.add(x2L);
		northP.add(x2T);
		northP.add(y2L);
		northP.add(y2T);
		northP.add(z1L);
		northP.add(z1T);
		northP.add(z2L);
		northP.add(z2T);
		northP.add(fill);

		JPanel southP = new JPanel(new GridLayout(1, 6, 10, 0));
		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형");
		roundRect = new JRadioButton("둥근사각형");
		pen = new JRadioButton("연필");
		ButtonGroup bg = new ButtonGroup();
		bg.add(line);
		bg.add(circle);
		bg.add(rect);
		bg.add(roundRect);
		bg.add(pen);

		String[] color = { "빨강", "초록", "파랑", "보라", "하늘" };
		combo = new JComboBox(color);

		draw = new JButton("그리기");

		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		southP.add(combo);
		southP.add(draw);

		// 캔버스
		can = new DrCanvas() {
			@Override
			public void update(Graphics g) {
				Dimension d = this.getSize();

				if (bufferG == null) {
					bufferImg = this.createImage(d.width, d.height);
					bufferG = bufferImg.getGraphics();
				}

				bufferG.setColor(this.getBackground());
				bufferG.fillRect(0, 0, d.width, d.height);

				for (ShapeDTO dto : list) {
					if (dto.getFillColor() == 1)
						g.setColor(Color.RED);
					else if (dto.getFillColor() == 2)
						g.setColor(Color.GREEN);
					else if (dto.getFillColor() == 3)
						g.setColor(Color.BLUE);
					else if (dto.getFillColor() == 4)
						g.setColor(Color.MAGENTA);
					else if (dto.getFillColor() == 5)
						g.setColor(Color.CYAN);
					else
						g.setColor(Color.BLACK);

					if (dto.getShape() == 1) {
						g.drawLine(dto.getX1(), dto.getY1(), dto.getX2(), dto.getY2());
					} else if (dto.getShape() == 2) {
						if (dto.isFill())
							g.fillOval(Math.min(dto.getX1(), dto.getX2()), Math.min(dto.getY1(), dto.getY2()),
									Math.abs(dto.getX2() - dto.getX1()), Math.abs(dto.getY2() - dto.getY1()));
						else
							g.drawOval(Math.min(dto.getX1(), dto.getX2()), Math.min(dto.getY1(), dto.getY2()),
									Math.abs(dto.getX2() - dto.getX1()), Math.abs(dto.getY2() - dto.getY1()));
					} else if (dto.getShape() == 3) {
						if (dto.isFill())
							g.fillRect(Math.min(dto.getX1(), dto.getX2()), Math.min(dto.getY1(), dto.getY2()),
									Math.abs(dto.getX2() - dto.getX1()), Math.abs(dto.getY2() - dto.getY1()));
						else
							g.drawRect(Math.min(dto.getX1(), dto.getX2()), Math.min(dto.getY1(), dto.getY2()),
									Math.abs(dto.getX2() - dto.getX1()), Math.abs(dto.getY2() - dto.getY1()));
					} else if (dto.getShape() == 4) {
						if (dto.isFill())
							g.fillRoundRect(Math.min(dto.getX1(), dto.getX2()), Math.min(dto.getY1(), dto.getY2()),
									Math.abs(dto.getX2() - dto.getX1()), Math.abs(dto.getY2() - dto.getY1()),
									dto.getZ1(), dto.getZ2());
						else
							g.drawRoundRect(Math.min(dto.getX1(), dto.getX2()), Math.min(dto.getY1(), dto.getY2()),
									Math.abs(dto.getX2() - dto.getX1()), Math.abs(dto.getY2() - dto.getY1()),
									dto.getZ1(), dto.getZ2());
					} else if (pen.isSelected()) {
						g.drawLine(dto.getX1(), dto.getY1(), dto.getX2(), dto.getY2());
					}
				} // for

				if (fillColor == 1)
					g.setColor(Color.RED);
				else if (fillColor == 2)
					g.setColor(Color.GREEN);
				else if (fillColor == 3)
					g.setColor(Color.BLUE);
				else if (fillColor == 4)
					g.setColor(Color.MAGENTA);
				else if (fillColor == 5)
					g.setColor(Color.CYAN);
				else
					g.setColor(Color.BLACK);

				x1 = Integer.parseInt(x1T.getText().trim());
				y1 = Integer.parseInt(y1T.getText().trim());
				x2 = Integer.parseInt(x2T.getText().trim());
				y2 = Integer.parseInt(y2T.getText().trim());
				z1 = Integer.parseInt(z1T.getText().trim());
				z2 = Integer.parseInt(z2T.getText().trim());

				if (shape == 1) {
					g.drawLine(x1, y1, x2, y2);
				} else if (shape == 2) {
					if (fill.isSelected())
						g.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
					else
						g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (shape == 3) {
					if (fill.isSelected())
						g.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
					else
						g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (shape == 4) {
					if (fill.isSelected())
						g.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1,
								z2);
					else
						g.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1,
								z2);
				} else if (pen.isSelected()) {
					g.drawLine(x1, y1, x2, y1);
				}
				
				paint(g);

			}// update

			@Override
			public void paint(Graphics g) {
				g.drawImage(bufferImg, 0, 0, this);
			}

		};
		can.setBackground(new Color(255, 200, 255));

		// 이벤트
		line.addActionListener(this);
		circle.addActionListener(this);
		rect.addActionListener(this);
		roundRect.addActionListener(this);
		draw.addActionListener(this);
		combo.addItemListener(this);
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				x1T.setText(Integer.toString(e.getX()));
				y1T.setText(Integer.toString(e.getY()));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				if(x1T.getText().equals(x2T.getText()) && y1T.getText().equals(y2T.getText()))
					return;
				
				ShapeDTO dto = new ShapeDTO(x1, y1, x2, y2, z1, z2, fill.isSelected(), shape, fillColor);
				
				list.add(dto);
			}
		});

		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
					x2T.setText(Integer.toString(e.getX()));
					y2T.setText(Integer.toString(e.getY()));

					can.repaint();
					
					if(pen.isSelected()) {
						ShapeDTO dto = new ShapeDTO(x1, y1, x2, y2, z1, z2, fill.isSelected(), shape, fillColor);
						x1T.setText(x2T.getText());
						y1T.setText(y2T.getText());
					}
				
			}
		});

	Container con = this.getContentPane();con.add("North",northP);con.add("South",southP);con.add("Center",can);

	setBounds(200, 100, 1000, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem().equals("빨강")) {
			fillColor = 1;
		} else if (e.getItem().equals("초록")) {
			fillColor = 2;
		} else if (e.getItem().equals("파랑")) {
			fillColor = 3;
		} else if (e.getItem().equals("보라")) {
			fillColor = 4;
		} else if (e.getItem().equals("하늘")) {
			fillColor = 5;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == line) {
			shape = 1;
		} else if (e.getSource() == circle) {
			shape = 2;
		} else if (e.getSource() == rect) {
			shape = 3;
		} else if (e.getSource() == roundRect) {
			shape = 4;
		} else if (e.getSource() == draw) {
			ShapeDTO dto = new ShapeDTO(x1, y1, x2, y2, z1, z2, fill.isSelected(), shape, fillColor);
			list.add(dto);
			can.repaint();
		} else if (e.getSource() == pen) {
			shape = 0;
		}
	}

	public static void main(String[] args) {
		new MsPaint("미니 그림판");

	}

}
