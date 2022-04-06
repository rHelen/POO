package POO;

public class Aviao {
		private String empresa;
		private int ano;
		private int velo;
		private int assentos;
		
		Aviao(String empresa,int ano,int velo,int assentos) {
			this.empresa=empresa;
			this.ano=ano;
			this.velo=velo;
			this.assentos=assentos;
		}
		String getEmpresa() {
			return empresa;
		}
		void setEmpresa(String empresa) {
			this.empresa=empresa;
		}
		int getAno() {
			return ano;
		}
		void setAno(int ano) {
			this.ano=ano;
		}
		int getVelo() {
			return velo;
		}
		void setVelo(int velo) {
			this.velo=velo;
		}
		int getAssentos() {
			return assentos;
		}
		void setAssentos(int assentos) {
			this.assentos=assentos;
		}
		void imprimir() {
			System.out.println("\t\tCaracterísticas do avião"+"\nEmpresa: "
					+empresa+"\nAno: "+ano+"\nVelocidade: "+velo+"\nQuantidade de assentos: "+assentos);
		}
}
