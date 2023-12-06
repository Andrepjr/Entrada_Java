package entrada;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// Entrada do nome do usuario
		
		Scanner scan = new Scanner(System.in);
		String nome;
		
		System.out.println("Oi, qual o seu nome ? ");
		nome = scan.nextLine();
		
		//Entrada da idade do usuario
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Quantos anos você tem, "+ nome+"?");
		idade = leia.nextInt();
		
		//Entrada da altura do usuario
		
		Scanner scan1 = new Scanner(System.in);
		float altura;
		
		System.out.println("Qual a sua altura, "+nome+"?");
		altura = scan1.nextFloat();
		
		System.out.println(nome+" possui "+idade+" anos de idade e tem "+altura+" de altura");
	}

}
