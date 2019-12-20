package poc_jess_java8;

	interface Maior{
		Integer maior(Integer valor,Integer valor1);
		
	}
	public class VerificaMaior {

		public static void main(String[] args) {
			Maior  num ;
			num = (valor,valor2) -> valor>valor2?  valor:  valor2;
			
			System.out.println(num.maior(5,6));
			
			
		}

}
