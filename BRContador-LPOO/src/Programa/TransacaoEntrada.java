package Programa;

import java.util.Scanner;

public class TransacaoEntrada extends Transacao{
	
	static Scanner leitor = new Scanner(System.in);
	static Double saldoDisponivel;
	
	public TransacaoEntrada(int qtdPos) {
		super(qtdPos);
	}
	
	public static void realizaEntrada(){
		System.out.println("Insira um nome para a transacao:");
		setNomeDaTransacao(leitor.nextLine());
		System.out.println("Insira o valor da movimentacao:");
		//saldoDisponivel = leitor.nextDouble();
		setValorDaTransacao(leitor.nextDouble());
	}
	

}