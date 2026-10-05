package aula1;

/*
Enunciado da Atividade

Faça um programa em Java que registre a preferência de combustível dos clientes de um posto.
Requisitos:
1.	O programa deve exibir a mensagem: "Informe um código (1, 2, 3) ou 4 para parar:"
2.	Os códigos significam:
	1 → Álcool
	2 → Gasolina
	3 → Diesel
	4 → Encerrar a entrada de dados
3.	Cada vez que o usuário digitar um código válido (1, 2 ou 3), o programa deve contabilizar a escolha.
4.	Quando o usuário digitar o código 4, o programa deve:
•	Mostrar a mensagem "MUITO OBRIGADO"
•	Exibir a quantidade de votos para cada combustível.

*/

import java.util.Locale;
import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, alcool, gasolina, diesel;

		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
	    codigo = sc.nextInt();

		alcool = 0;
		gasolina = 0;
		diesel = 0;

	    while (codigo != 4) {
	        if (codigo == 1) {
	            alcool++;
	        }
	        else if (codigo == 2) {
	            gasolina++;
	        }
	        else if (codigo == 3) {
	            diesel++;
	        }
	        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
	        codigo = sc.nextInt();
	    }

	    System.out.println("MUITO OBRIGADO");
	    System.out.printf("Alcool: %d\n", alcool);
	    System.out.printf("Gasolina: %d\n", gasolina);
	    System.out.printf("Diesel: %d\n", diesel);

		sc.close();
	}
}
