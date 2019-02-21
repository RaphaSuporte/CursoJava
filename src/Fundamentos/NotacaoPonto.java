package Fundamentos;
/*
 * String s recebe toUpperCase que recebe replace que recebe concat!
 * 
 * outra forma de Fazer sem Concatenação
 * String s = "Bom dia ?"
 * s = toUpperCase()
 * s = replace("?","Bia")
 * s = concat("!");
   System.out.println(s);
 * 
 */

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia ?".toUpperCase().replace("?","Bia").concat("!");
		System.out.println(s);

	
	}
}
