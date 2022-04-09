package Herança;

public class Preguiça extends Animal {
	private String arvore;
	
	Preguiça(String nome,int idade){
		super(nome,idade);
		this.arvore=arvore;
	}
	public void som(String animalSom) {
		System.out.println("O som que o animal faz é: piripipi");
}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}
	void imprimir() {
		System.out.println("Nome do animal: "+getNome()+"\nIdade: "+getIdade()+"\n"+"\nSobe em árvores? "+arvore);
	}
	
}
