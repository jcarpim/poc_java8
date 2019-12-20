package poc_jess_java8;

interface Par{
	Boolean getNum(Integer valor);
}

public class VerificaPar {

	public static void main(String[] args) {
		Par  num ;
		num = (valor) -> valor%2>0;
		
		System.out.println(num.getNum(8));
		
		
	}

}
