package Herança;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		Cachorro ca1=new Cachorro("Bilu",4);
		Cavalo cav1=new Cavalo("Horse",5);
		Preguiça preg1=new Preguiça("Amora",5);
		Scanner in = new Scanner(System.in);
		System.out.println("O animal corre? \nResponda 1-Sim ou 2-Não");
		int run = in.nextInt();
		ca1.imprimir();
		switch(run) {
		case 1:
			ca1.corre();
			break;		
		}
		ca1.som(null);
		
		System.out.println("\n\nO animal corre? \nResponda 1-Sim ou 2-Não");
		run = in.nextInt();
		cav1.imprimir();
		switch(run) {
		case 1:
			ca1.corre();
			break;		
		}
		cav1.som(null);
		
		System.out.println("\n\nO animal sobe em arvores? \nResponda 1-Sim ou 2-Não");
		run = in.nextInt();
		preg1.imprimir();
		switch(run) {
		case 1:
			preg1.getArvore();
			break;		
		}
		preg1.som(null);
	}
}


