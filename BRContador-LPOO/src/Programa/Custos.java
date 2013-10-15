package Programa;

public class Custos extends Extrato {
	
	Double totalDeDespesas;
	
	public Custos(Double saldoFinal) {
		super(saldoFinal);
		// TODO Auto-generated constructor stub
	}
	
	public void descontarSaldo(double totalDeDespesas){
		setTotalDeDespesas(this.totalDeDespesas -= totalDeDespesas);
	}
	
	public Double getTotalDeDespesas() {
		return totalDeDespesas;
	}
	
	public void setTotalDeDespesas(Double total) {
		totalDeDespesas = total;
	}
}
