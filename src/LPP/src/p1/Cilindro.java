package LPP.src.p1;

public class Cilindro extends Forma{
	private double raio;
	private Ponto p;
	private Lista lista = new Lista();

	public Cilindro() {
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
		return 2 * (Math.PI * Math.pow(raio,2)) + 2 * Math.PI * raio * p.getZ();
	}

	
	public double calculaVolume() {
		return Math.PI * Math.pow(raio,2) * p.getZ();
	}

	@Override
	public String toString() {
		return "Cilindro -> raio: " + this.raio + " altura: " + p.getZ() + "\n";
	}

}
