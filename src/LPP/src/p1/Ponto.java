package LPP.src.p1;

public class Ponto {
	private double X;
	private double Y;
	private double Z;
	
	public Ponto(double X, double Y, double Z) {
		setX(X);
		setY(Y);
		setZ(Z);
	}
	
	public void setX(double X) {
		this.X = X;
	}
	
	public void setY(double Y) {
		this.Y = Y;	
	}
	
	public void setZ(double Z) {
		this.Z = Z;
	}
	
	public double getX() {
		return this.X;
	}
	
	public double getY() {
		return this.Y;
	}
	
	public double getZ() {
		return this.Z;
	}
}
