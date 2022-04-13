package Secao4;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		String nome = "Luis";
		int idade = 19;
		String profissao = "Software engineer";
		double renda = 3200.00;
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e trabalha como %s e ganha R$ %.2f", nome, idade, profissao, renda);

	}

}
