package b2026_04_30;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays de alunos e notas
        String[] alunos = {"Maria", "João", "Ana", "Pedro", "Carla"};
        double[] notas = {8.5, 6.0, 4.5, 7.2, 9.0};

        // Cálculo da média da turma
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        // Menu principal
        int opcao;
        do {
            System.out.println("\n=== Sistema de Notas ===");
            System.out.println("1 - Mostrar todos os alunos");
            System.out.println("2 - Mostrar aprovados");
            System.out.println("3 - Mostrar recuperação");
            System.out.println("4 - Mostrar reprovados");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nAlunos e notas:");
                    for (int i = 0; i < alunos.length; i++) {
                        mostrarSituacao(alunos[i], notas[i]);
                    }
                    break;

                case 2:
                    System.out.println("\nAprovados:");
                    for (int i = 0; i < alunos.length; i++) {
                        if (notas[i] >= 7) {
                            mostrarSituacao(alunos[i], notas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nEm recuperação:");
                    for (int i = 0; i < alunos.length; i++) {
                        if (notas[i] >= 5 && notas[i] < 7) {
                            mostrarSituacao(alunos[i], notas[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nReprovados:");
                    for (int i = 0; i < alunos.length; i++) {
                        if (notas[i] < 5) {
                            mostrarSituacao(alunos[i], notas[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 5);

        // Mostrar média da turma
        System.out.println("\nMédia da turma: " + media);

        sc.close();
    }

    // Método auxiliar para mostrar situação do aluno
    public static void mostrarSituacao(String nome, double nota) {
        String situacao;
        if (nota >= 7) {
            situacao = "Aprovado";
        } else if (nota >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
        System.out.println(nome + " - " + nota + " (" + situacao + ")");
    }
}
