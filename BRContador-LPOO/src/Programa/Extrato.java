package Programa;
/**
 * @author Lucas Leonardo e Eric Luiz
 *
 *Esta classe tem como finalidade descrever todo o saldo do usu�rio, detalhando todas as despesas e informando a situa��o
 *monet�ria final dele.
 *
 */
public abstract class Extrato extends Programa{
	Double saldoFinal;
	Double saldoDisponivel;
	Double totalDeDespesas;
	
	//public Extrato(Double saldoDisponivel, Double totalDeDespesas, Double saldoFinal) {
	public Extrato(Double saldoFinal) {
		super();
		this.saldoFinal = saldoFinal;
		//this.saldoDisponivel = saldoDisponivel;
		//this.totalDeDespesas = totalDeDespesas;
	}
	
	public Double getSaldoFinal(){
		return saldoFinal;
	}
	
	public void setSaldoFinal(double saldoDisponivel, double totalDeDespesas) {
		saldoFinal = saldoDisponivel - totalDeDespesas;
	}
	
	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	
	public void setSaldoDisponivel(Double disponivel) {
		saldoDisponivel += disponivel;
	}
	
	public Double getTotalDeDespesas() {
		return totalDeDespesas;
	}
	
	public void setTotalDeDespesas(Double total) {
		totalDeDespesas += total;
	}
		
}
