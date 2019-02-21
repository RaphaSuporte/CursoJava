package Fundamentos;

import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args){

        double base;
        double altura;

        Scanner valor = new Scanner ( System.in );
        System.out.println ("Digite a Base ");
        base = valor.nextDouble ();
        System.out.println ("Digite a Altura ");
        altura = valor.nextDouble ();

        System.out.println ("A Área do Triangulo é " + (base * altura) / 2);

    }
}
