package br.com.abc.introducao.diversos;

/**
 * Created by William Suane on 1/29/2016.
 */
public class ImprimindoVariaveis {
    public static void main(String[] args){
        int idade=10;
        byte idadeByte = 12;
        short idadeShort = 32767;
        long numeroGrande = Long.MAX_VALUE;        
        int intTeste = Integer.MAX_VALUE;

        double salarioDouble = 3000;
        float salarioFloat= 3000f;
        float maxFloat = Float.MAX_VALUE;

        boolean verdadeiro = true;
        boolean falso = false;

        char caractere = '\u0041'; //2 bytes
        String nome = "William";
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println(maxFloat);
        System.out.println(intTeste);
        
    }
}
