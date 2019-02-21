/**
 * @autor Raphael JG
 */
package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos Boleanos
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1,bo2);
		
		//Tipos Character
				char c1 = 'a';
				char c2 = '!';
				char c3 = '\u0050';
				System.out.printf("%c %c %c\n", c1,c2,c3);
				
				//Tipos Inteiros
				
				byte b = 127;
				short s = 32767;
				int i = 2_147_483_647;
				long l = 9_223_372_036_854_775_807L;
				
				//Impressão em Inteiro
				System.out.printf("%d\n%d\n%d\n%d\n",b,s,i,l);
				
				//impressão em binário
				System.out.println(Integer.toBinaryString(b));
				System.out.println(Integer.toBinaryString(s));
				System.out.println(Integer.toBinaryString(i));
				System.out.println(Long.toBinaryString(l));
				
				/*Tipos Primitivos reais (ponto flutuante)
				 * "%.3f %.3f" numero de casas decimais.
				*/
				float f = 3.1416f;
				double d = 2.45;
				System.out.printf("%.3f %.3f",f,d);
	}
}
