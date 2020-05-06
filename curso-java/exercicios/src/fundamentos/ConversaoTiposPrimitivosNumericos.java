package fundamentos;

///CAST 

///convers�o de variavel para tipos menores  

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		
		double a = 1; // Impl�cita
		
		System.out.println(a);
		
		float b = (float) 1.123456; // expl�cita (CAST)
		
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);
	}

}
