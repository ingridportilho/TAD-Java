package LPP.src.p1;

public class Teste {

	public static void main(String[] args) {

		Lista lista = new Lista();
		Forma f1 = new Cilindro();
		Ponto p = new Ponto(1,2,10);
		Ponto p2 = new Ponto(1,2,15);
		f1.setPonto(p);
		f1.setRaio(3);
		
		Forma f2 = new Circulo();
		f2.setPonto(p2);
		f2.setRaio(5);
		
		System.out.println(lista.qtddeCirculos());
		System.out.println(lista.qtddeCilindros());
		System.out.println(lista.mostraAreas());
		System.out.println(lista.mostraVolumes());
		
	}

}
