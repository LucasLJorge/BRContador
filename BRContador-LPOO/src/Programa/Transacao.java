package Programa;
/**
 * @author Lucas Leonardo e Eric Luiz
 * Esta classe tem como finalidade descrever uma transaï¿½ï¿½o na sua despesa total, seja ela aditiva ou subtrativa.
 * Estas despesas estarï¿½o sempre disponï¿½veis ao usuï¿½rio, de modo que ele saiba o que estï¿½ acontcendo.s
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
		System.out.println("Nome da transacao é: " + nomeDaTransacao [posicaoVNome] + "." + " Pos: " + posicaoVNome);
		posicaoVNome++;
		System.out.println("Posicao agora é: " + posicaoVNome + ".");
	}
	
	public Double getValorDaTransacao(int posicaoTransacao) {
		return valorDaTransacao [posicaoTransacao];
	}
	
	public static void setValorDaTransacao(Double valorTransacao) {
		valorDaTransacao [posicaoVValor] = valorTransacao;
		System.out.println("Valor da transacao é: " + valorDaTransacao [posicaoVValor] + "." + " Pos: " + posicaoVValor);
		posicaoVValor++;
		System.out.println("Posicao agora é: " + posicaoVValor + ".");
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
