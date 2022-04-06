package POO;

public class Cliente {
		private String nome;
		private int cpf;
		private int dia;
		private int mes;
		private int ano;
		
		Cliente (String nome,int cpf,int dia,int mes,int ano) {
			this.nome=nome;
			this.cpf=cpf;
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
		}
		void setNome(String nome){
			this.nome=nome;
		}
		String getNome(){
			return nome;
		}
		void setCpf(int cpf) {
			this.cpf=cpf;
		}
		int getCpf() {
			return cpf;
		}
		void setDia(int dia) {
			this.dia=dia;
		}
		int getDia() {
			return dia;
		}
		void setMes(int mes) {
			this.mes=mes;
		}
		int getMes() {
			return mes;
		}
		void setAno(int ano) {
			this.ano=ano;
		}
		int getAno() {
			return ano;
		}
		void imprimir(){
			System.out.println("Cliente: "+nome+"\nCPF: "+cpf+"\nData de nascimento: "+dia+"/"+mes+"/"+ano);
		}
}
