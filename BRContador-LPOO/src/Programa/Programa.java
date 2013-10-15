package Programa;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/** 
 * @author Lucas Leonardo e Eric Luiz
 *
 * Esta � a classe principal do programa.
 * Nela estar�o integrados todos os elementos das outras classes e ser� respons�vel pela interface com o usu�rio.
 */

public class Programa {
	//M�todo responsavel por apresentar ao usu�rio o menu principal, nela s�o criados os construtores
	//e tudo o que o programa � capaz.
	private static void menuPrincipal (){
		Scanner scanner= new Scanner(System.in);
		
		String nomeUsuario;
		int opcao;
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		//Extrato saldo;
		//saldo = new Extrato(00.00, 00.00, 00.00);
				
		//Transacao transacao;
		//transacao = new Transacao("","", 00.00);
		
		
		//Personaliza a interface com um nome fornecido pelo usu�rio
		System.out.println("Digite um nome de usu�rio:");
		nomeUsuario = scanner.nextLine();
		
		//O menu em si
			System.out.println("Ol� " + nomeUsuario + "! O que voc� deseja?\n");
			do{
	
			System.out.println("1- Visualizar saldo;");
			System.out.println("2- Adicionar receita;");
			System.out.println("3- Adicionar despesa;");
			System.out.println("4- Sair;\n");
			
			opcao = scanner.nextInt();
	
			switch(opcao){
			
			//A opc�o 1 mostra quanto o usu�rio tem dispon�vel (saldo)
			case 1:
				//System.out.println(Receita.getTotalDeDespesas());
				continue;
			//Adiciona valores do or�amento
			case 2:
				TransacaoEntrada.realizaEntrada();
				continue;
			//Retira valores do or�amento
			case 3:
				TransacaoSaida.realizaSaida();
				continue;
			//Caso o usu�rio digite uma op��o errada, este aviso ser� mostrado 
			case 4:
				System.exit(0);
			default:
				System.err.println("Op��o inv�lida! Tente novamente.");
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
		//System.out.println("O saldo disponível � de: R$" + saldo.saldoDisponivel +".");
		
	}

}
