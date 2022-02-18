package DesafioDeProgamação;

import java.util.Scanner;

/*
 * 2- Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 * 
 * 	Possui no mínimo 6 caracteres.
	Contém no mínimo 1 digito.
	Contém no mínimo 1 letra em minúsculo.
	Contém no mínimo 1 letra em maiúsculo.
	Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	
	Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
	Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser 
	adicionados para uma string qualquer ser considerada segura.
 * */

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome, senha="";

		//Entrada do valor nome
		System.out.println("Digite seu nome: ");
		nome = leia.next();

		//validador
		boolean ok = true;
		
		//Loop da entrada senha ate que esteja conforme.
		while (ok) {
			
			
			System.out.println("Digite sua senha que deve possuir no minimo 6 caracteres e que contenha: \n"
					+ " - Mínimo 1 número.\n" + " - Mínimo 1 letra em minúsculo.\n" + " - Mínimo 1 letra em maiúsculo.\n"
					+ " - Mínimo 1 caractere especial que são: !@#$%^&*()-+");
			senha = leia.next();
			
			//Validação da senha
			boolean validacaoSenha = senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,}$");
			
			//Inspeção do conteudo da senha
			if (senha.length() >= 6 && validacaoSenha) {
				System.out.println("Senha forte e válida!");
				break;
			} else if(senha.length() < 6){
				System.out.println("\nA senha digitada contem " + senha.length() + " caracteres, \ndigite mais: "
						+ (senha.length() - 6) * -1
						+ " caracteres para a senha ser considerada válida seguindo as instruçoes.\n");	
			}else {
				System.out.println("Senha fraca siga as instruções!");
			}

		}
		
		//Apresenta os valores inseridos
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Senha do usuario: " + senha);
		leia.close();

	}

}
