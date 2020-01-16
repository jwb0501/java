package swing;

public class ShapeDTO {
	private int x1, y1, x2, y2, z1, z2;
	private boolean fill;
	private int shape;
	private int fillColor;
	
	public ShapeDTO(int x1, int y1, int x2, int y2, int z1, int z2, boolean fill, int shape, int fillColor) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.z1 = z1;
		this.z2 = z2;
		this.fill = fill;
		this.shape = shape;
		this.fillColor = fillColor;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public int getZ1() {
		return z1;
	}

	public int getZ2() {
		return z2;
	}

	public boolean isFill() {
		return fill;
	}

	public int getShape() {
		return shape;
	}

	public int getFillColor() {
		return fillColor;
	}
	
	
	
	
	

}
