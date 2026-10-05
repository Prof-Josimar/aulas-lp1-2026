package aula1;

/*
Enunciado da Atividade

Desenvolva um programa em Java que simule a verificação de uma senha de acesso.

Requisitos:
O programa deve solicitar ao usuário que digite uma senha numérica.

A senha correta é 2002.

Enquanto o usuário digitar uma senha incorreta, o programa deve mostrar a mensagem:

"Senha Invalida! Tente novamente:"  
e pedir uma nova entrada.

Quando o usuário digitar a senha correta, o programa deve exibir:

"Acesso permitido!"  
e encerrar a execução.


*/

import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;

	    System.out.print("Digite a senha: ");
	    senha = sc.nextInt();

	    while (senha != 2002) {
	    	System.out.print("Senha Invalida! Tente novamente: ");
	        senha = sc.nextInt();
	    }

	    System.out.println("Acesso permitido!\n");

		sc.close();
	}
}
