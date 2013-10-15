package Programa;
/**
 * @author Lucas Leonardo e Eric Luiz
 * Esta classe tem como finalidade descrever uma transa��o na sua despesa total, seja ela aditiva ou subtrativa.
 * Estas despesas estar�o sempre dispon�veis ao usu�rio, de modo que ele saiba o que est� acontcendo.s
 * 
 */
import java.util.Date;

public abstract class Transacao extends Programa implements Interface{
	private static String nomeDaTransacao;
	private static Double valorDaTransacao;
	//boolean tipoDaTransacao;
	//Date diaDaTransacao;
	
	Double saldoDisponivel;
	Double totalDeDespesas;
	
	public Transacao(String nomeTransacao, Double valorTransacao) {
		nomeDaTransacao = nomeTransacao;
		valorDaTransacao = valorTransacao;
		// TODO Auto-generated constructor stub
	}
	
	public String getNomeDaTransacao() {
		return nomeDaTransacao;
	}

	public static void setNomeDaTransacao(String nomeTransacao) {
		nomeDaTransacao = nomeTransacao;
	}
	
	public Double getValorDaTransacao() {
		return valorDaTransacao;
	}
	
	public static void setValorDaTransacao(Double valorTransacao) {
		valorDaTransacao = valorTransacao;
	}
	
	@Override
	public String toString(){
		return "toString Abstrato.";
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
