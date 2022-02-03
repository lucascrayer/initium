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
		
		fab=JOptionPane.showInputDialog("Digite o fabricante do ve�culo");
		modelo=JOptionPane.showInputDialog("Digite modelo do ve�culo");
		volport=Double.parseDouble(JOptionPane.showInputDialog("Digite o volume do porta malas"));
		consmed=Double.parseDouble(JOptionPane.showInputDialog("Digite consumo m�dio em Km/Lt."));
		anofab=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabrica��o do ve�culo"));
	}
	
	public String toString(){
		String str="";
		
		str+="Fabricante do ve�culo: "+fab+"\n";
		str+="Modelo do ve�culo: "+modelo+"\n";
		str+="Volume do porta malas:  "+volport+"\n";
		str+="Consumo m�dio Km/Lt.: "+consmed+"\n";
		str+="O ano de fabrica��o do ve�culo: "+anofab+"\n";
		return str;
	}
	
	void garbagecolector(){
		System.gc();
	}
	
	public int qtd(){
		int x;
		x=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de ve�culos a serem comparados"));
		
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
			System.out.println("Mais de tr�s: " + toString());
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
		op=Integer.parseInt(JOptionPane.showInputDialog("1-Dados dos ve�culos\n"
														+"2-Dados digitados\n"
														+"3-Os ve�culos com mais de tr�s anos de uso e consumo menor que 10 Km/Lt.\n"
														+"4-os ve�culos com menos de tr�s anos de uso, consumo\n"
														+ " m�dio superior a 12 Km/Lt\n"
														+ " e volume do porta-malas superior a 300 Litros.\n"
														+"5-Deletar dados digitados\n"
														+"6- Sair"));
		} while (op < 0 || op > 6);
		return op;
	}
	
}


