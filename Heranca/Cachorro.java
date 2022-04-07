package Herança;

public class Cachorro extends Animal {
		private String correr;
		
	Cachorro(String nome,int idade,String som,String correr){
		super(nome,idade,som);
		this.correr=correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	void imprimir() {
		System.out.println("Nome do animal: "+getNome()+"\nIdade: "+getIdade()+"\nQual som emite: "+getSom()+"\nO animal corre? "+correr);
	}
}
