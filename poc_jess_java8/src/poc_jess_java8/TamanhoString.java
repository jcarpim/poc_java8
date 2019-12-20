package poc_jess_java8;

interface Palavra{
	Integer meuNome(String valor);
	
}
public class TamanhoString {

	public static void main(String[] args) {
		Palavra  num ;
		num = (valor) -> valor.length();
		
		System.out.println(num.meuNome("Jessy"));
		
		
	}

}