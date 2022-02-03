package auto;

import javax.swing.JOptionPane;
import java.util.GregorianCalendar; 
import java.util.Calendar;
import java.util.Date;

public class automovel {
	private String fab;
	private String modelo;
	private double volport;
	private double consmed;
	private int anofab;
	
	public String getFab() {
		return fab;
	}

	public void setFab(String fab) {
		this.fab = fab;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVolport() {
		return volport;
	}

	public void setVolport(double volport) {
		this.volport = volport;
	}

	public double getConsmed() {
		return consmed;
	}

	public void setConsmed(double consmed) {
		this.consmed = consmed;
	}

	public int getAnofab() {
		return anofab;
	}

	public void setAnofab(int anofab) {
		this.anofab = anofab;
	}

	public automovel(){
		fab="nenhum fabricante";
		modelo="sem modelo";
		volport = 0;
		consmed=0;
		anofab=0;
	}
	

	public void leitura(){
		
		fab=JOptionPane.showInputDialog("Digite o fabricante do veículo");
		modelo=JOptionPane.showInputDialog("Digite modelo do veículo");
		volport=Double.parseDouble(JOptionPane.showInputDialog("Digite o volume do porta malas"));
		consmed=Double.parseDouble(JOptionPane.showInputDialog("Digite consumo médio em Km/Lt."));
		anofab=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do veículo"));
	}
	
	public String toString(){
		String str="";
		
		str+="Fabricante do veículo: "+fab+"\n";
		str+="Modelo do veículo: "+modelo+"\n";
		str+="Volume do porta malas:  "+volport+"\n";
		str+="Consumo médio Km/Lt.: "+consmed+"\n";
		str+="O ano de fabricação do veículo: "+anofab+"\n";
		return str;
	}
	
	void garbagecolector(){
		System.gc();
	}
	
	public int qtd(){
		int x;
		x=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de veículos a serem comparados"));
		
		return x;
	}
	
	
	public void maisdetres(){
		int anoatual;
		int compara;
		Calendar calendar = new GregorianCalendar();
		Date anoAtual = new Date();
		calendar.setTime(anoAtual);
		
		anoatual=calendar.get(Calendar.YEAR);
		compara=anoatual-anofab;
		
		
		if(compara<3 && consmed>12 && volport>300){
			System.out.println("Mais de três: " + toString());
		}
	}

	
	public void maisdetres10(){
		int anoatual;
		int compara;
		Calendar calendar = new GregorianCalendar();
		Date anoAtual = new Date();
		calendar.setTime(anoAtual);
		
		anoatual=calendar.get(Calendar.YEAR);
		compara=anoatual-anofab;
		
			if(compara<3 && consmed>10){
				System.out.println("Mais de dez: " + toString());
		}
	}
	
	public int menu(){
		int op;
		do {
		op=Integer.parseInt(JOptionPane.showInputDialog("1-Dados dos veículos\n"
														+"2-Dados digitados\n"
														+"3-Os veículos com mais de três anos de uso e consumo menor que 10 Km/Lt.\n"
														+"4-os veículos com menos de três anos de uso, consumo\n"
														+ " médio superior a 12 Km/Lt\n"
														+ " e volume do porta-malas superior a 300 Litros.\n"
														+"5-Deletar dados digitados\n"
														+"6- Sair"));
		} while (op < 0 || op > 6);
		return op;
	}
	
}


