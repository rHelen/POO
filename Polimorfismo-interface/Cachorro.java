package Heran�a;

public class Cachorro extends Animal {
		protected String correr;
		
	Cachorro(String nome,int idade){
		super(nome,idade);
	}
	public void som(String animalSom) {
			System.out.println("O som que o animal faz �: latir");
	}
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	void imprimir() {
		System.out.println("Nome do cachorro: "+getNome()+"\nIdade: "+getIdade());
	}
	void corre() {
		System.out.println("Uma das caracter�sticas do cachorro � correr!!!");
	}
}
