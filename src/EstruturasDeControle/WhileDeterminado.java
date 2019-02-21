package EstruturasDeControle;

import java.util.Scanner;

public class WhileDeterminado {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        double somadasNotas = 0;
        double numerodasNotas = 0;
        double nota = 0;              //utilizar virgula para separar casas decimais

        int indice = 0;

        while (indice < 3){

            nota = scanner.nextDouble ();
            somadasNotas += nota;
            indice++;

        }

        scanner.close ();
        System.out.println ("A Média das notas é " + somadasNotas / 3);

    }

}
