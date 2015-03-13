package FolhaDePagamento;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PagamentosDeFuncionarios {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite os dados embaralhados");

		String salario = scan.nextLine();

		Matcher matcher = Pattern.compile("\\d+").matcher(salario);
		int soma = 0;
		while (matcher.find()) {
			soma += Integer.parseInt(matcher.group());
			
		}
		System.out.println("Seu salario é R$" + soma);

		scan.close();
	}
}
