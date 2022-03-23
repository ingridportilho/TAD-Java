package LPP.src.p1;

public abstract class Forma {
	private Ponto ponto;
	private double raio;
	private Lista lista;
	
	public abstract void setPonto(Ponto p);
	public abstract Ponto getPonto();
	public abstract void setRaio(double raio);
	public abstract double getRaio();
	public abstract double calculaArea();
	public abstract String toString();
	
}
