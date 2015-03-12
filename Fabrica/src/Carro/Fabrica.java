package Carro;

public class Fabrica {
	
	private Fabrica() {

	}

	private static Fabrica instancia = null;

	public static Fabrica getInstancia() {
		if (instancia == null) {
			System.out.println("Instancia Fabrica Criada");
			instancia = new Fabrica();
		}
		return instancia;

	}
}
