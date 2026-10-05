package a2026_04_06;


public class Sistema1999 {

    public static void main(String[] args) {
        int acumula = 0;
        for (int i = 1000; i <2000; i++) {
            if(i % 11 == 5){
                acumula +=i;

                System.out.println("Somando: " + i);
            }
            
        }
        System.out.println("_________________");
        System.out.println("Acumulado "+acumula);

    }

}
