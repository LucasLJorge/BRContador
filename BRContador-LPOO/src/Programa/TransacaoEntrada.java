package Programa;

import java.util.Scanner;

public class TransacaoEntrada extends Transacao{
	
	static Scanner leitor = new Scanner(System.in);
	static Double saldoDisponivel;
	//Double saldoDisponivel;
	
	public TransacaoEntrada(String nomeDaTransacao,	Double valorDaTransacao) {
		super(nomeDaTransacao, valorDaTransacao);
		// TODO Auto-generated constructor stub
	}

	public static void realizaEntrada(){
		System.out.println("Insira um nome para a transa��o:");
		setNomeDaTransacao(leitor.nextLine());
		System.out.println("Insira o valor da movimenta��o:");
		saldoDisponivel = leitor.nextDouble();
		setValorDaTransacao(saldoDisponivel);
	}
	
	@Override
	public String toString(){
		return "toString Entradas";
	}


}