package test;

import model.Tv;

public class TesteTv {

    public static void main(String[] args) {

        Tv tv = new Tv("Samsung", "Crystal UHD 50");

        tv.estadoAtual();

        tv.aumentarVolume(); // TV desligada

        tv.ligar();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        tv.mudarCanal(10);

        tv.proximoCanal();
        tv.proximoCanal();

        tv.canalAnterior();

        tv.estadoAtual();

        System.out.println("\nUsando toString():");
        System.out.println(tv);

        tv.diminuirVolume();

        tv.desligar();

        tv.mudarCanal(20); // TV desligada
    }
}