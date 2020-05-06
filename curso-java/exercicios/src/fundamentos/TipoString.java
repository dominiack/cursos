package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Edimar".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		String nome = "Edimar";
		int idade = 23;
		double salario = 12345.134;

		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("O %S tem %d anos e ganha R$%.2f", nome, idade, salario);
		
		System.out.println("\n");
		
		
		System.out.println("Edimar Dominiack Alves".contains("Edi"));
		System.out.println("Edimar Dominiack Alves".indexOf("m"));
		System.out.println("Edimar Dominiack Alves".substring(2));
		System.out.println("Edimar Dominiack Alves".substring(6, 8));
		
	}
}
