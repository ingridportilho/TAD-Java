package LPP.src.p1;

import java.util.Iterator;
import java.util.LinkedList;

public class Lista {
	private static LinkedList<Forma> forma = new LinkedList<Forma>();

	public boolean add(Forma forma) {
		this.forma.add(forma);
		return true;
	}
	
	public int qtddeCirculos() {
		int num = 0;
		Iterator i = forma.iterator();
		Forma f;
		while (i.hasNext()) {
		f = (Forma) i.next();
		if (f instanceof Circulo) num++;
		}
		return num;
	}
	
	public int qtddeCilindros() {
		int num = 0;
		Iterator i = forma.iterator();
		Forma f;
		while (i.hasNext()) {
		f = (Forma) i.next();
		if (f instanceof Cilindro) num++;
		}
		return num;
	}
	
	public String mostraAreas() {
		String areas = null;
		Iterator i = forma.iterator();
		Forma f;
		while (i.hasNext()) {
			f = (Forma) i.next();
			areas += "\n" + f.calculaArea();
		}
		return areas;
	}
	
	public String mostraVolumes() {
		String volumes = null;
		Iterator i = forma.iterator();
		Forma f;
		Cilindro c;
		while (i.hasNext()) {
			f = (Forma) i.next();
			if(f instanceof Cilindro) {
				c = (Cilindro) f;
				volumes += "\n" + c.calculaVolume();
				
			}
			
		}
		return volumes;
	}

	
	
}
