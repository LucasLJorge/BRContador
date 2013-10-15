package Programa;

public class Receita extends Extrato {
	
	Double saldoDisponivel;
	
	public Receita(Double saldoFinal) {
		super(saldoFinal);
		// TODO Auto-generated constructor stub
	}

	public void adicionarSaldo(double saldoDisponivel){
		setSaldoDisponivel(this.saldoDisponivel += saldoDisponivel);
	}
	
	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	
	public void setSaldoDisponivel(Double disponivel) {
		saldoDisponivel = disponivel;
	}
}
