package LPP.src.p1;

public class Circulo extends Forma{
	private Ponto p;
	private double raio;
	private Lista lista = new Lista();
	
	public Circulo() {
		lista.add(this);
	}
	
	
	@Override
	public void setPonto(Ponto p) {
		this.p = p;
		
	}

	@Override
	public Ponto getPonto() {
		return this.p;
	}

	@Override
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double getRaio() {
		return this.raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(raio,2);
	}

	@Override
	public String toString() {
		return "Circulo-> raio : " + this.raio + "\n";
	}

}
