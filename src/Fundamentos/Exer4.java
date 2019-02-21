package Fundamentos;


import java.util.Scanner;

public class Exer4 {

    public static void main ( String[] args ) {

        double x;

        Scanner valor = new Scanner ( System.in );
        System.out.println ( "Digite um valor " );
        x = valor.nextDouble ();


        System.out.println ( "O resultado ao quadrado é " + x * 2 );
        System.out.println ( "O resultado ao cubo é " + x * 3 );

    }
}
