package fundamentos;

import java.util.Scanner;


//Wrapper
//Para cada tipo primitivo existe uma vers�o orientada a objeto que s�o os Wrappers.
//Diferen�a tipos come�a com a letra mai�scula 
// int em wrapper � Integer
// char em wrapper � Character

public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next());
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		// Pegando  valor Boolean e convertendo  para string para usar metodo  toUpperCasa
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		
		System.out.println(c.toString());
		System.out.println(c);

		entrada.close();
	}

}
