package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);
        double somadasNotas = 0;
        double nota = 0;

        int numerodeNotas = 0;

        do{
            nota = scanner.nextDouble ();

            if (nota <= 10 && nota >= 0){
                somadasNotas += nota;
                numerodeNotas ++;
            }

        }while (nota != -1);
        scanner.close ();
        System.out.println ("A média é " + somadasNotas / numerodeNotas);

    }
}
