package Heran�a;

public class Pregui�a extends Animal {
	private String arvore;
	
	Pregui�a(String nome,int idade){
		super(nome,idade);
		this.arvore=arvore;
	}
	public void som(String animalSom) {
		System.out.println("O som que o animal faz �: piripipi");
}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}
	void imprimir() {
		System.out.println("Nome do animal: "+getNome()+"\nIdade: "+getIdade()+"\n"+"\nSobe em �rvores? "+arvore);
	}
	
}
