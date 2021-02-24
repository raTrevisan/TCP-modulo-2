
public class Circulo {
	private int r;
	public Ponto centro;

	Circulo(Ponto p , int raio){	
		centro = p;
		r = raio;
	}
	Circulo(int x, int y, int raio){
		centro = new Ponto (x,y);
		r = raio;
	}
	public double area () {
		return  r * r * Math.PI;
	}
	public double circunferencia() {
		return 2 * r * Math.PI;
	}
	public int getRaio() {
		return r;
	}
	
	public void setRaio(int new_r) {
		r = new_r;
	}
	
}
