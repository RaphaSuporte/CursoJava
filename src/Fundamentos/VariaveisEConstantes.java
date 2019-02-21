/**
 * @autor RaphaelJG [rapha.suporte@gmail.com]
 */
package Fundamentos;

/**
 * @author raphaeljg
 * 
 * Variáveis e Constantes
 *
 */
public class VariaveisEConstantes {
	public static void main(String[] args) {
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio *raio;
		
		System.out.println("Área é " + area + " m2.");
		
		System.out.printf("Área é %f m2.\n", area);
		
		System.out.printf("Área é %.2f m2.", area);

	}

}
