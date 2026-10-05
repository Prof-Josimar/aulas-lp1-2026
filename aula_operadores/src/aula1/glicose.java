package aula1;

/*

📘 Enunciado da Atividade

Faça um programa em Java que leia a medida da glicose de um paciente e classifique o resultado conforme os seguintes critérios médicos simplificados:

Requisitos:
O programa deve solicitar ao usuário a medida da glicose (valor real).

Após a leitura, o programa deve exibir a classificação:

Normal → glicose até 100 mg/dl

Elevado → glicose acima de 100 e até 140 mg/dl

Diabetes → glicose acima de 140 mg/dl

A saída deve mostrar a palavra "Classificação:" seguida do resultado correspondente.



*/

import java.util.Locale;
import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;

	    System.out.print("Digite a medida da glicose: ");
	    glicose = sc.nextDouble();

	    System.out.print("Classificacao: ");

	    if (glicose <= 100) {
	    	System.out.println("normal");
	    }
	    else if (glicose <= 140) {
	    	System.out.println("elevado");
	    }
	    else {
	    	System.out.println("diabetes");
	    }

		sc.close();
	}
}
