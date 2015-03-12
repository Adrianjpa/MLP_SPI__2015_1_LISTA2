package Carro;

public class FabricaDeCarro {

	public static void main(String[] args) {

		Fabrica fabrica = null;
		for (int i = 0; i < 100000; i++) {
			fabrica = Fabrica.getInstancia();
		}

	}

}
