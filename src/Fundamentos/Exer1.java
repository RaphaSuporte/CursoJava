package Fundamentos;

import java.util.Scanner;

public class Exer1 {

    public static void main ( String[] args ) {

        double c;


        Scanner celsius = new Scanner ( System.in );
        System.out.println ( "Digite o valor em Celsius " );
        c = celsius.nextInt ();

        System.out.println ( "A conversão é " + (9 * c + 160) / 5 );


    }

}
