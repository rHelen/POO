package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes {

	public static void main(String[] args) {
		List<String> estoque =new ArrayList<String>();
		Scanner in = new Scanner (System.in);
		int op;
		do {
			System.out.println();
			System.out.println("====================================");
			System.out.println("Menu de opções do estoque");
			System.out.println("(1) - Adicionar um item ao estoque.\n(2) - Remover um item do estoque.\n(3) - Atualizar item do estoque.\n(4) - Mostrar itens do estoque.\n(0) - Sair do programa.");
			op=in.nextInt();
			switch(op) {
			case 1: // Adicionar item
				in.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String item=in.next();
				estoque.add(item);
				break;
			case 2: // Remover item
				in.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String itemR=in.next();
				if(estoque.contains(itemR)){
					estoque.remove(itemR);
				} else {
					System.out.println("\nProduto não encontrado no estoque.");
				} 
				break;
			case 3:
				in.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String atualizar=in.next();
				if(estoque.contains(atualizar)) {
					estoque.remove(atualizar);
					System.out.println("\nDigite o produto que substuirá: ");
					String novoItem=in.next();
					estoque.add(novoItem);
				} else {
					System.out.println("\nProduto não encontrado no estoque.");
				}
				break;
			case 4:
				in.nextLine();
				System.out.println(estoque);
			default:
				if(op<0 || op>4) {
					System.out.println("\nOpção inválida. Tente novamente.");
				} else if (op==0) {
					System.out.println("\nFinalizando o programa...");
				}
			}
		} 
		while(op!=0);
	}
}
