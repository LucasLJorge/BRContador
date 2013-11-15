package Programa;
/**
 * @author Lucas Leonardo e Eric Luiz
 * Esta classe tem como finalidade descrever uma transa��o na sua despesa total, seja ela aditiva ou subtrativa.
 * Estas despesas estar�o sempre dispon�veis ao usu�rio, de modo que ele saiba o que est� acontcendo.s
 * 
 */

public abstract class Transacao extends Programa{
	public static String [] nomeDaTransacao;
	public static Double [] valorDaTransacao;
	static int posicaoVNome = 0;
	static int posicaoVValor = 0;
	
	Double saldoDisponivel;
	Double totalDeDespesas;
	
	public Transacao(int qtdPos) {
		if (qtdPos <= 0){
			qtdPos = 10;
        }
		
		nomeDaTransacao = new String[qtdPos];
		valorDaTransacao = new Double[qtdPos];
	}
	
	public String getNomeDaTransacao(int posicaoTransacao) {
		return nomeDaTransacao [posicaoTransacao];
	}

	public static void setNomeDaTransacao(String nomeTransacao) {
		nomeDaTransacao [posicaoVNome] = nomeTransacao;
		System.out.println("Nome da transacao e: " + nomeDaTransacao [posicaoVNome] + "." + " Pos: " + posicaoVNome);
		posicaoVNome++;
		System.out.println("Posicao agora e: " + posicaoVNome + ".");
	}
	
	public Double getValorDaTransacao(int posicaoTransacao) {
		return valorDaTransacao [posicaoTransacao];
	}
	
	public static void setValorDaTransacao(Double valorTransacao) {
		valorDaTransacao [posicaoVValor] = valorTransacao;
		System.out.println("Valor da transacao e: " + valorDaTransacao [posicaoVValor] + "." + " Pos: " + posicaoVValor);
		posicaoVValor++;
		System.out.println("Posicao agora e: " + posicaoVValor + ".");
	}
	
	@Override
	public String toString(){
		return "toString Abstrato.";
	}
	
	public void setSaldoDisponivel(Double disponivel) {
		saldoDisponivel += disponivel;
	}
	
	public void setTotalDeDespesas(Double total) {
		totalDeDespesas += total;
	}
	
}
