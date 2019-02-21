package Fundamentos;

import java.util.Scanner;

public class Exer2 {

    public static void main ( String[] args ) {

        double f;


        Scanner celsius = new Scanner ( System.in );
        System.out.println ( "Digite o valor em Fahrenheit " );
        f = celsius.nextInt ();

        System.out.println ( "A conversão é " + (f - 32.0) * (5.0 / 9.0) );

    }

}
