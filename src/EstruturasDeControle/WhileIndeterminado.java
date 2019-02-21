package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        double somadasNotas = 0;
        double nota = 0;              //utilizar virgula para separar casas decimais
        int numerodeNotas = 0;

        while (nota != -1){
            nota = scanner.nextDouble ();

            if (nota <= 10 && nota >=0){
                somadasNotas += nota;
                numerodeNotas++;
            }
        }
        scanner.close ();
        System.out.printf ("A média das notas é %.2f", somadasNotas / numerodeNotas);
    }

}
