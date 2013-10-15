package Programa;

import java.util.Date;
/**
 * @author Lucas Leonardo e Eric Luiz
 * Esta classe tem por finalidade organizar as despesas do usu�rio atrav�s de um calend�rio.
 * O calend�rio estar� vis�vel ao usu�rio e nele poder�o ser adicionadas transa��es.
 */

public abstract class Calendario extends Programa{
	int Ano[];
	int Mes[];
	int Dia[];
	Date diaCorrente;
	
	public int[] getAno() {
		return Ano;
	}
	public void setAno(int[] ano) {
		Ano = ano;
	}
	
	public int[] getMes() {
		return Mes;
	}
	
	public void setMes(int[] mes) {
		Mes = mes;
	}
	
	public int[] getDia() {
		return Dia;
	}
	
	public void setDia(int[] dia) {
		Dia = dia;
	}
	
	public Date getDiaCorrente() {
		return diaCorrente;
	}
	
	public void setDiaCorrente(Date esteDia) {
		diaCorrente = esteDia;
	}
	
}
