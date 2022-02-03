import javax.swing.*;
public class fest {
	private String patrono;
	private double pesocarne;
	private double precocarne;
	private double chopplts;
	private double chopppreco;
	private double total;
	
	public fest(){
		this.patrono="";
		this.pesocarne=0;
		this.precocarne=0;
		this.chopplts=0;
		this.chopppreco=0;
		this.total=0;
	}

	public void leitura(){
		this.patrono=JOptionPane.showInputDialog("Patrono da Festa: \n");
		this.pesocarne=Double.parseDouble(JOptionPane.showInputDialog("Kilos de carne: \n"));
		this.precocarne=Double.parseDouble(JOptionPane.showInputDialog("Preço do kilo da carne: \n"));
		this.chopplts=Double.parseDouble(JOptionPane.showInputDialog("Litros de chopp: \n"));
		this.chopppreco=Double.parseDouble(JOptionPane.showInputDialog("Preço do chopp: \n"));
	}
	
	public double calcula(){
		this.total =(pesocarne*precocarne)+(chopplts*chopppreco);
		return total;		
	}
	
	public void imprime(){
		String str="";
		str+="Patrono: "+patrono;
		str+="\nKilos de carne: "+pesocarne;
		str+="\nPreço da carne:"+precocarne;
		str+="\nLitros de chopp"+chopplts;
		str+="\nPreço do chopp"+chopppreco;
		
		JOptionPane.showMessageDialog(null, str);
	}
}
