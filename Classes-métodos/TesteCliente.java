package POO;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		int x,cpf,dia,mes,ano;
		String nome;
		Scanner in = new Scanner(System.in);
		Cliente[] lista = new Cliente[3];
		System.out.println("\t\tBem vindo ao painel de cliente");
		for(x=0;x<3;x++) {
			System.out.print("\nInforme o seu nome: ");
			nome=in.next();
			System.out.print("Informe o seu CPF: ");
			cpf=in.nextInt();
			System.out.print("Informe o dia que voc� nasceu: ");
			dia=in.nextInt();
			System.out.print("Informe o m�s que voc� nasceu: ");
			mes=in.nextInt();
			System.out.print("Informe o ano que voc� nasceu: ");
			ano=in.nextInt();
			lista[x]=new Cliente(nome,cpf,dia,mes,ano);
			System.out.println("\n");
		}
		for(Cliente roda:lista) {
			roda.imprimir();
			System.out.println("\n");
		}
	}

}
