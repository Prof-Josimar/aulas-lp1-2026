package model;

public class Tv {

    private String marca;
    private String modelo;
    private int canal;
    private int volume;
    private boolean ligada;

    // Constantes
    private static final int CANAL_MIN = 1;
    private static final int CANAL_MAX = 99;
    private static final int VOLUME_MIN = 0;
    private static final int VOLUME_MAX = 100;

    // Construtor
    public Tv(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.canal = CANAL_MIN;
        this.volume = VOLUME_MIN;
        this.ligada = false;
    }

    // Verifica se a TV está ligada
    private boolean verificarLigada() {
        if (!ligada) {
            System.out.println("A TV está desligada. Ligue-a primeiro.");
            return false;
        }
        return true;
    }

    // Liga a TV
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A TV está ligada.");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    // Desliga a TV
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A TV está desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }

    // Aumenta volume
    public void aumentarVolume() {
        if (!verificarLigada()) return;

        if (volume < VOLUME_MAX) {
            volume = Math.min(volume + 10, VOLUME_MAX);
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    // Diminui volume
    public void diminuirVolume() {
        if (!verificarLigada()) return;

        if (volume > VOLUME_MIN) {
            volume = Math.max(volume - 10, VOLUME_MIN);
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    // Muda para um canal específico
    public void mudarCanal(int novoCanal) {
        if (!verificarLigada()) return;

        setCanal(novoCanal);
    }

    // Próximo canal
    public void proximoCanal() {
        if (!verificarLigada()) return;

        if (canal < CANAL_MAX) {
            canal++;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Você já está no último canal.");
        }
    }

    // Canal anterior
    public void canalAnterior() {
        if (!verificarLigada()) return;

        if (canal > CANAL_MIN) {
            canal--;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Você já está no primeiro canal.");
        }
    }

    // Exibe o estado atual
    public void estadoAtual() {
        System.out.println("\n===== ESTADO DA TV =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("Status: " + (ligada ? "Ligada" : "Desligada"));
        System.out.println("========================");
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= CANAL_MIN && canal <= CANAL_MAX) {
            this.canal = canal;
            System.out.println("Canal mudado para: " + canal);
        } else {
            System.out.println("Canal inválido. Escolha um canal entre "
                    + CANAL_MIN + " e " + CANAL_MAX + ".");
        }
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", canal=" + canal +
                ", volume=" + volume +
                ", ligada=" + ligada +
                '}';
    }
}