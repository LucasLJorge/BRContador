package Programa;

import java.util.Scanner;

public class TransacaoSaida extends Transacao{

	static Scanner leitor = new Scanner(System.in);	
	static Double totalDespesas;
	
	public TransacaoSaida(String nomeDaTransacao, Double valorDaTransacao) {
		super(nomeDaTransacao, valorDaTransacao);
		// TODO Auto-generated constructor stub
	}

	public static void realizaSaida(){
		System.out.println("Insira um nome para a transa��o:");
		setNomeDaTransacao(leitor.nextLine());
		System.out.println("Insira o valor da movimenta��o:");
		totalDespesas = leitor.nextDouble();
		setValorDaTransacao(totalDespesas);
		
	}
	
	@Override
	public String toString(){
		return "toString Saidas";
	}
	
	
}
