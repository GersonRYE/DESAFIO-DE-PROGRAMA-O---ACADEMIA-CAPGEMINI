package DesafioDeProgama��o;

import java.util.Scanner;

/*
 * 2- D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
 * 
 * 	Possui no m�nimo 6 caracteres.
	Cont�m no m�nimo 1 digito.
	Cont�m no m�nimo 1 letra em min�sculo.
	Cont�m no m�nimo 1 letra em mai�sculo.
	Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
	
	D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
	Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser 
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
					+ " - M�nimo 1 n�mero.\n" + " - M�nimo 1 letra em min�sculo.\n" + " - M�nimo 1 letra em mai�sculo.\n"
					+ " - M�nimo 1 caractere especial que s�o: !@#$%^&*()-+");
			senha = leia.next();
			
			//Valida��o da senha
			boolean validacaoSenha = senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,}$");
			
			//Inspe��o do conteudo da senha
			if (senha.length() >= 6 && validacaoSenha) {
				System.out.println("Senha forte e v�lida!");
				break;
			} else if(senha.length() < 6){
				System.out.println("\nA senha digitada contem " + senha.length() + " caracteres, \ndigite mais: "
						+ (senha.length() - 6) * -1
						+ " caracteres para a senha ser considerada v�lida seguindo as instru�oes.\n");	
			}else {
				System.out.println("Senha fraca siga as instru��es!");
			}

		}
		
		//Apresenta os valores inseridos
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Senha do usuario: " + senha);
		leia.close();

	}

}
