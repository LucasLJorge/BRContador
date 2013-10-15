package Programa;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/** 
 * @author Lucas Leonardo e Eric Luiz
 *
 * Esta ï¿½ a classe principal do programa.
 * Nela estarï¿½o integrados todos os elementos das outras classes e serï¿½ responsï¿½vel pela interface com o usuï¿½rio.
 */

public class Programa {
	//Mï¿½todo responsavel por apresentar ao usuï¿½rio o menu principal, nela sï¿½o criados os construtores
	//e tudo o que o programa ï¿½ capaz.
	private static void menuPrincipal (){
		Scanner scanner= new Scanner(System.in);
		
		String nomeUsuario;
		int opcao;
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		//Extrato saldo;
		//saldo = new Extrato(00.00, 00.00, 00.00);
				
		//Transacao transacao;
		//transacao = new Transacao("","", 00.00);
		
		
		//Personaliza a interface com um nome fornecido pelo usuï¿½rio
		System.out.println("Digite um nome de usuï¿½rio:");
		nomeUsuario = scanner.nextLine();
		
		//O menu em si
			System.out.println("Olï¿½ " + nomeUsuario + "! O que vocï¿½ deseja?\n");
			do{
	
			System.out.println("1- Visualizar saldo;");
			System.out.println("2- Adicionar receita;");
			System.out.println("3- Adicionar despesa;");
			System.out.println("4- Sair;\n");
			
			opcao = scanner.nextInt();
	
			switch(opcao){
			
			//A opcão 1 mostra quanto o usuário tem disponível (saldo)
			case 1:
				//System.out.println(Receita.getTotalDeDespesas());
				continue;
			//Adiciona valores do orçamento
			case 2:
				TransacaoEntrada.realizaEntrada();
				continue;
			//Retira valores do orçamento
			case 3:
				TransacaoSaida.realizaSaida();
				continue;
			//Caso o usuï¿½rio digite uma opï¿½ï¿½o errada, este aviso serï¿½ mostrado 
			case 4:
				System.exit(0);
			default:
				System.err.println("Opção inválida! Tente novamente.");
				continue;
			}
			
			}while(opcao != 1 || opcao != 2 || opcao != 3);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t --BRContador--");

		Programa programa;
		programa = new Programa();

		menuPrincipal();
		//saldo = new Saldo();
		//saldo.setSaldoDisponivel(215.76);
		//System.out.println("O saldo disponÃ­vel ï¿½ de: R$" + saldo.saldoDisponivel +".");
		
	}

}
