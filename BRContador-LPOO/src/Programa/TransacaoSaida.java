package Programa;

import java.util.Scanner;

public class TransacaoSaida extends Transacao implements Interface{

	static Scanner leitor = new Scanner(System.in);	
	static Double valorDespesa;
	
	public TransacaoSaida(int qtdPos) {
		super(qtdPos);
	}

	public static void realizaSaida(){
		System.out.println("Insira um nome para a transacao:");
		setNomeDaTransacao(leitor.nextLine());
		System.out.println("Insira o valor da movimentacao:");
		valorDespesa = leitor.nextDouble();
		valorDespesa =- valorDespesa;
		setValorDaTransacao(valorDespesa);
	}
	
	@Override
	public void setSaldoDisponivel(Double disponivel) {
		saldoDisponivel += disponivel;
	}

	@Override
	public void setTotalDeDespesas(Double total) {
		totalDeDespesas += total;
	}
	
}
