package comp;

import javax.swing.JOptionPane;

public class compS{
	private String cidade;
	private String banda;
	private double qtdbarracas;
	private double aluguel;
	private double receita;
	private compF fest;
	public compS(){
		fest= new compF();
		this.cidade="";
		this.banda="";
		this.qtdbarracas=0;
		this.aluguel=0;
		this.receita=0;
	}
	
	public void leitura(){
		this.cidade=JOptionPane.showInputDialog("Cidade: \n");
		this.banda=JOptionPane.showInputDialog("Banda: \n");
		this.qtdbarracas=Double.parseDouble(JOptionPane.showInputDialog("Quantidade de barracas: \n"));
		this.aluguel=Double.parseDouble(JOptionPane.showInputDialog("Preço do aluguel: \n"));
		fest.leitura();
	}
	
	public double calcreceita(){
		receita=qtdbarracas*aluguel;
		receita+=fest.calcula();
		return receita;
	}
	
	public void print(){
		String str="";
		str+="Cidade: "+cidade;
		str+="\nBanda: "+banda;
		str+="\nQuantidade de barracas: "+qtdbarracas;
		str+="\nAluguel: "+aluguel;
		str+="\nReceita: "+receita;
		JOptionPane.showMessageDialog(null,str);
		fest.imprime();
	}
}