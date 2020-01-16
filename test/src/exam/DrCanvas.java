package exam;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class DrCanvas extends Canvas {
	private MsPaint msPaint; //3) 생성자로 받아온 객체 저장시켜라
	private Image bufferImg;
	private Graphics bufferG;
				/* MsPaint객체 정보를 받아오는 방법!!!!!!!!!!!!! */
	public DrCanvas(MsPaint msPaint) { //2) 생성자로 객체받아옴!!
		this.msPaint = msPaint;
		this.setBackground(new Color(255,225,255));
	}
	
	@Override
	///	public void paint(Graphics g) { ///repaint되었으니 지워지고 다시그리기 반복 
	///더블버퍼링 paint->update, paint()메소드 따로 생성
	public void update(Graphics g) {
		Dimension d = this.getSize();//Dimension:사각영역에 대한 정보를 가지고 있음, this의 크기를 가져와서 d에 저장해라
		
		if(bufferG == null) {//버퍼G가 맨처음 생성되면
			bufferImg = this.createImage(d.width, d.height); //buffrImg를 만들어라, this는 캔버스를 말함
			bufferG = bufferImg.getGraphics();
		}//createImage를 한번만 수행하기 위해
		
		//같은 색깔의 바탕색으로 Canvas 채운다	
		bufferG.setColor(this.getBackground());
		bufferG.fillRect(0, 0, d.width, d.height);
		
		//전에 그려서 ArrayList에 보관한 ShapeDTO 하나씩 꺼내서 다시 그리기
		legacy(g);
		
		//새로운 도형 그리기
		//좌표
		int x1 = Integer.parseInt(msPaint.getX1T().getText().trim());
		int y1 = Integer.parseInt(msPaint.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint.getZ2T().getText().trim());
		
		//색
		switch(msPaint.getCombo().getSelectedIndex()) {
		case 0 : bufferG.setColor(new Color(255,0,0)); break;
		case 1 : bufferG.setColor(new Color(200,91,2)); break;
		case 2 : bufferG.setColor(new Color(255,255,0)); break;
		case 3 : bufferG.setColor(new Color(0,255,0)); break;
		case 4 : bufferG.setColor(new Color(0,0,255)); break;
		case 5 : bufferG.setColor(new Color(24,2,176)); break;
		case 6 : bufferG.setColor(new Color(255,0,255)); break;
		}
		
		//도형
		if(msPaint.getFill().isSelected()) { //true이면 채워진 도형
			if(msPaint.getLine().isSelected())
				bufferG.drawLine(x1, y1, x2, y2);
			else if(msPaint.getCircle().isSelected())
				bufferG.fillOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(msPaint.getRect().isSelected())
				bufferG.fillRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(msPaint.getRoundRect().isSelected())
				bufferG.fillRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			else if(msPaint.getPen().isSelected())
				bufferG.drawLine(x1, y1, x2, y2);
			
		}else {//빈 도형
			if(msPaint.getLine().isSelected())
				bufferG.drawLine(x1, y1, x2, y2);
			else if(msPaint.getCircle().isSelected())
				bufferG.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(msPaint.getRect().isSelected())
				bufferG.drawRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(msPaint.getRoundRect().isSelected())
				bufferG.drawRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			else if(msPaint.getPen().isSelected())
				bufferG.drawLine(x1, y1, x2, y2);
			
		}
		
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(bufferImg, 0, 0, this);
	}

	private void legacy(Graphics g) {
		//복원
		for(ShapeDTO dto : msPaint.getList()) {
			//도형
			int x1 = dto.getX1();
			int y1 = dto.getY1();
			int x2 = dto.getX2();
			int y2 = dto.getY2();
			int z1 = dto.getZ1();
			int z2 = dto.getZ2();
			
			//색
			switch(dto.getColor()) {
			case 0 : bufferG.setColor(new Color(255,0,0)); break;
			case 1 : bufferG.setColor(new Color(200,91,2)); break;
			case 2 : bufferG.setColor(new Color(255,255,0)); break;
			case 3 : bufferG.setColor(new Color(0,255,0)); break;
			case 4 : bufferG.setColor(new Color(0,0,255)); break;
			case 5 : bufferG.setColor(new Color(24,2,176)); break;
			case 6 : bufferG.setColor(new Color(255,0,255)); break;
			}
			
			//도형
			if(dto.isFill()) {//채워진 도형
				if(dto.getShape()==Figure.LINE)
					bufferG.drawLine(x1, y1, x2, y2);
				else if(dto.getShape()==Figure.CIRCLE)
					bufferG.fillOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
				else if(dto.getShape()==Figure.RECT)
					bufferG.fillRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
				else if(dto.getShape()==Figure.ROUNDRECT)
					bufferG.fillRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
				else if(dto.getShape()==Figure.PEN)
					bufferG.drawLine(x1, y1, x2, y2);
				
			}else {//빈 도형
				if(dto.getShape()==Figure.LINE)
					bufferG.drawLine(x1, y1, x2, y2);
				else if(dto.getShape()==Figure.CIRCLE)
					bufferG.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
				else if(dto.getShape()==Figure.RECT)
					bufferG.drawRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
				else if(dto.getShape()==Figure.ROUNDRECT)
					bufferG.drawRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
				else if(dto.getShape()==Figure.PEN)
					bufferG.drawLine(x1, y1, x2, y2);
				
			}
		}
	}
}
















