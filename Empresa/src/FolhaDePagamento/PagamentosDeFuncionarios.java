package FolhaDePagamento;

import java.util.Scanner;

public class PagamentosDeFuncionarios {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite os dados embaralhados");

		String salario = scan.nextLine();

		String[] tokens = salario.split("[a-zA-Z]+");
		for (String token : tokens) {
			System.out.println(token);
		}
		int soma = 0;

		for (int i = 0; i < tokens.length; i++) {
			soma = Integer.parseInt(tokens[i]);
		}
		
		int somatorio = 0;
		
		for (int i = 0; i < tokens.length; i++) {
			somatorio += soma;
		}

		System.out.println("Seu salario é R$" + somatorio);

		scan.close();
	}
}
