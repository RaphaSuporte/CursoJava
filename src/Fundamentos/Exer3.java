package Fundamentos;

import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args){

        double peso;
        double altura;


        Scanner imc = new Scanner (System.in);
        System.out.println ("Digite o Peso ");
        peso = imc.nextInt ();
        System.out.println ("Digite sua altura ");
        altura = imc.nextDouble();

        System.out.println ("O Seu IMC é " + peso / (altura * altura));


    }
}
