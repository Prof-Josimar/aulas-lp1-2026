package app;

public class VersaoJava {

    public static void main(String[] args) {
        // Mostra a versão do Java em uso
        System.out.println("Versão do Java: " + System.getProperty("java.version"));

        // Se quiser detalhes adicionais:
        System.out.println("Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Home: " + System.getProperty("java.home"));
    }

}
