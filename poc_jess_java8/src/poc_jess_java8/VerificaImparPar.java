package poc_jess_java8;

interface ImparPar{
	Boolean isPar(Integer valor);
	
}
public class VerificaImparPar {

	public static void main(String[] args) {
		ImparPar  num ;
		num = (valor) -> valor%2>0;
		
		System.out.println(num.isPar(5));
		
		
	}

}

