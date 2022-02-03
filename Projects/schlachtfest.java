import javax.swing.JOptionPane;

public class schlachtfest extends fest{
	private String cidade;
	private String banda;
	private double qtdbarracas;
	private double aluguel;
	private double receita;
	
	public schlachtfest(){
		super();
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
		super.leitura();
	}
	
	public double calcreceita(){
		receita=qtdbarracas*aluguel;
		receita+=super.calcula();
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
		super.imprime();
	}
}
