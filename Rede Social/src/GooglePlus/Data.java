package GooglePlus;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data() {
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if (this.dia < 1 || this.dia > 31 || this.mes < 1 || this.mes > 12 || this.ano < 1) {
			System.out.println("Data Inválida");
						
		}
		
	}

	public String toString() {

		
		return dia + "/" + mes + "/" + ano;
	}
}
