package DesafioDeProgamação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1- Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando 
 * o caractere * e espaços. A base e altura da escada devem ser iguais ao 
 * valor de n. A última linha não deve conter nenhum espaço.
 * */

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<String> e = new ArrayList<>();

		//Recebe o valor
		System.out.println("Digite o valor:\n ");
		int n = leia.nextInt();
		
		//Adiciona espaços vazios e * de acordo com o valor inserido no array
		for (int i = 0; i < n; i++) {
			e.add(" ".repeat((n-1) - i) + "*".repeat(i + 1));
		}
		
		//Apenas utilizado para pular uma linha
		System.out.println();
		
		
		//Apresenta valores de cada linha
		for (String d : e) {
			System.out.println(d);
		}
		leia.close();   

	}

}
