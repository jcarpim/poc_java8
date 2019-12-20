package poc_jess_java8;

interface Numero{
	Double getNum();
}
public class Main2 {

	public static void main(String[] args) {
		Numero  num ;
		num = () -> 6.7;
		System.out.println(num.getNum());
		
	}

}