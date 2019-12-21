package poc_jess_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// Interface funcional
		System.out.println("=== Inicio do teste ===");
		Runnable r1 = new Runnable() {
			// implementação de classe anonima
			@Override
			public void run() {
				System.out.println("Estudando a expressao lambda.");
			}
		};

		Runnable r2 = () -> System.out.println("Estudando a expressao lambda 2.");

		r1.run();
		r2.run();
		//Lamda em streams
		List<String> listaDeChamada = new ArrayList<String>();
		listaDeChamada.add("Amanda");
		listaDeChamada.add("Fernanda");
		listaDeChamada.add("Juliana");
		listaDeChamada.add("Felipe");
		listaDeChamada.add("André");
		listaDeChamada.add("Thais");
		listaDeChamada.add("Simone");
		listaDeChamada.add("Jessica");
		listaDeChamada.add("Bruna");
		//Jeito antigo de varrer uma lista:
		for(String nome: listaDeChamada) {
			System.out.println(nome);
		}
		//Jeito do Java8
		listaDeChamada.forEach(item -> System.out.println(item));
		System.out.println("Inicio segunda lista");
		listaDeChamada.forEach(System.out::println);
		//Jeito de filtar uma lista com o Java 7:
		for(String nome: listaDeChamada) {
			if(nome.length()>6)//numero magico
			System.out.println(nome);
		}
		//Jeito de filtrar no java 8
		List<String> lResultado = listaDeChamada.stream().filter(item -> item.length()>6).collect(Collectors.toCollection(ArrayList::new));
		listaDeChamada.forEach(System.out::println);
		
		//Java 8 Organizando lista 
		System.out.println("Organizando a lista");
		listaDeChamada.sort((c1, c2) -> c1.compareTo(c2));
		listaDeChamada.forEach(System.out::println);
		System.out.println("Verificando se existe alguma amanda:");
		//Filtrando lista com totais
		System.out.println(listaDeChamada.stream().filter(item -> item.toUpperCase().equals("AMANDA")).count()>0);//jeito errado de usar o filter
		System.out.println(listaDeChamada.stream().anyMatch(item -> item.toUpperCase().equals("MARIA"))); // qualquer match
		System.out.println(listaDeChamada.stream().noneMatch(item -> item.toUpperCase().equals("ANA")));//nenhum match
		
	}

}
