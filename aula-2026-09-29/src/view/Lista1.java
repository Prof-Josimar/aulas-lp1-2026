import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Lista1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Float> notas = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'FIM' para encerrar): ");
            String nome = scanner.nextLine().toUpperCase();

            if (nome.equals("FIM")) {
                break;
            }

            System.out.print("Digite a nota do aluno: ");
            float nota = scanner.nextFloat();
            scanner.nextLine(); // consumir o \n

            nomes.add(nome);
            notas.add(nota);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Nota: " + notas.get(i));
        }
        scanner.close();
    }

}
