package Herança;

public class Cavalo extends Animal {
	private String correr;
	
	Cavalo(String nome,int idade){
		super(nome,idade);
		this.correr=correr;
	}
	public void som(String animalSom) {
		System.out.println("O som que o animal faz é: relinchar");
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	void imprimir() {
		System.out.println("Nome do animal: "+getNome()+"\nIdade: "+getIdade());
	}
}
