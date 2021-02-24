
public class Ponto {
	private int x;
	private int y;
	
	Ponto (int valx, int valy) {
		x = valx;
		y = valy;
	}
	
	public int getx () {
		return x;
	}
	
	public int gety () {
		return y;
	}
	
	public void setx (int new_x) {
		this.x = new_x;
	}
	
	public void sety (int new_y) {
		this.y = new_y;
	}
}
