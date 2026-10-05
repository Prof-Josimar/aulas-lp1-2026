package app;

import java.sql.SQLOutput;

public class JavaCharDataType {
    public static void main(String[] args) {

        char meuChar = 'a';
        System.out.println(meuChar);

        char[] meuArrayDeChars = {'J', 'o', 's', 'i', 'm', 'a', 'r'};

        for (int meuArrayDeChar : meuArrayDeChars) {
            System.out.print((char) meuArrayDeChar);

        }

        System.out.println("\n");

        for (int meuArrayDeChar : meuArrayDeChars) {
            System.out.print((char) meuArrayDeChar);

        }
        System.out.println("\n________________\n");


        char[] numArray = {74, 111, 115, 105, 109, 97, 114};
        System.out.print(numArray[0]);
        System.out.print(numArray[1]);
        System.out.print(numArray[3]);
        System.out.print(numArray[4]);
        System.out.print(numArray[5]);
        System.out.print(numArray[6]);


        System.out.println("\n");


        for (char c : numArray) {
            System.out.print(c);
        }

        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
        }

    }

}
