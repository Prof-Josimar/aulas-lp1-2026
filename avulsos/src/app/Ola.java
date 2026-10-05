package app;

import javax.swing.*;

public class Ola {
    public static void main(String[] args) {
        //1. Mensagem simples com ícone de informação
        JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        //2. Mensagem de erro com ícone
        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.", "Erro", JOptionPane.ERROR_MESSAGE);

        //3. Diálogo de confirmação com botões padrão

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            System.out.println("Usuário escolheu SIM");
        } else if (resposta == JOptionPane.NO_OPTION) {
            System.out.println("Usuário escolheu NÃO");
        } else {
            System.out.println("Usuário cancelou");
        }

        // 4. Diálogo com botões personalizados


        Object[] opcoes = {"Salvar", "Não salvar", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null,
                "Deseja salvar as alterações?",
                "Escolha uma opção",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (escolha) {
            case 0: System.out.println("Salvar"); break;
            case 1: System.out.println("Não salvar"); break;
            case 2: System.out.println("Cancelar"); break;
        }

    }


}
