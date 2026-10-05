package app;

public class Main {
	
    public static void main(String[] args) {
        // Versão da JDK/JRE
        System.out.println("Versão Java: " + System.getProperty("java.version"));

        // Versão detalhada do runtime
        System.out.println("Runtime: " + System.getProperty("java.runtime.version"));

        // Nome do fornecedor da JDK
        System.out.println("Fornecedor: " + System.getProperty("java.vendor"));

        // Caminho da instalação da JDK/JRE
        System.out.println("Diretório Java Home: " + System.getProperty("java.home"));

        // Sistema operacional
        System.out.println("Sistema Operacional: " + System.getProperty("os.name"));
        System.out.println("Versão SO: " + System.getProperty("os.version"));
        System.out.println("Arquitetura: " + System.getProperty("os.arch"));
    }
}
