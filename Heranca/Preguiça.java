package Heran�a;

public class Pregui�a extends Animal {
	private String arvore;
	
	Pregui�a(String nome,int idade,String som,String arvore){
		super(nome,idade,som);
		this.arvore=arvore;
	}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}
	void imprimir() {
		System.out.println("Nome do animal: "+getNome()+"\nIdade: "+getIdade()+"\nQual som emite: "+getSom()+"\nSobe em �rvores? : "+arvore);
	}
}
