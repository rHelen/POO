package Herança;

public abstract class Animal {
		protected String nome;
		protected int idade;
		
		Animal(String nome,int idade){
			this.nome=nome;
			this.idade=idade;
		}
		abstract public void som(String animalSom);

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
}
